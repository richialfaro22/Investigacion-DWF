package com.befit.befit.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MembershipDTO {

    private Long id;

    private String name;

    private Integer durationMonths;

    private Double price;

}
