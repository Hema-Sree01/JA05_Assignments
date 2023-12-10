package com.hexaware.cricketteam.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.cricketteam.dto.PlayerDTO;
import com.hexaware.cricketteam.entity.Player;
import com.hexaware.cricketteam.repository.PlayerRepository;


@Service
public class PlayerServiceImp implements IPlayerService {
	@Autowired
	PlayerRepository repository;
	

	@Override
	public Player addPlayer(PlayerDTO playerDTO) {
		Player player =new Player();
		player.setPlayerName(playerDTO.getPlayerName());
		player.setRole(playerDTO.getRole());
		player.setCountryName(playerDTO.getCountryName());
		player.setDescription(playerDTO.getDescription());
		player.setTeamName(playerDTO.getTeamName());
		player.setTotalMatches(playerDTO.getTotalMatches());
		return repository.save(player);
	}

	@Override
	public List<Player> getAllPlayers() {
		
		return repository.findAll();
	}

	@Override
	public Player updateExistingPlayer(PlayerDTO playerDTO, int playerId) {
		Optional<Player>playerOpt=repository.findById(playerId);
		Player player =new Player();
		if(playerOpt.isPresent()) {
			player.setPlayerId(playerDTO.getPlayerId());
			player.setPlayerName(playerDTO.getPlayerName());
			player.setTotalMatches(playerDTO.getTotalMatches());
			player.setRole(playerDTO.getRole());
			player.setCountryName(playerDTO.getCountryName());
			player.setJerseyNumber(playerDTO.getJerseyNumber());
			player.setTeamName(playerDTO.getTeamName());
			player.setDescription(playerDTO.getDescription());
		}
		return repository.save(player);
	}

	


}

