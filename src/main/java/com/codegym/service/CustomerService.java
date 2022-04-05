package com.codegym.service;

import com.codegym.model.Customer;

import java.util.List;

// Định nghĩa các phương thức ở tầng Service để thao tác với đối tượng Customer.
public interface CustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void update(int id, Customer customer);

    void remove(int id);
}
