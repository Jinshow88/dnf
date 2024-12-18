package com.game.dnf.exception;

import com.game.dnf.exception.errorcode.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum UserErrorCode implements ErrorCode{

    NEU(HttpStatus.BAD_REQUEST, "존재하지 않는 유저입니다."),
    DB(HttpStatus.BAD_REQUEST, "저장된 유저 입니다.")








    ;

    private final HttpStatus httpStatus;
    private final String message;
}
