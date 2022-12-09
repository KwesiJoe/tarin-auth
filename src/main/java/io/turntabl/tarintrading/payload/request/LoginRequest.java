package io.turntabl.tarintrading.payload.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
@Setter @Getter
public class LoginRequest {
    @NotBlank
    private String email;

    @NotBlank
    private String password;
}
