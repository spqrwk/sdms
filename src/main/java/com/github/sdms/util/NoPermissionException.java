package com.github.sdms.util;

/**
 * 未登录异常
 * @author Charles7c
 * @date 2020年10月19日 上午11:47:21
 *
 */
public class NoPermissionException extends RuntimeException {

	public NoPermissionException() {
	}

	public NoPermissionException(String message) {
		super(message);
	}

}
