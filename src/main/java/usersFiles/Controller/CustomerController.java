package usersFiles.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import lombok.AllArgsConstructor;
import usersFiles.domain.model.CustomerDTO;
import usersFiles.service.CustomerService;

@RestController
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/customer")
    public List<CustomerDTO> getAllCustomer (){
        return customerService.showCustomer();
    }

    @PostMapping("/addCustomer")
    public CustomerDTO addCustomer(@RequestBody CustomerDTO customerDTO){
        return customerService.addCustomer(customerDTO);
    }

    @PutMapping("/updateCustomer/{customerId}")
    public CustomerDTO updateCustomer(@PathVariable(name = "customerId") int customerId, @RequestBody CustomerDTO customerDTO){
        return customerService.updateCustomer(customerId, customerDTO);
    }

    @DeleteMapping("/delete/{customerId}")
    public void deleteCustomer (@PathVariable(name = "customerId") int customerId){
        customerService.deleteCustomer(customerId);
    }
}
