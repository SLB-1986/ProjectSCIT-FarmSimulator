package usersFiles.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Table//(name = "customer")
public class CustomerEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer idCode;

    private Double expansesPerMonth;

    private Double VAT;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "otherId", referencedColumnName = "id")
    private String otherIdCode;

    @Builder.Default
    private LocalDate recordedDate = LocalDate.now();

    @CreatedDate
    private LocalDateTime createAt;

    @LastModifiedDate
    private LocalDateTime modifiedAt;

}
