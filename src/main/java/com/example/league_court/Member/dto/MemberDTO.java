package com.example.league_court.Member.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO {

    private String memberId;

    private String password;

    private String name;

    private String email;

    private String phone;

}
