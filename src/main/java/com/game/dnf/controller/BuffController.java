package com.game.dnf.controller;

import com.game.dnf.dto.request.buff.BuffAvatarRequestDto;
import com.game.dnf.dto.request.buff.BuffCreatureRequestDto;
import com.game.dnf.dto.request.buff.BuffEquipmentRequestDto;
import com.game.dnf.dto.response.buff.BuffAvatarResponseDto;
import com.game.dnf.dto.response.buff.BuffCreatureResponseDto;
import com.game.dnf.dto.response.buff.BuffEquipmentResponseDto;
import com.game.dnf.service.BuffService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.game.dnf.common.swagger.buff.BuffAvatarSwaggerDescription.BUFF_AVATAR_DESCRIPTION;
import static com.game.dnf.common.swagger.buff.BuffAvatarSwaggerDescription.BUFF_AVATAR_RESPONSE_ERROR_CODE;
import static com.game.dnf.common.swagger.buff.BuffEquipmentSwaggerDescription.BUFF_EQUIP_DESCRIPTION;
import static com.game.dnf.common.swagger.buff.BuffEquipmentSwaggerDescription.BUFF_EQUIP_RESPONSE_ERROR_CODE;
@RestController
@RequestMapping("api/buff")
@RequiredArgsConstructor
@Tag(name = "버프")
public class BuffController {
    private final BuffService service;

    @GetMapping("/buffEquipment")
    @Operation(summary = "버프 장비", description = BUFF_EQUIP_DESCRIPTION)
    @ApiResponse(responseCode = "200", description = BUFF_EQUIP_RESPONSE_ERROR_CODE,
            content = @Content(
                    mediaType = "application/json", schema = @Schema(implementation = BuffEquipmentResponseDto.class)))
    public ResponseEntity<?super BuffEquipmentResponseDto> getBuffEquipment(@ParameterObject @ModelAttribute BuffEquipmentRequestDto dto) {
        return service.buffEquipment(dto);
    }

    @GetMapping("/buffAvatar")
    @Operation(summary = "버프 아바타", description = BUFF_AVATAR_DESCRIPTION)
    @ApiResponse(responseCode = "200", description = BUFF_AVATAR_RESPONSE_ERROR_CODE,
            content = @Content(
                    mediaType = "application/json", schema = @Schema(implementation = BuffAvatarResponseDto.class)))
    public ResponseEntity<?super BuffAvatarResponseDto> getBuffAvatar(@ParameterObject @ModelAttribute BuffAvatarRequestDto dto) {
        return service.buffAvatar(dto);
    }

    @GetMapping("/buffCreature")
    @Operation(summary = "버프크리쳐", description = BUFF_AVATAR_DESCRIPTION)
    @ApiResponse(responseCode = "200", description = BUFF_AVATAR_RESPONSE_ERROR_CODE,
            content = @Content(
                    mediaType = "application/json", schema = @Schema(implementation = BuffCreatureResponseDto.class)))
    public ResponseEntity<?super BuffCreatureResponseDto> getBuffCreature(@ParameterObject @ModelAttribute BuffCreatureRequestDto dto) {
        return service.buffCreature(dto);
    }
}
