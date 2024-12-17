package com.game.dnf.dto.request.opendata;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchRequestDto {
    @JsonIgnore
    String apikey;

    String characterName;

    String serverName;
}
