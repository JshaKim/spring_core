package com.ohgiraffers.sectoin02.javaconfig;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Member;

@Configuration
public class ContextConfiguration {
    @Bean(name = "account")
    public Account accountGenerator() {
        return new PersonalAccount(20, "3333-03-2332323");
    }

    @Bean(name="member")
    public Member memberGenerator() {
        MemberDTO member = new MemberDTO();
        member.setSequence(1);
        member.setName("홍길동");
        member.setPhone("010-0000-0000");
        member.setEmail("dkjg@gmail.com");
        member.setPersonalAccount(accountGenerator());
        return member;
    }

}
