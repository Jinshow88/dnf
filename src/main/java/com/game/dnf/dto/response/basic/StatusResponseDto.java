package com.game.dnf.dto.response.basic;

import com.game.dnf.dto.ResponseDto;
import com.game.dnf.dto.object.StatusDto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static com.game.dnf.common.GlobalConst.SUCCESS_CODE;
import static com.game.dnf.common.GlobalConst.SUCCESS_MESSAGE;

    @Slf4j
    @Getter
    @Setter
    @SuperBuilder
    @ToString
    public class StatusResponseDto extends ResponseDto {
        String serverId;
        String characterId;
        String characterName;
        String level;
        String jobId;
        String jobGrowId;
        String jobName;
        String jobGrowName;
        String fame;


        private StatusResponseDto(StatusDto statusDto) {
            super(SUCCESS_CODE, SUCCESS_MESSAGE);
            this.serverId = statusDto.getServerId();
            this.characterId = statusDto.getCharacterId();
            this.characterName = statusDto.getCharacterName();
            this.level = statusDto.getLevel();
            this.jobId = statusDto.getJobId();
            this.jobGrowId = statusDto.getJobGrowId();
            this.jobName = statusDto.getJobName();
            this.jobGrowName = statusDto.getJobGrowName();
            this.fame = statusDto.getFame();


        }

        public static ResponseEntity<ResponseDto> success(StatusDto statusDto) {
            StatusResponseDto result = new StatusResponseDto(statusDto);
            return ResponseEntity.status(HttpStatus.OK).body(result);
        }
}
