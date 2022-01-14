package com.cleobrito.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cleobrito.dsmovie.entities.Score;
import com.cleobrito.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
