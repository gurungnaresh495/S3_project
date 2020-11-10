package com.shoppingcart.s3project.DAO;

import com.shoppingcart.s3project.Model.Product_details;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDetailsRepo extends JpaRepository<Product_details, Integer> {
}
