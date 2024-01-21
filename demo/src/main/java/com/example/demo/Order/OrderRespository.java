package com.example.demo.Order;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderRespository extends JpaRepository<Order, Integer> {

    List<Order> findByNoteContaining(String text);

}


