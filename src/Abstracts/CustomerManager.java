package Abstracts;

import Entities.Customer;

public class CustomerManager implements CustomerService{
    @Override
    public void add(Customer customer){

        System.out.println("Veri kaydedildi."+customer.getName());

    }
}
