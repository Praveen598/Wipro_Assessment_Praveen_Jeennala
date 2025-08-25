package com.cartservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cartservice.entity.Cart;
@Repository
public interface cartRepo extends JpaRepository<Cart, Long> {

}
