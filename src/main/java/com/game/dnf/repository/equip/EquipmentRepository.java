package com.game.dnf.repository.equip;

import com.game.dnf.entity.Avatar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentRepository extends JpaRepository<Avatar, Long> {
}
