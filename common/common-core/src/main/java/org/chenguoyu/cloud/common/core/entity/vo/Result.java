package org.chenguoyu.cloud.common.core.entity.vo;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.chenguoyu.cloud.common.core.exception.ErrorType;
import org.chenguoyu.cloud.common.core.exception.SystemErrorType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.Instant;
import java.time.ZonedDateTime;

/**
  * 
  * @author 陈国钰 on 2020-7-8.
  * @version 1.0
  */
@Data
@ApiModel(value = "Result", description = "返回结果封装")
public class Result<T> {
    public static final Integer SUCCESSFUL_CODE = 200;
    public static final String SUCCESSFUL_MESSAGE = "处理成功";
    /**
     * 返回代码
     */
    @ApiModelProperty(name = "code", value = "返回代码")
    private Integer code;
    /**
     * 是否成功
     */
    @ApiModelProperty(name = "success", value = "是否成功")
    private boolean success;
    /**
     * 请求结果生成时间戳
     */
    @ApiModelProperty(value = "请求结果生成时间戳")
    private Instant time;
    /**
     * 错误信息
     */
    @ApiModelProperty(name = "message", value = "错误信息")
    private String message;
    /**
     * 返回数据
     */
    @ApiModelProperty(name = "dto", value = "返回数据")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    public static <T> Result<T> success(T data) {
        return new Result<T>(SUCCESSFUL_CODE, true, SUCCESSFUL_MESSAGE, data);
    }


    public static Result<Void> success() {
        return new Result<Void>(SUCCESSFUL_CODE, true, SUCCESSFUL_MESSAGE);
    }


    public static Result<Void> fail(ErrorType errorType) {
        return new Result(errorType);
    }

    public static Result<Void> fail() {
        return new Result<Void>(SystemErrorType.SYSTEM_ERROR);
    }
    /**
     * 系统异常类并返回结果数据
     *
     * @param errorType
     * @param data
     * @return Result
     */
    public static <T> Result<T> fail(ErrorType errorType, T data) {
        return new Result<>(errorType, data);
    }

    public Result() {
    }


    /**
     * @param errorType
     * @param data
     */
    public Result(ErrorType errorType, T data) {
        this(errorType);
        this.data = data;
    }

    public Result(ErrorType errorType) {
        this.code = errorType.getCode();
        this.message = errorType.getMessage();
        this.success = false;
        this.time = ZonedDateTime.now().toInstant();
    }

    private Result(Integer code, boolean success, String message) {
        this.code = code;
        this.success = success;
        this.message = message;
        this.time = ZonedDateTime.now().toInstant();
    }

    private Result(Integer code, boolean success, String message, T data) {
        this.code = code;
        this.success = success;
        this.message = message;
        this.data = data;
        this.time = ZonedDateTime.now().toInstant();
    }
}
