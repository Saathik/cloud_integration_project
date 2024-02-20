package test.service;

import org.springframework.stereotype.Service;
import test.model.Team;
import test.repository.TeamRepository;

import java.util.List;

@Service
public class TeamService {

    public final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public List<Team> findAll() {
        return teamRepository.findAll();
    }

    public Team findById(Integer id) {
        return teamRepository.findById(id).orElse(null);
    }
}