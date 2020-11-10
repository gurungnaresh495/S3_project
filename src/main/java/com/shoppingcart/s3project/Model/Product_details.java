package com.shoppingcart.s3project.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;



@Data
@Entity
@Table(name = "product_details")
public class Product_details {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "product_details_id")
    private int product_details_id;

    @Column(name = "product_name")
    private String product_name;

    @Column(name ="quantity")
    private int quantity;

    @Column(name = "unit_price")
    private double unit_price;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id", nullable=false,unique=true)
    private Item item;
}
