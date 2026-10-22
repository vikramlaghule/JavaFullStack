package com.app.flipkart.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Orders {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int orderid;

	    @ManyToOne
	    @JoinColumn(name = "custid")
	    private Customers cust;

	    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	    private List<OrderItem> items = new ArrayList<>();

	    public int getOrderid() {
	        return orderid;
	    }

	    public void setOrderid(int orderid) {
	        this.orderid = orderid;
	    }

	    public Customers getCust() {
	        return cust;
	    }

	    public void setCust(Customers cust) {
	        this.cust = cust;
	    }

	    public List<OrderItem> getItems() {
	        return items;
	    }

	    public void setItems(List<OrderItem> items) {
	        this.items = items;
	    }
	
	
	
}
