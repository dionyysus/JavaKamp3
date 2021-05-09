package Concretes;

import Abstracts.CustomerCheckService;
import Abstracts.CustomerManager;
import Entities.Customer;

public class StarbucksCustomerManager extends CustomerManager {

    private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void add(Customer customer) {
        try {
            if(customerCheckService.checkIfRealPerson(customer)) {

                super.add(customer);
            }
            else {
                System.out.println("Not a valid person");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
