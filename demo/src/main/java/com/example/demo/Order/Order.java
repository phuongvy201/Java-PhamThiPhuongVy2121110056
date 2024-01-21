package com.example.demo.Order;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders") 
public class Order {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getDelivery_address() {
		return delivery_address;
	}
	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}
	public String getDelivery_name() {
		return delivery_name;
	}
	public void setDelivery_name(String delivery_name) {
		this.delivery_name = delivery_name;
	}
	public String getDelivery_phone() {
		return delivery_phone;
	}
	public void setDelivery_phone(String delivery_phone) {
		this.delivery_phone = delivery_phone;
	}
	public String getDelivery_email() {
		return delivery_email;
	}
	public void setDelivery_email(String delivery_email) {
		this.delivery_email = delivery_email;
	}
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	@Override
	public String toString() {
		return "Order [id=" + id + ", user_id=" + user_id + ", note=" + note + ", delivery_address=" + delivery_address
				+ ", delivery_name=" + delivery_name + ", delivery_phone="
				+ delivery_phone + ", delivery_email=" + delivery_email + "]";
	}
	private int user_id;
	private String note;
	private String delivery_address;
	private String delivery_name;
	private String delivery_phone;
	private String delivery_email;
	
}
