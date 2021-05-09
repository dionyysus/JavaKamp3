package Adapters;

import Abstracts.CustomerCheckService;
import Entities.Customer;
import MernisServiceAdapter.EVFKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {

        EVFKPSPublicSoap evfkpsPublicSoap = new EVFKPSPublicSoap();

        try {
            return evfkpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(customer.getNationalId()),customer.getName(),customer.getLastName(),
            customer.getDateofBirth().getYear());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }


}
