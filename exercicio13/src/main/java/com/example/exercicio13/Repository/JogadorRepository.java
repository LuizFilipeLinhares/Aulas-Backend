package com.example.exercicio13.Repository;

import com.example.exercicio13.Model.JogadorEntidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JogadorRepository extends JpaRepository<JogadorEntidade, UUID> {
}
