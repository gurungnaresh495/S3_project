package com.shoppingcart.s3project.Controller;

import com.shoppingcart.s3project.DAO.ProductDetailsRepo;
import com.shoppingcart.s3project.Model.Item;
import com.shoppingcart.s3project.Model.Product_details;
import com.shoppingcart.s3project.Service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private AppService appService;

    @GetMapping("/items")
    public List<Item> getHomePage()
    {
        return appService.getItems();
    }

    @GetMapping("/prodDetails")
    public List<Product_details> getProdDetails(){ return appService.getProdDetails();}

    @GetMapping("/")
    public String helloWorld()
    {
        return "Hello, world";
    }

    @PostMapping("/addItem")
    public String addItems(@RequestBody Item item)
    {
        appService.addItem(item);
        return "Added succesfully";
    }

    @PostMapping("/addProdDetail")
    public String addProductDetails(@RequestBody Product_details product_details)
    {
        appService.addProductDetails(product_details);
        return "Added succesfully";
    }

}
