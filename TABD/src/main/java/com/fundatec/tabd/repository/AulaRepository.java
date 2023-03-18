package com.fundatec.tabd.repository;

import com.fundatec.tabd.model.Aula;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AulaRepository extends MongoRepository<Aula, Integer> {
}
