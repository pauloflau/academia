package com.jmp.academia.dtos;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AcessoDto {
	private Integer id;
	private AlunoDto aluno;
	private LocalDateTime entrada;
	private LocalDateTime saida;
}
