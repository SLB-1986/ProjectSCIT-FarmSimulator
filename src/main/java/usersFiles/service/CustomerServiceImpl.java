package usersFiles.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import usersFiles.domain.entity.CustomerEntity;
import usersFiles.domain.model.CustomerDTO;
import usersFiles.mapper.CustomerDtoToCustomerEntityMapper;
import usersFiles.mapper.CustomerEntityToCustomerDtoMapper;
import usersFiles.repository.CustomerRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService{
    private final CustomerRepository customerRepository;
    private final CustomerDtoToCustomerEntityMapper customerDtoToCustomerEntityMapper;
    private final CustomerEntityToCustomerDtoMapper customerEntityToCustomerDtoMapper;

    @Override
    public List<CustomerDTO> showCustomer() {
        return customerRepository.findAll()
                .stream()
                .map(entity -> customerEntityToCustomerDtoMapper.mapEntityToDto(entity))
                .collect(Collectors.toList());
    }

    @Override
    public CustomerDTO addCustomer(CustomerDTO customerDTO){
        CustomerEntity customerEntity = customerDtoToCustomerEntityMapper.mapDtoToEntity(customerDTO);
        CustomerEntity saveEntity = customerRepository.save(customerEntity);
        return customerEntityToCustomerDtoMapper.mapEntityToDto(saveEntity);
    }

    @Override
    public CustomerDTO updateCustomer(int id, CustomerDTO customerDTO){
        CustomerEntity guest = (CustomerEntity) customerRepository.findById(id);
        guest.setName(customerDTO.getName());
        guest.setId(customerDTO.getId());
        guest.setIdCode(customerDTO.getIdCode());
        guest.setRecordedDate(customerDTO.getRecordedDate());
        guest.setCreateAt(customerDTO.getRecordedDate().atStartOfDay());
        guest.setExpansesPerMonth(customerDTO.getExpansesPerMonth());
        guest.setVAT(customerDTO.getVAT());
        CustomerEntity saveEntity = customerRepository.save(guest);
        return customerEntityToCustomerDtoMapper.mapEntityToDto(saveEntity);
    }

    @Override
    public void deleteCustomer(int deleteCustomerID){
        customerRepository.deleteById(deleteCustomerID);
    }
}
