package com.befit.befit.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name="members")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;

    @Column(nullable=false) private String fullName;

    @Column(nullable=false,unique=true) private String email;

    @Column(nullable=false) private String phone;

    @Column(nullable=false) private LocalDate registrationDate;

    @Column(nullable=false) private String status;

    @ManyToOne
    @JoinColumn(name="membership_id", nullable=false) private Membership membership;
}
