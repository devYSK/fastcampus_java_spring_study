package com.example.restaurant.naver;

import com.example.restaurant.naver.dto.SearchImageReq;
import com.example.restaurant.naver.dto.SearchImageRes;
import com.example.restaurant.naver.dto.SearchLocalReq;
import com.example.restaurant.naver.dto.SearchLocalRes;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NaverClientTest {


    @Autowired
    private NaverClient naverClient;


    @Test
    public void searchLocalTest() {
        SearchLocalReq search = new SearchLocalReq();

        search.setQuery("갈비찜");

        SearchLocalRes searchLocalRes = naverClient.searchLocal(search);

        System.out.println(searchLocalRes);
    }

    @Test
    public void searchImageTest() {
        SearchImageReq search = new SearchImageReq();

        search.setQuery("갈비찜");

        SearchImageRes searchImageRes = naverClient.imageSearch(search);

        System.out.println(searchImageRes);
    }

}