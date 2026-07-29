package com.befit.befit.application.service;

import com.befit.befit.domain.Member;
import com.befit.befit.infrastructure.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    // Obtener todos los miembros
    public List<Member> findAll() {
        return memberRepository.findAll();
    }

    // Buscar miembro por ID
    public Optional<Member> findById(Long id) {
        return memberRepository.findById(id);
    }

    // Guardar un miembro
    public Member save(Member member) {
        return memberRepository.save(member);
    }

    // Actualizar un miembro
    public Member update(Long id, Member member) {

        Member existingMember = memberRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Miembro no encontrado"));

        existingMember.setFullName(member.getFullName());
        existingMember.setEmail(member.getEmail());
        existingMember.setPhone(member.getPhone());
        existingMember.setRegistrationDate(member.getRegistrationDate());
        existingMember.setStatus(member.getStatus());
        existingMember.setMembership(member.getMembership());

        return memberRepository.save(existingMember);
    }

    // Eliminar un miembro
    public void delete(Long id) {
        memberRepository.deleteById(id);
    }

}
