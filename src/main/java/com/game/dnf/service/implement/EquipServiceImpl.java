package com.game.dnf.service.implement;

import com.game.dnf.dto.request.equip.*;
import com.game.dnf.dto.response.equip.*;
import com.game.dnf.repository.basic.BasicInfoRepository;
import com.game.dnf.repository.basic.SearchRepository;
import com.game.dnf.repository.basic.ServerIdRepository;
import com.game.dnf.service.EquipService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
