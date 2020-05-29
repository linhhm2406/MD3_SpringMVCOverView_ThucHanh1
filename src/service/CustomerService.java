package service;

import model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer getOne(Long id);
    void updateCustomer(Customer customer);
}
