package test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.model.Player;
import test.model.Team;

import java.util.List;

@RestController
public class WebService {

    private final TeamService teamService;
    private final PlayerService playerService;

    @Autowired
    public WebService(TeamService teamService, PlayerService playerService) {
        this.playerService = playerService;
        this.teamService = teamService;
    }

    @RequestMapping("/teams")
    public List<Team> getTeams() {
        return teamService.findAll();
    }

    @RequestMapping("/players")
    public List<Player> getPlayers() {
        return playerService.findAll();
    }

}
