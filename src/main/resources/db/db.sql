CREATE TABLE product (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         name VARCHAR(255) NOT NULL,
                         description VARCHAR(255) NOT NULL,
                         price DOUBLE NOT NULL,
                         quantity INT NOT NULL
);