package br.com.fiap.trafegos.controller;

import br.com.fiap.trafegos.model.Trafego;
import br.com.fiap.trafegos.service.TrafegoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trafegos")
public class TrafegoController {

    @Autowired
    private TrafegoService service;

    // POST: Criar um novo tráfego
    @PostMapping
    public Trafego salvar(@RequestBody @Valid Trafego trafego) {
        return service.salvar(trafego);
    }

    // GET: Buscar tráfego por ID (número de tráfego)
    @GetMapping("/{numeroTrafego}")
    public ResponseEntity<Trafego> buscarPorId(@PathVariable Long numeroTrafego) {
        return ResponseEntity.ok(service.buscarPorId(numeroTrafego));
    }

    // GET: Listar todos os tráfegos
    @GetMapping
    public ResponseEntity<List<Trafego>> listarTodos() {
        return ResponseEntity.ok(service.listarTodosOsTrafegos());
    }

    // DELETE: Deletar tráfego por ID
    @DeleteMapping("/{numeroTrafego}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarPorId(@PathVariable Long numeroTrafego) {
        service.deletarPorId(numeroTrafego);
    }

}
