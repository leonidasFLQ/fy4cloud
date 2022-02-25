package com.fy4cloud.exception;

/**
 * 只包装了 错误信息 的 {@link RuntimeException}.
 * 用于 {@link com.fy4cloud.exception.assertion.Assert} 中用于包装自定义异常信息
 * @author fy
 * @date 2022/2/25
 **/

public class WrapMessageException extends RuntimeException{

	public WrapMessageException(String msg) {
		super(msg);
	}

	public WrapMessageException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
