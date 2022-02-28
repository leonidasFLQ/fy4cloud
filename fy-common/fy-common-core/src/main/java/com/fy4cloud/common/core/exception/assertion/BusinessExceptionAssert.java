package com.fy4cloud.common.core.exception.assertion;

import cn.hutool.core.util.ArrayUtil;
import com.fy4cloud.common.core.constant.enums.IResponseCodeEnum;
import com.fy4cloud.common.core.exception.BaseException;
import com.fy4cloud.common.core.exception.BusinessException;

import java.text.MessageFormat;

/**
 * 业务异常断言接口
 * @author fy
 * @date 2022/2/25
 **/

public interface BusinessExceptionAssert extends IResponseCodeEnum, Assert{

	@Override
	default BaseException newException(Object... args) {
		String msg = this.getMsg();
		if (ArrayUtil.isNotEmpty(args)) {
			msg = MessageFormat.format(this.getMsg(), args);
		}

		return new BusinessException(this, args, msg);
	}

	@Override
	default BaseException newException(Throwable t, Object... args) {
		String msg = this.getMsg();
		if (ArrayUtil.isNotEmpty(args)) {
			msg = MessageFormat.format(this.getMsg(), args);
		}

		return new BusinessException(this, args, msg, t);
	}

}
