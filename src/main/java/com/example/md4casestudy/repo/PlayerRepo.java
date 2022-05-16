package com.example.md4casestudy.repo;

import com.example.md4casestudy.model.DTO.SearchPlayer;
import com.example.md4casestudy.model.player.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional
public interface PlayerRepo extends JpaRepository<Player,Long> {
    Optional<Player> findByUserId(Long user_id);

    @Modifying
    @Query(value = "select p1.name as player, p1.avatar as avatar, p1.dob as DoB,n.name as nationality,p.name as performance,p2.name as position,ps.name as status from player p1 join nationality n on n.id = p1.nationality_id join performance p on p.id = p1.performance_id join position p2 on p1.position_id = p2.id join player_status ps on p1.status_id = ps.id where p2.id =?1",nativeQuery = true)
    Iterable<SearchPlayer> findByPosition(Long position_id);
    @Modifying
    @Query(value = "select p1.name as player, p1.avatar as avatar, p1.dob as DoB,n.name as nationality,p.name as performance,p2.name as position,ps.name as status from player p1 join nationality n on n.id = p1.nationality_id join performance p on p.id = p1.performance_id join position p2 on p1.position_id = p2.id join player_status ps on p1.status_id = ps.id where ps.id =?1",nativeQuery = true)
    Iterable<SearchPlayer> findByStatus(Long status_id);
}
