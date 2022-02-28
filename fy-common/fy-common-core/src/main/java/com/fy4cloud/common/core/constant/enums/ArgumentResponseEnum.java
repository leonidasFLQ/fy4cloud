package com.fy4cloud.common.core.constant.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 参数校验异常错误码和错误信息枚举类
 * @author fy
 * @date 2022/2/25
 **/

@Getter
@AllArgsConstructor
public enum ArgumentResponseEnum {
	/**
	 * 绑定参数校验异常
	 */
	VALID_ERROR(-600, "参数校验异常"),

	;

	/**
	 * 返回码
	 */
	private int code;
	/**
	 * 返回消息
	 */
	private String msg;
}
