package com.game.dnf.controller;

import com.game.dnf.dto.request.basic.BasicRequestDto;
import com.game.dnf.dto.request.basic.SearchRequestDto;
import com.game.dnf.dto.request.basic.ServerIdRequestDto;
import com.game.dnf.dto.request.basic.StatusRequestDto;
import com.game.dnf.dto.request.buff.BuffAvatarRequestDto;
import com.game.dnf.dto.request.buff.BuffCreatureRequestDto;
import com.game.dnf.dto.request.buff.BuffEquipmentRequestDto;
import com.game.dnf.dto.response.basic.BasicResponseDto;
import com.game.dnf.dto.response.basic.SearchResponseDto;
import com.game.dnf.dto.response.basic.ServerIdResponseDto;
import com.game.dnf.dto.response.basic.StatusResponseDto;
import com.game.dnf.dto.response.buff.BuffAvatarResponseDto;
import com.game.dnf.dto.response.buff.BuffCreatureResponseDto;
import com.game.dnf.dto.response.buff.BuffEquipmentResponseDto;
import com.game.dnf.service.BasicService;
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

import static com.game.dnf.common.swagger.basic.BasicSwaggerDescription.BASIC_DESCRIPTION;
import static com.game.dnf.common.swagger.basic.BasicSwaggerDescription.BASIC_RESPONSE_ERROR_CODE;
import static com.game.dnf.common.swagger.basic.SearchSwaggerDescription.SEARCH_DESCRIPTION;
import static com.game.dnf.common.swagger.basic.SearchSwaggerDescription.SEARCH_RESPONSE_ERROR_CODE;
import static com.game.dnf.common.swagger.basic.ServerIdSwaggerDescription.SERVER_ID_DESCRIPTION;
import static com.game.dnf.common.swagger.basic.ServerIdSwaggerDescription.SERVER_ID_RESPONSE_ERROR_CODE;
import static com.game.dnf.common.swagger.basic.StatusSwaggerDescription.STATUS_DESCRIPTION;
import static com.game.dnf.common.swagger.basic.StatusSwaggerDescription.STATUS_RESPONSE_ERROR_CODE;
import static com.game.dnf.common.swagger.buff.BuffAvatarSwaggerDescription.BUFF_AVATAR_DESCRIPTION;
import static com.game.dnf.common.swagger.buff.BuffAvatarSwaggerDescription.BUFF_AVATAR_RESPONSE_ERROR_CODE;
import static com.game.dnf.common.swagger.buff.BuffEquipmentSwaggerDescription.BUFF_EQUIP_DESCRIPTION;
import static com.game.dnf.common.swagger.buff.BuffEquipmentSwaggerDescription.BUFF_EQUIP_RESPONSE_ERROR_CODE;

@RestController
@RequestMapping("api/basic")
@RequiredArgsConstructor
@Tag(name = "기본정보")
public class BasicController {
    private final BasicService service;

    @GetMapping("/server")
    @Operation(summary = "서버 불러오기", description = SERVER_ID_DESCRIPTION)
    @ApiResponse(responseCode = "200", description = SERVER_ID_RESPONSE_ERROR_CODE,
            content = @Content(
                    mediaType = "application/json", schema = @Schema(implementation = ServerIdResponseDto.class)))
    public ResponseEntity<?super ServerIdResponseDto> getServerId(@ParameterObject @ModelAttribute ServerIdRequestDto dto) {
        return service.serverId(dto);
    }

    @GetMapping("/search")
    @Operation(summary = "캐릭터 검색하기", description = SEARCH_DESCRIPTION)
    @ApiResponse(responseCode = "200", description = SEARCH_RESPONSE_ERROR_CODE,
            content = @Content(
                    mediaType = "application/json", schema = @Schema(implementation = SearchResponseDto.class)))
    public ResponseEntity<?super SearchResponseDto> getSearch(@ParameterObject @ModelAttribute SearchRequestDto dto) {
        return service.search(dto);
    }

    @GetMapping("/basic")
    @Operation(summary = "기본정보", description = BASIC_DESCRIPTION)
    @ApiResponse(responseCode = "200", description = BASIC_RESPONSE_ERROR_CODE,
            content = @Content(
                    mediaType = "application/json", schema = @Schema(implementation = BasicResponseDto.class)))
    public ResponseEntity<?super BasicResponseDto> getBasic(@ParameterObject @ModelAttribute BasicRequestDto dto) {
        return service.basic(dto);
    }

    @GetMapping("/status")
    @Operation(summary = "능력치 정보", description = STATUS_DESCRIPTION)
    @ApiResponse(responseCode = "200", description = STATUS_RESPONSE_ERROR_CODE,
            content = @Content(
                    mediaType = "application/json", schema = @Schema(implementation = StatusResponseDto.class)))
    public ResponseEntity<?super StatusResponseDto> getsStatus(@ParameterObject @ModelAttribute StatusRequestDto dto) {
        return service.status(dto);
    }
}
