package com.example.RideIt.service;

import com.example.RideIt.dto.request.CustomerRequest;
import com.example.RideIt.dto.response.CustomerResponse;
import com.example.RideIt.model.Customer;
import com.example.RideIt.repository.CustomerRepository;
import com.example.RideIt.transformer.CustomerTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

//    @Autowired
//    CustomerRepository customerRepository;

    private final CustomerRepository customerRepository;


    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerResponse addCustomer(CustomerRequest customerRequest) {

        Customer customer = CustomerTransformer.customerRequestToCustomer(customerRequest);
        // save the customer
        Customer savedCustomer = customerRepository.save(customer);
        // entity -> response dto
        return CustomerTransformer.customerToCustomerResponse(savedCustomer);
    }

}
