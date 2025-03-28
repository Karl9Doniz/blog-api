package com.andre.blog.services;

import com.andre.blog.domain.entities.Category;

import java.util.List;
import java.util.UUID;

public interface CategoryService {

    List<Category> listCategories();
    Category createCategory(Category category) throws IllegalAccessException;
    void deleteCategory(UUID id);
    Category getCategoryById(UUID id);
}
