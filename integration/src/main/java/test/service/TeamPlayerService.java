package test.service;

import org.springframework.stereotype.Service;
import test.model.Player;
import test.model.Team;
import test.model.TeamPlayer;
import test.repository.PlayerRepository;
import test.repository.TeamPlayerRepository;
import test.repository.TeamRepository;

@Service
public class TeamPlayerService {

    private final TeamPlayerRepository teamPlayerRepository;
    private final TeamRepository teamRepository;
    private final PlayerRepository playerRepository;

    public TeamPlayerService(TeamPlayerRepository teamPlayerRepository, TeamRepository teamRepository, PlayerRepository playerRepository) {
        this.teamPlayerRepository = teamPlayerRepository;
        this.teamRepository = teamRepository;
        this.playerRepository = playerRepository;
    }

    public TeamPlayer insertTeamPlayer(int teamId, int playerId) {
        TeamPlayer teamPlayer = new TeamPlayer();

        Player player = playerRepository.findById(playerId).orElse(null);;
        teamPlayer.setPlayer(player);

        Team team = teamRepository.findById(teamId).orElse(null);;
        teamPlayer.setTeam(team);
        return teamPlayerRepository.save(teamPlayer);
    }

}
