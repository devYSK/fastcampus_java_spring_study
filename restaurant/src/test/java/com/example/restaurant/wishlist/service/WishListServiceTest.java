package com.example.restaurant.wishlist.service;

import com.example.restaurant.naver.NaverClient;
import com.example.restaurant.naver.dto.SearchLocalReq;
import com.example.restaurant.naver.dto.SearchLocalRes;
import com.example.restaurant.service.WishListService;
import com.example.restaurant.wishlist.dto.WishListDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WishListServiceTest {

    @Autowired
    private WishListService wishListService;

    @Autowired
    private NaverClient naverClient;


    @Test
    public void searchTest() {

        SearchLocalReq search = new SearchLocalReq();

        search.setQuery("갈비집");

        SearchLocalRes result = naverClient.searchLocal(search);

        System.out.println(result);

        Assertions.assertNotNull(result.getCategory());
    }
}