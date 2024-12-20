package com.game.dnf.service;

import com.game.dnf.dto.request.basic.BasicRequestDto;
import com.game.dnf.dto.request.basic.SearchRequestDto;
import com.game.dnf.dto.request.basic.ServerIdRequestDto;
import com.game.dnf.dto.request.basic.StatusRequestDto;
import com.game.dnf.dto.response.basic.BasicResponseDto;
import com.game.dnf.dto.response.basic.SearchResponseDto;
import com.game.dnf.dto.response.basic.ServerIdResponseDto;
import com.game.dnf.dto.response.basic.StatusResponseDto;
import org.springframework.http.ResponseEntity;

public interface BasicService {

    ResponseEntity<? super ServerIdResponseDto> serverId(ServerIdRequestDto dto);

    ResponseEntity<? super SearchResponseDto> search(SearchRequestDto dto);

    ResponseEntity<? super BasicResponseDto> basic(BasicRequestDto dto);

    ResponseEntity<? super StatusResponseDto> status(StatusRequestDto dto);

}
