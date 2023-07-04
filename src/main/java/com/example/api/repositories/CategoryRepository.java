package com.example.api.repositories;

import com.example.api.models.entities.Category;
import org.springframework.data.repository.ListCrudRepository;

import java.util.UUID;

public interface CategoryRepository
    extends ListCrudRepository<Category, UUID> {
}
