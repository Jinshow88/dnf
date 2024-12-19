package com.game.dnf.repository.buff;

import com.game.dnf.entity.Avatar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuffEquipmentRepository extends JpaRepository<Avatar, Long> {
}
