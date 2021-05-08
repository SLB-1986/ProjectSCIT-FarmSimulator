package usersFiles.mapper;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import usersFiles.domain.entity.CustomerEntity;
import usersFiles.domain.model.CustomerDTO;

@Component
//@AllArgsConstructor
public class CustomerDtoToCustomerEntityMapper {
    public CustomerEntity mapDtoToEntity(CustomerDTO customerDTO){
    return CustomerEntity.builder()
                .id(customerDTO.getId())
                .name(customerDTO.getName())
                .idCode(customerDTO.getIdCode())
                .expansesPerMonth(customerDTO.getExpansesPerMonth())
                .VAT(customerDTO.getVAT())
                .otherIdCode(String.valueOf(customerDTO.getOtherId()))
                .recordedDate(customerDTO.getRecordedDate())
                .build();
    }
    
}
