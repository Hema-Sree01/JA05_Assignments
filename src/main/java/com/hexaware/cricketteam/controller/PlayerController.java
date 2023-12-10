package com.hexaware.cricketteam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.cricketteam.dto.PlayerDTO;
import com.hexaware.cricketteam.entity.Player;
import com.hexaware.cricketteam.exception.PlayerNotFoundException;
import com.hexaware.cricketteam.service.IPlayerService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;

@CrossOrigin("http://localhost:4200")
@RestController
	@RequestMapping("/players")
	public class PlayerController {
	    @Autowired
	  IPlayerService service;

	    @PostMapping(value = "/add",consumes ="application/json",produces ="application/json")
	   public Player addPlayer(@RequestBody PlayerDTO playerDTO) {
	       return service.addPlayer(playerDTO);
	    }


	    @GetMapping(value ="/getall")
	    public List<Player> getAllPlayers() {
	       return service.getAllPlayers();
	       
	    }
	    
	  @PutMapping(value ="/update/{playerId}",consumes ="application/json",produces="application/json")
	  public Player updatePlaer(@RequestBody PlayerDTO playerDTO , @PathVariable int playerId) {
		  
		  return service.updateExistingPlayer(playerDTO ,  playerId);
		  
	  }
	}

