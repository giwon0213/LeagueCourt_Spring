package com.example.league_court.Member.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

import com.example.league_court.Member.dto.EmailCheckDTO;
import com.example.league_court.Member.dto.MemberDTO;
import com.example.league_court.Member.service.MemberService;
import com.example.league_court.common.ResponseDTO;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequestMapping("/auth")
@RestController
@RequiredArgsConstructor
@Slf4j
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/email")
    public ResponseEntity<ResponseDTO> emailAuthentication(@RequestBody MemberDTO memberDTO) {

        System.out.println(memberDTO);

        String authCode = memberService.joinEmail(memberDTO.getEmail());

        System.out.println(authCode + "어스코드");

        return ResponseEntity.ok()
                .body(ResponseDTO.builder()
                        .status(HttpStatus.valueOf(HttpStatus.CREATED.value()))
                        .data(authCode)
                        .message("success")
                        .build());

    }

    @PostMapping("/authNumCheck")
    public ResponseEntity<ResponseDTO> checkAuthNum(@RequestBody EmailCheckDTO emailCheckDTO) {

        Boolean Checked = memberService.checkAuthNum(emailCheckDTO.getEmail(), emailCheckDTO.getAuthNum());

        return ResponseEntity.ok()
                .body(ResponseDTO.builder()
                        .status(HttpStatus.valueOf(HttpStatus.CREATED.value()))
                        .data(Checked)
                        .message("success")
                        .build());
    }

    @PostMapping("/signUp")
    public ResponseEntity<ResponseDTO> signUp(@RequestBody MemberDTO memberDTO) {
        
        
        


        return ResponseEntity.ok()
                .body(ResponseDTO.builder()
                        .status(HttpStatus.valueOf(HttpStatus.CREATED.value()))
                        .message("success")
                        .build());
    }

}
