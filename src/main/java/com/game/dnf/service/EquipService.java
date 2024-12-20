package com.game.dnf.service;

import com.game.dnf.dto.request.equip.*;
import com.game.dnf.dto.response.equip.*;
import org.springframework.http.ResponseEntity;

public interface EquipService {

    ResponseEntity<? super EquipmentResponseDto> equipment(EquipmentRequestDto dto);

    ResponseEntity<? super AvatarResponseDto> avatar(AvatarRequestDto dto);

    ResponseEntity<? super CreatureResponseDto> creature(CreatureRequestDto dto);

    ResponseEntity<? super FlagResponseDto> flag(FlagRequestDto dto);

    ResponseEntity<? super TalismanResponseDto> talisman(TalismanRequestDto dto);

    ResponseEntity<? super EquipmentTraitResponseDto> equipmentTrait(EquipmentTraitRequestDto dto);

}
