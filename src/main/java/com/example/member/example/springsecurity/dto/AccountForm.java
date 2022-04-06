package com.example.member.example.springsecurity.dto;

import com.example.member.example.springsecurity.domain.Account;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AccountForm {
    private Long id;
    private String name;
    private String password;
    private String email;
    private String role;

    @Builder
    public AccountForm(Long id, String username, String password, String email, String role){
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    public Account toEntity(){
        return Account.builder()
                .id(id)
                .name(name)
                .password(new BCryptPasswordEncoder().encode(password))
                .age(age)
                .role(role)
                .bulid();

    }
}
