package com.example.digitalmenu.controllers;

import com.example.digitalmenu.dtos.FoodRequestDTO;
import com.example.digitalmenu.dtos.FoodResponseDTO;
import com.example.digitalmenu.models.Food;
import com.example.digitalmenu.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;

    @PostMapping
    public ResponseEntity<?> saveFood(@RequestBody FoodRequestDTO data) {
        Food food = new Food(data);
        Food foodCreated = foodRepository.save(food);
        return ResponseEntity.status(HttpStatus.CREATED).body(foodCreated);
    }

    @GetMapping
    public List<FoodResponseDTO> getAll() {
        List<FoodResponseDTO> foods = foodRepository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foods;
    }

}
