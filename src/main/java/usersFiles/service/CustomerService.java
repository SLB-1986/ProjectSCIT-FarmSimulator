package usersFiles.service;

import usersFiles.domain.model.CustomerDTO;

import java.util.List;

public interface CustomerService {
    List<CustomerDTO> showCustomer ();
    CustomerDTO addCustomer(CustomerDTO customerDTO);
    CustomerDTO updateCustomer(int id, CustomerDTO customerDTO);
    void deleteCustomer(int deleteCustomerID);
}
