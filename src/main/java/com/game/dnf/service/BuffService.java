package com.game.dnf.service;

import com.game.dnf.dto.request.buff.BuffAvatarRequestDto;
import com.game.dnf.dto.request.buff.BuffCreatureRequestDto;
import com.game.dnf.dto.request.buff.BuffEquipmentRequestDto;
import com.game.dnf.dto.response.buff.BuffAvatarResponseDto;
import com.game.dnf.dto.response.buff.BuffCreatureResponseDto;
import com.game.dnf.dto.response.buff.BuffEquipmentResponseDto;
import org.springframework.http.ResponseEntity;

public interface BuffService {

    ResponseEntity<? super BuffEquipmentResponseDto> buffEquipment(BuffEquipmentRequestDto dto);

    ResponseEntity<? super BuffAvatarResponseDto> buffAvatar(BuffAvatarRequestDto dto);

    ResponseEntity<? super BuffCreatureResponseDto> buffCreature(BuffCreatureRequestDto dto);
}
