package com.jmp.academia.entity;

import java.time.LocalDate;

import com.jmp.academia.enums.Sexo;
import com.jmp.academia.enums.Situacao;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Aluno {
    
	@EqualsAndHashCode.Include
	private String matricula;
    
	private String nome;
	private Sexo sexo;
	private Integer rg;
	private LocalDate dataNascimento;
	private Situacao situacao;
	private String email;
	private Endereco endereco = new Endereco();
	private Telefone telefone = new Telefone();
}
