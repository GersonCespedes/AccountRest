package com.grupo04.customer.service;

import com.grupo04.customer.controllers.PersonalRestController;
import com.grupo04.customer.models.CustomerPersonal;
import com.grupo04.customer.repository.CustomerPersonalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerPersonalService implements ICustomerPersonalService {
	
    @Autowired
    private CustomerPersonalRepository repository;
    
    @Override
    public Flux<CustomerPersonal> findAll() {
        return repository.findAll();
    }
    @Override
    public Mono<CustomerPersonal> findById(String id) {
        return repository.findById(id);
    }
    @Override
    public Flux<CustomerPersonal> findByDni(String dni) {
        return repository.findByDni(dni);
    }
    @Override
    public Mono<CustomerPersonal> save(CustomerPersonal customer) {
        return repository.save(customer);
    }
    @Override
    public Mono<Void> delete(CustomerPersonal customer) {
        return repository.delete(customer);
    }
}
