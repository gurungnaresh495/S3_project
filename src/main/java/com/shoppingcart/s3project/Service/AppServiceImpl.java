package com.shoppingcart.s3project.Service;

import com.shoppingcart.s3project.DAO.ItemRepo;
import com.shoppingcart.s3project.DAO.ProductDetailsRepo;
import com.shoppingcart.s3project.Model.Item;
import com.shoppingcart.s3project.Model.Product_details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AppServiceImpl implements AppService {

    @Autowired
    private ItemRepo itemRepo;

    @Autowired
    private ProductDetailsRepo productDetailsRepo;

    @Override
    public void addItem(Item item) {
        itemRepo.save(item);
    }

    @Override
    public void addProductDetails(Product_details product_details) {
        productDetailsRepo.save(product_details);
    }

    @Override
    public List<Item> getItems() {
        return itemRepo.findAll();
    }

    @Override
    public List<Product_details> getProdDetails() {
        return productDetailsRepo.findAll();
    }
}
