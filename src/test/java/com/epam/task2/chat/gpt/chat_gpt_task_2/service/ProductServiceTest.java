package com.epam.task2.chat.gpt.chat_gpt_task_2.service;

import com.epam.task2.chat.gpt.chat_gpt_task_2.model.Product;
import com.epam.task2.chat.gpt.chat_gpt_task_2.repo.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
 class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    private Product product;

    @BeforeEach
    void setUp() {
        product = new Product();
        product.setId(1L);
        product.setName("Test Product");
        product.setDescription("Description");
        product.setPrice(99.99);
        product.setQuantity(10);
    }

    @Test
    void getAllProducts_ShouldReturnProductList() {
        when(productRepository.findAll()).thenReturn(List.of(product));

        List<Product> productList = productService.getAllProducts();

        assertNotNull(productList);
        assertEquals(1, productList.size());
        assertEquals("Test Product", productList.get(0).getName());
    }

    @Test
    void getProductById_ProductExists_ShouldReturnProduct() {

        when(productRepository.findById(1L)).thenReturn(Optional.of(product));

        Product foundProduct = productService.getProductById(1L);

        assertNotNull(foundProduct);
        assertEquals("Test Product", foundProduct.getName());
    }

    @Test
    void getProductById_ProductNotExists_ShouldReturnNull() {

        when(productRepository.findById(1L)).thenReturn(Optional.empty());

        Product foundProduct = productService.getProductById(1L);

        assertNull(foundProduct);
    }

    @Test
    void addProduct_ShouldReturnSavedProduct() {

        when(productRepository.save(any(Product.class))).thenReturn(product);


        Product savedProduct = productService.addProduct(product);


        assertNotNull(savedProduct);
        assertEquals("Test Product", savedProduct.getName());
    }

    @Test
    void updateProduct_ProductExists_ShouldReturnUpdatedProduct() {

        when(productRepository.findById(1L)).thenReturn(Optional.of(product));
        when(productRepository.save(any(Product.class))).thenReturn(product);


        product.setName("Updated Product");
        Product updatedProduct = productService.updateProduct(1L, product);


        assertNotNull(updatedProduct);
        assertEquals("Updated Product", updatedProduct.getName());
    }

    @Test
    void updateProduct_ProductNotExists_ShouldReturnNull() {

        when(productRepository.findById(1L)).thenReturn(Optional.empty());

        Product updatedProduct = productService.updateProduct(1L, product);

        assertNull(updatedProduct);
    }
}
