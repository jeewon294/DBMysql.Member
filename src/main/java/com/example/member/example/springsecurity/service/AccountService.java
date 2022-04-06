package com.example.member.example.springsecurity.service;

import com.example.member.example.springsecurity.domain.Account;
import com.example.member.example.springsecurity.dto.AccountForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class AccountService {

    private final AcconutRepository accountRepository;

    @Transactional
    public Long createUser(AccountForm form){
        Account account = form.toEntity();
        accountRepository.save(account);
        return account.getId();
    }
}

//https://dkyou.tistory.com/17 참고