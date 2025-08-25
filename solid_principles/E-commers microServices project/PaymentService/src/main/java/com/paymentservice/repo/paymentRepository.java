package com.paymentservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paymentservice.entity.Payment;
@Repository
public interface paymentRepository extends JpaRepository<Payment, Long> {

	Long save(Long price);

}
