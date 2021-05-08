package usersFiles.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
    private Integer id;

    @NotBlank
    private String name;

    private Integer idCode;

    @Min(0)
    @Max(value = 10000, message = "Expanses must be lower or equal to 10000.")
    private Double expansesPerMonth;

    @NotNull(message =  "VAT value must be provided for update, with a maximum value of 60%, and minimum as 0(zero).")
    @Max(60)
    @Min(0)
    private Double VAT;

    private Integer otherId;

    @Builder.Default
    private LocalDate recordedDate = LocalDate.now();

}
