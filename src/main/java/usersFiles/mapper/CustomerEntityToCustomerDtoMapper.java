package usersFiles.mapper;

import org.springframework.stereotype.Component;
import usersFiles.domain.entity.CustomerEntity;
import usersFiles.domain.model.CustomerDTO;

@Component

public class CustomerEntityToCustomerDtoMapper {
    public CustomerDTO mapEntityToDto(CustomerEntity entity){
        return  CustomerDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .idCode(entity.getIdCode())
                .expansesPerMonth(entity.getExpansesPerMonth())
                .VAT(entity.getVAT())
                .otherId(Integer.valueOf(entity.getOtherIdCode()))
                .recordedDate(entity.getRecordedDate())
                .build();
    }
}
