package test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.model.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {

}