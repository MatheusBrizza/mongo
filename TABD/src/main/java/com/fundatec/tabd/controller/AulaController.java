package com.fundatec.tabd.controller;

import com.fundatec.tabd.model.Aula;
import com.fundatec.tabd.service.AulaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "aulas")
public class AulaController {

    private AulaService aulaService;

    public AulaController(AulaService aulaService) {
        this.aulaService = aulaService;
    }

    @PostMapping
    public ResponseEntity<?> criarAula(@RequestBody Aula aula) {
        aulaService.criarAula(aula);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Optional<Aula>> buscarAulaPorId(@PathVariable("id") Integer id) {
        Optional<Aula> aula = aulaService.buscarPorId(id);
        return ResponseEntity.status(HttpStatus.OK).body(aula);
    }

    @DeleteMapping("/id")
    public ResponseEntity<Void> deletarAulaPorId(@PathVariable("id") Integer id) {
        aulaService.deletarPorId(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(null);
    }
}
