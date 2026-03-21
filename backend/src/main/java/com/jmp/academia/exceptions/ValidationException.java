package com.jmp.academia.exceptions;

@SuppressWarnings("serial")
public class ValidationException extends RuntimeException{
	public ValidationException(String msg) {//construtor recebendo msg
		super(msg);
	}
}
