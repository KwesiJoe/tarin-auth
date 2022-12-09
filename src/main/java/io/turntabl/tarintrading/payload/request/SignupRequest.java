package io.turntabl.tarintrading.payload.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;
import java.util.Set;

@Setter @Getter
public class SignupRequest {
    @NotBlank
    @Size(min = 3, max = 20)
    private String firstName;

    @NotBlank
    @Size(min = 3, max = 20)
    private String lastName;

    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

    private Set<String> role;
    @NotBlank
    @Size(min = 6, max = 40)
    private String password;
}
