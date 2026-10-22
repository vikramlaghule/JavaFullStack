package com.app.flipkart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int productid;

private String productname;

private double price;

public Product() {
    // Required by JPA
}

public int getProductid() {
    return productid;
}

public void setProductid(int productid) {
    this.productid = productid;
}

public String getProductname() {
    return productname;
}

public void setProductname(String productname) {
    this.productname = productname;
}

public double getPrice() {
    return price;
}

public void setPrice(double price) {
    this.price = price;
}


}
