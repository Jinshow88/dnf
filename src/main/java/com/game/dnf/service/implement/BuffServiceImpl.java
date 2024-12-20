package com.game.dnf.service.implement;

import com.game.dnf.dto.request.buff.BuffAvatarRequestDto;
import com.game.dnf.dto.request.buff.BuffCreatureRequestDto;
import com.game.dnf.dto.request.buff.BuffEquipmentRequestDto;
import com.game.dnf.dto.response.buff.BuffAvatarResponseDto;
import com.game.dnf.dto.response.buff.BuffCreatureResponseDto;
import com.game.dnf.dto.response.buff.BuffEquipmentResponseDto;
import com.game.dnf.repository.basic.BasicInfoRepository;
import com.game.dnf.repository.basic.SearchRepository;
import com.game.dnf.repository.basic.ServerIdRepository;
import com.game.dnf.service.BuffService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class BuffServiceImpl implements BuffService {
    private final String API_URL = "https://api.neople.co.kr/df/servers";
    private final String API_KEY = "Q08kMP1vfysTkL6kPjK4W5Z8ZQtKMI3K";

    private final ServerIdRepository serverIdRepository;
    private final SearchRepository searchRepository;
    private final BasicInfoRepository basicInFoRepository;


    //버프 장비
    @Override
    @Transactional
    public ResponseEntity<? super BuffEquipmentResponseDto> buffEquipment(BuffEquipmentRequestDto dto) {
        return null;
    }

    //버프 아바타
    @Override
    @Transactional
    public ResponseEntity<? super BuffAvatarResponseDto> buffAvatar(BuffAvatarRequestDto dto) {
        return null;
    }

    //버프크리쳐
    @Override
    @Transactional
    public ResponseEntity<? super BuffCreatureResponseDto> buffCreature(BuffCreatureRequestDto dto) {
        return null;
    }

}
