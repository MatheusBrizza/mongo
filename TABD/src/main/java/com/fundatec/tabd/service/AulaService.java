package com.fundatec.tabd.service;

import com.fundatec.tabd.model.Aula;
import com.fundatec.tabd.repository.AulaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AulaService {

    private AulaRepository aulaRepository;

    public AulaService(AulaRepository aulaRepository) {
        this.aulaRepository = aulaRepository;
    }

    public void criarAula(Aula aula) {
        aulaRepository.save(aula);
    }

    public Optional<Aula> buscarPorId(Integer id) {
        return aulaRepository.findById(id);
    }

    public void deletarPorId(Integer id) {
        aulaRepository.deleteById(id);
    }

}
