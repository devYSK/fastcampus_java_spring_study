package com.example.restaurant.wishlist.repository;

import com.example.restaurant.repository.WishListRepository;
import com.example.restaurant.wishlist.WishListEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WishListRepositoryTest {

    @Autowired
    private WishListRepository wishListRepository;



    private WishListEntity create() {
        WishListEntity wishListEntity = new WishListEntity();
        wishListEntity.setTitle("title");
        wishListEntity.setCategory("category");
        wishListEntity.setAddress("address");
        wishListEntity.setReadAddress("readAddress");
        wishListEntity.setHomePageLink("");
        wishListEntity.setImageLink("");
        wishListEntity.setVisit(false);
        wishListEntity.setVisitCount(0);
        wishListEntity.setLastVisitDate(null);

        return wishListEntity;
    }


    @Test
    public void saveTest() {
        WishListEntity wishListEntity = create();

        WishListEntity expected = wishListRepository.save(wishListEntity);

        Assertions.assertNotNull(expected);
        Assertions.assertEquals(1, expected.getIndex());
    }

    @Test
    public void findByIdTest() {

    }

    @Test
    public void deleteTest() {

    }

    @Test
    public void listAllTest() {

    }
}
