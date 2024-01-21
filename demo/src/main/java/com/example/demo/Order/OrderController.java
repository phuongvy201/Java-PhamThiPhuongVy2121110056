package com.example.demo.Order;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.User.User;





@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3000")
public class OrderController {
	@Autowired
	OrderRespository ordersRespository;
	   @GetMapping("/orders")
	    public List<Order> index(){
	        return ordersRespository.findAll();
	    }
	   @PostMapping("/order")
	    public Order create(@RequestBody Order order) {
	        return ordersRespository.save(order);
	   }
}
