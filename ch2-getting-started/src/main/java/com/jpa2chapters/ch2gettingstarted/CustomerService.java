package com.jpa2chapters.ch2gettingstarted;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class CustomerService {
    protected EntityManager entityManager;

    public CustomerService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Customer createCustomer(int id, String name, double length) {
        Customer customer = new Customer(id);
        customer.setName(name);
        customer.setLength(length);
        entityManager.persist(customer);
        return customer;
    }

    public void removeCustomer(int id) {
        Customer customer = findCustomer(id);
        if (customer != null) {
            entityManager.remove(customer);
        }
    }
    public Customer changeCustomerLength(int id, double change) {
        Customer customer = entityManager.find(Customer.class, id);
        if (customer != null) {
            customer.setLength(change);
        }
        return customer;
    }
    public Customer findCustomer(int id) {
        return entityManager.find(Customer.class, id);
    }
    public List<Customer> findAllCustomers() {
        TypedQuery<Customer> query = entityManager.createQuery(
                "SELECT c FROM Customer c", Customer.class);
        return query.getResultList();
    }
}
