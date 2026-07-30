package com.befit.befit.mapper;

import com.befit.befit.domain.Member;
import com.befit.befit.domain.Membership;
import com.befit.befit.dto.MemberDTO;

public class MemberMapper {

    public static MemberDTO toDTO(Member member) {

        return MemberDTO.builder()
                .id(member.getId())
                .fullName(member.getFullName())
                .email(member.getEmail())
                .phone(member.getPhone())
                .registrationDate(member.getRegistrationDate())
                .status(member.getStatus())
                .membershipId(member.getMembership().getId())
                .build();
    }

    public static Member toEntity(MemberDTO dto) {

        Membership membership = new Membership();
        membership.setId(dto.getMembershipId());

        return Member.builder()
                .id(dto.getId())
                .fullName(dto.getFullName())
                .email(dto.getEmail())
                .phone(dto.getPhone())
                .registrationDate(dto.getRegistrationDate())
                .status(dto.getStatus())
                .membership(membership)
                .build();
    }

}
