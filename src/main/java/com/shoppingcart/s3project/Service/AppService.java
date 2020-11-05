package com.shoppingcart.s3project.Service;

import com.shoppingcart.s3project.Model.Item;

import java.util.List;

public interface AppService {

    public void addItem(Item item);

    public List<Item> getItems();
}
