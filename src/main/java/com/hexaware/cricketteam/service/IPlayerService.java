package com.hexaware.cricketteam.service;

import java.util.List;

import com.hexaware.cricketteam.dto.PlayerDTO;
import com.hexaware.cricketteam.entity.Player;



public interface IPlayerService {
	
	
	public Player addPlayer(PlayerDTO playerDTO);
	
	public List<Player> getAllPlayers();
	
	public Player updateExistingPlayer(PlayerDTO playerDTO ,int playerId);

}
