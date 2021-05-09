package com.company;

import Abstracts.CustomerManager;
import Concretes.StarbucksCustomerManager;
import Entities.Customer;
import Adapters.MernisServiceAdapter;


import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        CustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

        LocalDate date = LocalDate.of(2000,2,3);

        Customer customer = new Customer();
        customer.setName("Gizem");
        customer.setId(1);
        customer.setLastName("Coşkun");
        customer.setNationalId("13063408218");
        customer.setDateofBirth(date);
        customerManager.add(customer);
    }
}
