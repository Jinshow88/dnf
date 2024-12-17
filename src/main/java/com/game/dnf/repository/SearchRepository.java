package com.game.dnf.repository;


import com.game.dnf.entity.Search;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchRepository extends JpaRepository<Search, Long> {
    String findByCharacterId(String characterName);


    @Query(
            value =
                    "SELECT server_id " +
                            "FROM server " +
                            "WHERE server_name = :serverName ",
            nativeQuery = true
    )
    String findByServerId(String serverName);
}
