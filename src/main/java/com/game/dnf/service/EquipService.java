package com.game.dnf.service;


import com.game.dnf.dto.request.basic.BasicRequestDto;
import com.game.dnf.dto.request.basic.SearchRequestDto;
import com.game.dnf.dto.request.basic.ServerIdRequestDto;
import com.game.dnf.dto.request.basic.StatusRequestDto;
import com.game.dnf.dto.request.buff.BuffAvatarRequestDto;
import com.game.dnf.dto.request.buff.BuffCreatureRequestDto;
import com.game.dnf.dto.request.buff.BuffEquipmentRequestDto;
import com.game.dnf.dto.request.equip.*;
import com.game.dnf.dto.response.basic.BasicResponseDto;
import com.game.dnf.dto.response.basic.SearchResponseDto;
import com.game.dnf.dto.response.basic.ServerIdResponseDto;
import com.game.dnf.dto.response.basic.StatusResponseDto;
import com.game.dnf.dto.response.buff.BuffAvatarResponseDto;
import com.game.dnf.dto.response.buff.BuffCreatureResponseDto;
import com.game.dnf.dto.response.buff.BuffEquipmentResponseDto;
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
