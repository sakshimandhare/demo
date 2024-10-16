package com.example.demo.services;
import com.example.demo.models.Category;
import com.example.demo.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

	 @Autowired
	    private CategoryRepository categoryRepository;

	    public Page<Category> getAllCategories(Pageable pageable) {
	        return categoryRepository.findAll(pageable);
	    }

	    public Category createCategory(Category category) {
	        return categoryRepository.save(category);
	    }

	    public Category getCategoryById(Long id) {
	        return categoryRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Category not found"));
	    }

	    public Category updateCategory(Long id, Category categoryDetails) {
	        Category category = getCategoryById(id);
	        category.setName(categoryDetails.getName());
	        return categoryRepository.save(category);
	    }

	    public void deleteCategory(Long id) {
	        Category category = getCategoryById(id);
	        categoryRepository.delete(category);
	    }
}
