package com.game.dnf.dto.response.basic;

import com.game.dnf.dto.ResponseDto;
import com.game.dnf.dto.object.StatusResult;
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


        private StatusResponseDto(StatusResult statusResult) {
            super(SUCCESS_CODE, SUCCESS_MESSAGE);
            this.serverId = statusResult.getServerId();
            this.characterId = statusResult.getCharacterId();
            this.characterName = statusResult.getCharacterName();
            this.level = statusResult.getLevel();
            this.jobId = statusResult.getJobId();
            this.jobGrowId = statusResult.getJobGrowId();
            this.jobName = statusResult.getJobName();
            this.jobGrowName = statusResult.getJobGrowName();
            this.fame = statusResult.getFame();


        }

        public static ResponseEntity<ResponseDto> success(StatusResult statusResult) {
            StatusResponseDto result = new StatusResponseDto(statusResult);
            return ResponseEntity.status(HttpStatus.OK).body(result);
        }
}
