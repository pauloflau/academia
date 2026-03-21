package com.jmp.academia.dtos;

import java.time.LocalDate;

import com.jmp.academia.enums.Sexo;
import com.jmp.academia.enums.Situacao;

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
public class AlunoDto {
    
	private String matricula;
	private String nome;
	private Sexo sexo;
	private Integer rg;
	private LocalDate dataNascimento;
	private Situacao situacao;
	private String email;
	private EnderecoDto endereco = new EnderecoDto();
	private TelefoneDto telefone = new TelefoneDto();
}
