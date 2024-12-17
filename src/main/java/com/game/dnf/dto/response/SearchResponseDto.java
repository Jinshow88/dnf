package com.game.dnf.dto.response;

import com.game.dnf.dto.object.SearchResult;
import com.game.dnf.dto.ResponseDto;
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
public class SearchResponseDto extends ResponseDto {
    String serverId;
    String characterId;
    String characterName;
    String level;
    String jobId;
    String jobGrowId;
    String jobName;
    String jobGrowName;
    String fame;


    private SearchResponseDto(SearchResult searchResult) {
        super(SUCCESS_CODE, SUCCESS_MESSAGE);
        this.serverId = searchResult.getServerId();
        this.characterId = searchResult.getCharacterId();
        this.characterName = searchResult.getCharacterName();
        this.level = searchResult.getLevel();
        this.jobId = searchResult.getJobId();
        this.jobGrowId = searchResult.getJobGrowId();
        this.jobName = searchResult.getJobName();
        this.jobGrowName = searchResult.getJobGrowName();
        this.fame = searchResult.getFame();


    }

    public static ResponseEntity<ResponseDto> success(SearchResult searchResult) {
        SearchResponseDto result = new SearchResponseDto(searchResult);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

}


