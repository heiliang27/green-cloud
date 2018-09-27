package com.green.constants.enums;

public enum HttpStatusEnum {
	OK(200, "操作成功"), INVALID_REQUEST(400, "参数错误"), UNAUTHORIZED(401, "没有权限"), FORBIDDEN(403, "禁止访问"), NOT_FOUND(404,
			"资源不存在");

	private final int status;
	private final String message;

	public static String getMessage(int status) {
		for (HttpStatusEnum c : HttpStatusEnum.values()) {
			if (c.getStatus() == status) {
				return c.getMessage();
			}
		}
		return null;
	}

	HttpStatusEnum(final int status, final String message) {
		this.status = status;
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public int getStatus() {
		return status;
	}
}
