package org.chenguoyu.cloud.authentication.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.chenguoyu.cloud.common.core.entity.vo.Result;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;

@JsonSerialize(using = CustomOauthExceptionSerializer.class)
class CustomOauthException extends OAuth2Exception {

    private final Result result;

    CustomOauthException(OAuth2Exception oAuth2Exception) {
        super(oAuth2Exception.getSummary(), oAuth2Exception);
        this.result = Result.fail(AuthErrorType.valueOf(oAuth2Exception.getOAuth2ErrorCode().toUpperCase()), oAuth2Exception);
    }

    public Result getResult() {
        return result;
    }
}