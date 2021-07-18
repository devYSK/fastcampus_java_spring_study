package com.example.restaurant.service;


import com.example.restaurant.naver.NaverClient;
import com.example.restaurant.naver.dto.SearchImageReq;
import com.example.restaurant.naver.dto.SearchImageRes;
import com.example.restaurant.naver.dto.SearchLocalReq;
import com.example.restaurant.naver.dto.SearchLocalRes;
import com.example.restaurant.wishlist.dto.WishListDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WishListService {

    private final NaverClient naverClient;

    public WishListDto search(String query) {

        // 지역검색
        SearchLocalReq searchLocalReq = new SearchLocalReq();

        searchLocalReq.setQuery(query);


        SearchLocalRes searchLocalRes = naverClient.searchLocal(searchLocalReq);

        if (searchLocalRes.getTotal() > 0) {
            SearchLocalRes.SearchLocalItem localItem = searchLocalRes.getItems().stream().findFirst().get();

            String imageQuery = localItem.getTitle().replaceAll("<[^>]*>", "");

            SearchImageReq searchImageReq = new SearchImageReq();
            searchImageReq.setQuery(imageQuery);

            SearchImageRes searchImageRes = naverClient.imageSearch(searchImageReq);

            if (searchImageRes.getTotal() > 0) {

                SearchImageRes.SearchImageItem imageItem = searchImageRes.getItems().stream().findFirst().get();

                WishListDto result = new WishListDto();

                result.setTitle(localItem.getTitle());
                result.setCategory(localItem.getCategory());
                result.setAddress(localItem.getAddress());
                result.setReadAddress(localItem.getRoadAddress());
                result.setImageLink(imageItem.getLink());
                result.setHomePageLink(localItem.getLink());

                return result;
            }

        }


        return new WishListDto();

        // 이미지검색

        // 결과를 리턴
    }

}
