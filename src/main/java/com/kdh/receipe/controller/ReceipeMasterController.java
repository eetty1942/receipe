package com.kdh.receipe.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "ingrientMaster")
@RestController
@RequestMapping("/master/ingredient")
public class ReceipeMasterController {

    // 모든 재료 조회하기
    @GetMapping(value = "/all")
    public void getAllIngredients() {

    }

    // Id 값에 해당하는 재료 삭제
    @DeleteMapping("/{id}")
    public void deleteIngredientById() {

    }


}
