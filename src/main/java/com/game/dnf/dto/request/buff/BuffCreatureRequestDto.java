package com.game.dnf.dto.request.buff;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BuffCreatureRequestDto {
    @JsonIgnore
    String apikey;
}
