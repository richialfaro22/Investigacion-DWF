package com.befit.befit.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "memberships")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Membership {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer durationMonths;

    @Column(nullable = false)
    private Double price;

}
