package com.jpa2chapters.ch2gettingstarted;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class CustomerTest {
    public static void main(String[] args) {
        // Use Slf4J for logging.
        Logger logger = LoggerFactory.getLogger(CustomerTest.class);
        logger.info("\n\n==================== Chapter 2 - Getting Started ====================\n\n" +
                "The following class CustomerTest will run CRUD operations through CustomerService class " +
                "using the entity class Customer.\n");

        // Create entity manager factory and entity manager
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("CustomerService");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        CustomerService customerService = new CustomerService(entityManager);

        // Create and persist a record.
        entityManager.getTransaction().begin();
        Customer customer = customerService.createCustomer(923, "Joe Baker", 180);
        entityManager.getTransaction().commit();
        logger.info("\n\nPersisted: " + customer.getName() + "\n");

        // Find the customer.
        customer = customerService.findCustomer(923);
        logger.info("\n\nFound: " + customer.getName() + "\n");

        // Find all.
        List<Customer> customers = customerService.findAllCustomers();
        for (Customer e : customers)
            logger.info("\n\nFound customer: " + e.getName() + "\n");

        // Update customer.
        entityManager.getTransaction().begin();
        customer = customerService.changeCustomerLength(923, 165);
        entityManager.getTransaction().commit();
        logger.info("\n\nUpdated: " + customer.getName() + "\n");

        // Remove customer.
        entityManager.getTransaction().begin();
        int customerId = 923;
        customerService.removeCustomer(customerId);
        entityManager.getTransaction().commit();
        logger.info("Removed Customer with id: " + customerId + "\n");

        // Close the entity manager and entity manager factory.
        entityManager.close();
        entityManagerFactory.close();
    }
}
