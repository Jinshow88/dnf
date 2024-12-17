package com.game.dnf.repository;

import com.game.dnf.entity.Avatar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TalismanRepository extends JpaRepository<Avatar, Long> {
}
