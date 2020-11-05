package com.shoppingcart.s3project.Service;

import com.shoppingcart.s3project.DAO.ItemRepo;
import com.shoppingcart.s3project.Model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AppServiceImpl implements AppService {

    @Autowired
    private ItemRepo itemRepo;

    @Override
    public void addItem(Item item) {

    }

    @Override
    public List<Item> getItems() {
        return itemRepo.findAll();
    }
}
