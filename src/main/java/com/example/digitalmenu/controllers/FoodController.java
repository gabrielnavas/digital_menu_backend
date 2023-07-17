package com.example.digitalmenu.controllers;

import com.example.digitalmenu.dtos.FoodResponseDTO;
import com.example.digitalmenu.models.Food;
import com.example.digitalmenu.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;

    @GetMapping
    public List<FoodResponseDTO> getAll() {
        List<FoodResponseDTO> foods = foodRepository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foods;
    }

}
