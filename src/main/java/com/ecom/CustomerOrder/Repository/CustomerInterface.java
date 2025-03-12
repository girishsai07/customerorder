package com.ecom.CustomerOrder.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ecom.CustomerOrder.Models.*;


public interface CustomerInterface extends JpaRepository<Customer,Long> { }