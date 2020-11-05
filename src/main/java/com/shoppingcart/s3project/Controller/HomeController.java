package com.shoppingcart.s3project.Controller;

import com.shoppingcart.s3project.Model.Item;
import com.shoppingcart.s3project.Service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private AppService appService;

    @GetMapping("/home")
    public List<Item> getHomePage()
    {
        return appService.getItems();
    }

    @PostMapping("/add")
    public String tryit()
    {
        return "Test";
    }
}
