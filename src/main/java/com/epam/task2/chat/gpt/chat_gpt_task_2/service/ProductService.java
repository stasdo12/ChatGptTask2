package com.epam.task2.chat.gpt.chat_gpt_task_2.service;

import com.epam.task2.chat.gpt.chat_gpt_task_2.model.Product;
import com.epam.task2.chat.gpt.chat_gpt_task_2.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product product) {
        Optional<Product> existingProduct = productRepository.findById(id);
        if (existingProduct.isPresent()) {
            product.setId(id);
            return productRepository.save(product);
        }
        return null;
    }
}
