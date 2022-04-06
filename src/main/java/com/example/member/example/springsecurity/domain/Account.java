package com.example.member.example.springsecurity.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Account {
    @Id
    @Column(name = "user_id")
    // SQL에서 자동생성 되도록 돕는 어노테이션
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String password;
    private String email;
    private String age;
    private String role;

    @Builder
    public Account(Long id, String username, String password, String email, String age, String role) {
        this.id = id;
        this.password = password;
        this.email = email;
        this.age = age;
        this.role = role;
    }
}
