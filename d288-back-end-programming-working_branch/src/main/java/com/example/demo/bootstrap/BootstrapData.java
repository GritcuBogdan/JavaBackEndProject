package com.example.demo.bootstrap;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entities.Customer;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class BootstrapData {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private DivisionRepository divisionRepository;

    @PostConstruct
    public void loadInitialData() {

        if(customerRepository.count() == 1) {



            Customer customer1 = new Customer();
            customer1.setFirstName("John");
            customer1.setLastName("Wick");
            customer1.setPostal_code("14135");
            customer1.setAddress("666 Street");
            customer1.setPhone("(555)555-1234");
            customer1.setDivision(divisionRepository.findAll().get(7));
            customer1.setCreate_date(new Date());
            customer1.setLast_update(new Date());

            Customer customer2 = new Customer();
            customer2.setFirstName("Michael");
            customer2.setLastName("Jackson");
            customer2.setPostal_code("69696");
            customer2.setAddress("333 Street");
            customer2.setPhone("(555)555-5678");
            customer2.setDivision(divisionRepository.findAll().get(7));
            customer2.setCreate_date(new Date());
            customer2.setLast_update(new Date());

            Customer customer3 = new Customer();
            customer3.setFirstName("John");
            customer3.setLastName("Smith");
            customer3.setPostal_code("12345");
            customer3.setAddress("111 Street");
            customer3.setPhone("(555)555-9111");
            customer3.setDivision(divisionRepository.findAll().get(5));
            customer3.setCreate_date(new Date());
            customer3.setLast_update(new Date());

            Customer customer4 = new Customer();
            customer4.setFirstName("Jhonny");
            customer4.setLastName("Sins");
            customer4.setPostal_code("45612");
            customer4.setPhone("(555)555-1134");
            customer4.setAddress("69 Street");
            customer4.setDivision(divisionRepository.findAll().get(2));
            customer4.setCreate_date(new Date());
            customer4.setLast_update(new Date());

            Customer customer5 = new Customer();
            customer5.setFirstName("Patrick");
            customer5.setLastName("Bateman");
            customer5.setPostal_code("65732");
            customer5.setAddress("999 Street");
            customer5.setPhone("(555)555-3131");
            customer5.setDivision(divisionRepository.findAll().get(3));
            customer5.setCreate_date(new Date());
            customer5.setLast_update(new Date());

            customerRepository.save(customer1);
            customerRepository.save(customer2);
            customerRepository.save(customer3);
            customerRepository.save(customer4);
            customerRepository.save(customer5);

            System.out.println("Sample customers added!");
        } else {
            System.out.println("Sample customers already exist!");
        }
    }
}