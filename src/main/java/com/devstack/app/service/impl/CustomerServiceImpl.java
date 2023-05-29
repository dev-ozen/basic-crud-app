package com.devstack.app.service.impl;

import com.devstack.app.dao.CustomerDao;
import com.devstack.app.entity.Customer;
import com.devstack.app.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*@component=>controller,repository,service*/
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public List<Customer> findAllCustomers() {
        return customerDao.findAllCustomers();
    }
}
