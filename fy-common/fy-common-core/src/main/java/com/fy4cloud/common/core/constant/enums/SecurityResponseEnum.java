package com.fy4cloud.common.core.constant.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 通用异常错误码和错误信息枚举类
 * @author fy
 * @date 2022/3/1
 **/

@Getter
@AllArgsConstructor
public enum SecurityResponseEnum {

	/**
	 * auth 鉴权user not found
	 */
	USER_NOT_FOUND(-701, "鉴权用户不存在."),
	;

	/**
	 * 异常错误码
	 */
	private int code;
	/**
	 * 异常错误信息
	 */
	private String msg;
}
