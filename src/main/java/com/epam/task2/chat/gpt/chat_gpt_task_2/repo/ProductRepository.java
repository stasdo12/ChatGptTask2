package com.epam.task2.chat.gpt.chat_gpt_task_2.repo;

import com.epam.task2.chat.gpt.chat_gpt_task_2.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
