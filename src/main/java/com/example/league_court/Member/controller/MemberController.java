package com.example.league_court.Member.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequestMapping("/login")
@RestController
@RequiredArgsConstructor
@Slf4j
public class MemberController {

    @GetMapping("/auth")
    public String test() {

        System.out.println("안녕");

        return "gdgd";
    }

}
