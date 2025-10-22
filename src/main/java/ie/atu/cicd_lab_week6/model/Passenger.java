package ie.atu.cicd_lab_week6.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@AllArgsConstructor @Builder
public class Passenger {
    @NotBlank @Size(max=40)
    private String passengerId;

    @NotBlank @Size(max=60)
    private String name;

    @NotBlank(message = "Email is required")                   // add prompt message
    @Email(message = "Email must be a valid address")                          // add error message
    private String email;
}
