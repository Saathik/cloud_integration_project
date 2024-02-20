package test.service;

import org.springframework.stereotype.Service;
import test.model.Player;
import test.repository.PlayerRepository;

import java.util.List;

@Service
public class PlayerService {
    
    public final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> findAll() {
        return playerRepository.findAll();
    }

    public Player findById(Integer id) {
        return playerRepository.findById(id).orElse(null);
    }
}