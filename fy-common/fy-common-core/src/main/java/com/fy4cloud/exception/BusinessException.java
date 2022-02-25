package com.fy4cloud.exception;

import com.fy4cloud.constant.enums.IResponseCodeEnum;

/**
 * 业务异常
 * 业务处理时，出现异常，可以抛出该异常
 * @author fy
 * @date 2022/2/25
 **/
public class BusinessException extends BaseException{

	private static final long serialVersionUID = 1L;

	public BusinessException(IResponseCodeEnum responseCodeEnum, Object[] args, String message) {
		super(responseCodeEnum, args, message);
	}

	public BusinessException(IResponseCodeEnum responseCodeEnum, Object[] args, String message, Throwable cause) {
		super(responseCodeEnum, args, message, cause);
	}
}
