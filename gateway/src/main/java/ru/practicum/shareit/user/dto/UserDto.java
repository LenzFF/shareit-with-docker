package ru.practicum.shareit.user.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class UserDto {

    @NotNull
    private int id;

    @Email
    @Pattern(regexp = ".+@.+\\..+")
    @NotNull
    private String email;

    @NotBlank
    private String name;
}
