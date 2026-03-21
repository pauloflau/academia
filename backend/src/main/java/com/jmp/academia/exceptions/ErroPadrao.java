package com.jmp.academia.exceptions;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ErroPadrao {
	private Instant horario;
	private Integer status;
	private String erro;
	private String mensagem;
	private String caminho;
}
