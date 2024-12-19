package com.game.dnf.dto.request.basic;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BasicRequestDto {
    @JsonIgnore
    String apikey;

    String characterName;

    String serverName;
    @JsonIgnore
    String characterId;
}
