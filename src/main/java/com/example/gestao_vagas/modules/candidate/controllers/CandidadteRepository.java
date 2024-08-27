package com.example.gestao_vagas.modules.candidate.controllers;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gestao_vagas.modules.candidate.CandidateEntity;

public interface CandidadteRepository extends JpaRepository<CandidateEntity, UUID> {
    
}
