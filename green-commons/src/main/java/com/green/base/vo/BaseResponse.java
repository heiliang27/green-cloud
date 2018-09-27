package com.green.base.vo;

import com.green.constants.enums.HttpStatusEnum;

public class BaseResponse<E> {

	private int status = HttpStatusEnum.OK.getStatus();
	private String message = HttpStatusEnum.OK.getMessage();
	E result;

	public BaseResponse(int statusCode, String message, E result) {
		this.status = statusCode;
		this.message = message;
		this.result = result;
	}

	public BaseResponse(int statusCode, E result) {
		this.status = statusCode;
		this.message = HttpStatusEnum.getMessage(statusCode);
		this.result = result;
	}

	public BaseResponse(int statusCode) {
		this(statusCode, null);
	}

	public BaseResponse(E result) {
		this.result = result;
	}

	public BaseResponse() {
	}

	public E getResult() {
		return result;
	}

	public void setResult(E result) {
		this.result = result;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
