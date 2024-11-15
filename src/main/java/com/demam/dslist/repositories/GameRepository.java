package com.demam.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demam.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
