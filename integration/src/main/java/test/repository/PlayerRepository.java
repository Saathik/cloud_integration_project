package test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.model.Player;

@Repository
public interface PlayerRepository  extends JpaRepository<Player, Integer> {

}