package com.game.dnf.repository;

import com.game.dnf.entity.Server;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServerIdRepository extends JpaRepository<Server, Long> {

}
