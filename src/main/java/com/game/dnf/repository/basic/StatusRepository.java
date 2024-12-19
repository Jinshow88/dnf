package com.game.dnf.repository.basic;

import com.game.dnf.entity.Avatar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends JpaRepository<Avatar, Long> {
}
