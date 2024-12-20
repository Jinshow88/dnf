package com.game.dnf.service.implement;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.game.dnf.dto.object.SearchResult;
import com.game.dnf.dto.object.ServerDto;
import com.game.dnf.dto.object.StatusDto;
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
import com.game.dnf.entity.BasicInfo;
import com.game.dnf.entity.Search;
import com.game.dnf.entity.Server;
import com.game.dnf.exception.CustomException;
import com.game.dnf.exception.UserErrorCode;
import com.game.dnf.repository.basic.BasicInfoRepository;
import com.game.dnf.repository.basic.SearchRepository;
import com.game.dnf.repository.basic.ServerIdRepository;
import com.game.dnf.service.EquipService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class EquipServiceImpl implements EquipService {
    // API URL과 API 키는 환경 변수로 관리
    private final String API_URL = "https://api.neople.co.kr/df/servers";
    private final String API_KEY = "Q08kMP1vfysTkL6kPjK4W5Z8ZQtKMI3K";

    private final ServerIdRepository serverIdRepository;
    private final SearchRepository searchRepository;
    private final BasicInfoRepository basicInFoRepository;


    //장비
    @Override
    @Transactional
    public ResponseEntity<? super EquipmentResponseDto> equipment(EquipmentRequestDto dto) {
        return null;
    }

    //아바타
    @Override
    @Transactional
    public ResponseEntity<? super AvatarResponseDto> avatar(AvatarRequestDto dto) {
        return null;
    }

    //크리쳐
    @Override
    @Transactional
    public ResponseEntity<? super CreatureResponseDto> creature(CreatureRequestDto dto) {
        return null;
    }

    //휘장
    @Override
    @Transactional
    public ResponseEntity<? super FlagResponseDto> flag(FlagRequestDto dto) {
        return null;
    }

    //탈리스만
    @Override
    @Transactional
    public ResponseEntity<? super TalismanResponseDto> talisman(TalismanRequestDto dto) {
        return null;
    }

    //장비특성
    @Override
    @Transactional
    public ResponseEntity<? super EquipmentTraitResponseDto> equipmentTrait(EquipmentTraitRequestDto dto) {
        return null;
    }

}
