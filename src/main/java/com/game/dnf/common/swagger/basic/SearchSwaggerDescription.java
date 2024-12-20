package com.game.dnf.common.swagger.basic;

public class SearchSwaggerDescription {

    public static final String SEARCH_DESCRIPTION =

            "<strong>캐릭터를 검색 합니다.</strong>" +
                    "<p>-------------------------------------------------------------------</p>" +
                    "<p>01. characterName : 캐릭터 닉네임 입력</p>" +
                    "<p>02. serverName : 서버 입력</p>"
            ;

    public static final String SEARCH_RESPONSE_ERROR_CODE =

            "<strong>발생 가능한 에러코드</strong>" +
                    "<p>CU - 미 로그인 (400)</p>" +
                    "<p>DBE - 데이터베이스 에러 (500)</p>"
            ;

}
