package com.generation.LojaPharma.controller;

import com.generation.LojaPharma.model.Usuario;
import com.generation.LojaPharma.repository.UsuarioRepository;
import com.generation.LojaPharma.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/all")
    public ResponseEntity<List<Usuario>> getAll(){
        return ResponseEntity.ok(usuarioRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getbyId(@PathVariable Long id){
        return ResponseEntity.ok(usuarioRepository.findById(id).get());

    }






}


