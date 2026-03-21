package com.jmp.academia.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionalHandler {

	@ExceptionHandler(ValidationException.class)
	public ResponseEntity<ErroPadrao> ValidationException(
			ValidationException e, 
			HttpServletRequest request 	// objeto padrao do java que vem a requsicao
	) {
		ErroPadrao err = new ErroPadrao();
		err.setHorario(Instant.now());
		err.setStatus(HttpStatus.BAD_REQUEST.value()); // especifico o erro 400
		err.setErro("Erro de validacao");
		err.setMensagem(e.getMessage());
		err.setCaminho(request.getRequestURI());// pega o caminho da minha requisicao

		// retorno o status BAD_REQUEST e no corpo a variavel err
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErroPadrao> handleGenericException(
			Exception e, 
			HttpServletRequest request
	) {
		ErroPadrao err = new ErroPadrao();
		err.setHorario(Instant.now());
		err.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
		err.setErro("Erro interno do servidor");
		err.setMensagem(e.getMessage());
		err.setCaminho(request.getRequestURI());

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(err);
	}

}
