package com.shoppingcart.s3project.Service;

import com.shoppingcart.s3project.Model.Item;
import com.shoppingcart.s3project.Model.Product_details;

import java.util.List;

public interface AppService {

    public void addItem(Item item);

    public void addProductDetails(Product_details product_details);

    public List<Item> getItems();

    public List<Product_details> getProdDetails();
}
