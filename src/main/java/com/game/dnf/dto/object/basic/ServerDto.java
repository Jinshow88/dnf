package com.game.dnf.dto.object.basic;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ServerDto {

    @Schema(example = "anton", description = "영어")
    private String serverId;
    @Schema(example = "안톤", description = "한글")
    private String serverName;

}