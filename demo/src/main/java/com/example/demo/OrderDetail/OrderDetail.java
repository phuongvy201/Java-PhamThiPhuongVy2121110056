package com.example.demo.OrderDetail;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orderdetail") 
public class OrderDetail {

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public double getQty() {
		return qty;
	}
	public void setQty(double qty) {
		this.qty = qty;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", order_id=" + order_id + ", product_id=" + product_id + ", qty=" + qty
				+ ", amount=" + amount + ", price=" + price + "]";
	}
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int order_id;
	private int product_id;
	private double qty;
	private double amount;
	private double price;
}
