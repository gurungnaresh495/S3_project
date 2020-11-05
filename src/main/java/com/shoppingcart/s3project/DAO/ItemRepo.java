package com.shoppingcart.s3project.DAO;

import com.shoppingcart.s3project.Model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Item, Integer> {
}
