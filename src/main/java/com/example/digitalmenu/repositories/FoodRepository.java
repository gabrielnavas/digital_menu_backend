package com.example.digitalmenu.repositories;

import com.example.digitalmenu.models.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
