package com.hexaware.cricketteam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.cricketteam.entity.Player;


@Repository
public interface PlayerRepository extends JpaRepository<Player , Integer>{

}
