package com.befit.befit.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class MemberDTO {
    private Long id;

    private String fullName;

    private String email;

    private String phone;

    private LocalDate registrationDate;

    private String status;

    private Long membershipId;
}
