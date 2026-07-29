package com.befit.befit.application.service;

import com.befit.befit.domain.Membership;
import com.befit.befit.infrastructure.repository.MembershipRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MembershipService {

    private final MembershipRepository membershipRepository;

    public MembershipService(MembershipRepository membershipRepository) {
        this.membershipRepository = membershipRepository;
    }

    // Obtener todas las membresías
    public List<Membership> findAll() {
        return membershipRepository.findAll();
    }

    // Buscar por ID
    public Optional<Membership> findById(Long id) {
        return membershipRepository.findById(id);
    }

    // Guardar una membresía
    public Membership save(Membership membership) {
        return membershipRepository.save(membership);
    }

    // Eliminar una membresía
    public void delete(Long id) {
        membershipRepository.deleteById(id);
    }
}