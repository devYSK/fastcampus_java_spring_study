package com.example.restaurant.controller;

import com.example.restaurant.service.WishListService;
import com.example.restaurant.wishlist.WishListEntity;
import com.example.restaurant.wishlist.dto.WishListDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/restaurant")
@RequiredArgsConstructor
public class ApiController {


    private final WishListService wishListService;


    @GetMapping("/search")
    public WishListDto search(@RequestParam String query) {
        return wishListService.search(query);
    }



    @PostMapping("")
    public WishListEntity add(@RequestBody WishListDto wishListDto) {
      log.info("{}", wishListDto);


      return wishListService.add(wishListDto);
    }

}
