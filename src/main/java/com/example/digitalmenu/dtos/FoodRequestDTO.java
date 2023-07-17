package com.example.digitalmenu.dtos;

import java.math.BigDecimal;

public record FoodRequestDTO(String title, String image, BigDecimal price) {
}
