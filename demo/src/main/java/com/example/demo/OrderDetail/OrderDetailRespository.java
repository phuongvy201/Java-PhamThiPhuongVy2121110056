package com.example.demo.OrderDetail;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface OrderDetailRespository extends JpaRepository<OrderDetail, Integer> {

    @Query("SELECT od FROM OrderDetail od WHERE CAST(od.price AS STRING) LIKE %:price%")
    List<OrderDetail> findByPriceContaining(@Param("price") String price);
}