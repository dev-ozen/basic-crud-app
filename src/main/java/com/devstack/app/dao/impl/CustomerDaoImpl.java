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

    @Override
    public void saveCustomer(Customer customer) {
        sessionFactory.getCurrentSession().save(customer);
    }

    @Override
    public Customer findCustomer(long id) {
        return sessionFactory.getCurrentSession().find(Customer.class,id);
    }
}
