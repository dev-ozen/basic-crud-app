package com.devstack.app.dao.impl;

import com.devstack.app.dao.CustomerDao;
import com.devstack.app.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Queue;

@Component
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Customer> findAllCustomers() {
        return sessionFactory.getCurrentSession()
                .createQuery("FROM Customer", Customer.class).getResultList();
    }
}
