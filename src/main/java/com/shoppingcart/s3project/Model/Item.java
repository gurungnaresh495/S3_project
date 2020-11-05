package com.shoppingcart.s3project.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name ="item")
public class Item {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name= "item_id")
    private int item_id;

    @Column(name ="item_name")
    private String item_name;

    @Column(name = "quantity")
    private int quantity;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Product_details> prod_details;

}
