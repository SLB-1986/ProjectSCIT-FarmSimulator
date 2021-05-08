package usersFiles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usersFiles.domain.entity.CustomerEntity;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {
    List<CustomerEntity> findById(int id);

}
