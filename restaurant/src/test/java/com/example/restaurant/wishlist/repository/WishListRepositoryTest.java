package com.example.restaurant.wishlist.repository;

import com.example.restaurant.repository.WishListRepository;
import com.example.restaurant.wishlist.WishListEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class WishListRepositoryTest {

    @Autowired
    private WishListRepository wishListRepository;


    private WishListEntity create() {
        WishListEntity wishListEntity = new WishListEntity();
        wishListEntity.setTitle("title");
        wishListEntity.setCategory("category");
        wishListEntity.setAddress("address");
        wishListEntity.setRoadAddress("readAddress");
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
    public void updateTest() {
        WishListEntity wishListEntity = create();

        WishListEntity expected = wishListRepository.save(wishListEntity);


        expected.setTitle("update test");
        WishListEntity saveEntity = wishListRepository.save(expected);

        Assertions.assertEquals("update test", saveEntity.getTitle());
        Assertions.assertEquals(1, wishListRepository.findAll().size());

    }
    @Test
    public void findByIdTest() {
        WishListEntity wishListEntity = create();
        wishListRepository.save(wishListEntity);

        Optional<WishListEntity> expected = wishListRepository.findById(1);

        Assertions.assertTrue(expected.isPresent());
        Assertions.assertEquals(1, expected.get().getIndex());
    }

    @Test
    public void deleteTest() {
        WishListEntity wishListEntity = create();

        wishListRepository.save(wishListEntity);

        wishListRepository.deleteById(1);

        int count = wishListRepository.findAll().size();

        Assertions.assertEquals(0, count);

    }

    @Test
    public void listAllTest() {
        wishListRepository.save(create());
        wishListRepository.save(create());

        int count = wishListRepository.findAll().size();

        Assertions.assertEquals(2, count);
    }
}
