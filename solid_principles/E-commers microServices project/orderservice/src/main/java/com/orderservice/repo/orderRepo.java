package com.orderservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orderservice.entity.Orders;
@Repository
public interface orderRepo extends JpaRepository<Orders, Long> {

}
