package com.example.gestao_vagas.modules.candidate.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gestao_vagas.exceptions.UserFoundException;
import com.example.gestao_vagas.modules.candidate.CandidadteRepository;
import com.example.gestao_vagas.modules.candidate.CandidateEntity;

@Service
public class CreateCandidateUseCase {

    @Autowired
    private CandidadteRepository candidadteRepository;

    public CandidateEntity execute(CandidateEntity candidateEntity) {
        this.candidadteRepository
            .findByUsernameOrEmail(candidateEntity.getUsername(), candidateEntity.getEmail())
            .ifPresent((user) -> {
                throw new UserFoundException();
            });
        return this.candidadteRepository.save(candidateEntity);
    }

}
