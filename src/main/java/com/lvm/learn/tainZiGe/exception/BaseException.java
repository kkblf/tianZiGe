package com.lvm.learn.tainZiGe.exception;

public class BaseException extends Exception {
	private String code;

	public BaseException() {
		super();
		this.code = ErrorCode.defaultCode;
	}

	public BaseException(String code, String message) {
		super(message);
		this.code = code;
	}

	public BaseException(String code, String message, Throwable cause) {
		super(message, cause);
		this.code = code;
	}

	public BaseException(String code, Throwable cause) {
		super(cause);
		this.code = code;
	}

	protected BaseException(String code,String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
