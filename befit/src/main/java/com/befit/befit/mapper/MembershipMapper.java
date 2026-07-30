package com.befit.befit.mapper;

import com.befit.befit.domain.Membership;
import com.befit.befit.dto.MembershipDTO;

public class MembershipMapper {

    public static MembershipDTO toDTO(Membership membership) {
        return MembershipDTO.builder()
                .id(membership.getId())
                .name(membership.getName())
                .durationMonths(membership.getDurationMonths())
                .price(membership.getPrice())
                .build();
    }

    public static Membership toEntity(MembershipDTO dto) {
        return Membership.builder()
                .id(dto.getId())
                .name(dto.getName())
                .durationMonths(dto.getDurationMonths())
                .price(dto.getPrice())
                .build();
    }

}
