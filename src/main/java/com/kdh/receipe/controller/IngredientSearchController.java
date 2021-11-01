package com.kdh.receipe.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "ingredient")
@RestController
@RequestMapping("/ingredient")
public class IngredientSearchController {

    // 카테고리별 재료 가져오기
    @GetMapping(value = "/category")
    public void getIngredientByCategory() {

    }

    // 인기 재료 가져오기
    @GetMapping(value = "/popular")
    public void getIngredientByPopular() {

    }

    // 검색 키워드 재료 가져오기
    @GetMapping(value = "/search")
    public void getIngredientBySearchKeyword() {

    }

}
