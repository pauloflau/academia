package com.jmp.academia.entity;

import java.time.LocalDate;

import com.jmp.academia.dtos.AlunoDto;
import com.jmp.academia.enums.Sexo;
import com.jmp.academia.enums.Situacao;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
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
    
	@Id
	@EqualsAndHashCode.Include
	@Column(name = "ID", nullable = false, length = 8)
	private String matricula;
    
	@Column(name = "NOME", nullable = false, length = 64)
	private String nome;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "SEXO", nullable = false)
	private Sexo sexo;
	
	@Column(name = "RG", nullable = false, length = 10)
	private Integer rg;
	
	@Column(name = "NASCIMENTO", nullable = false)
	private LocalDate dataNascimento;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "SITUACAO", nullable = false, length = 1)
	private Situacao situacao;
	
	@Column(name = "EMAIL", nullable = false, length = 64)
	private String email;
	
	@Embedded //O ENDERECO FAZ PARTE DE ALUNO E COMPARTILHA O ID DE ALUNO
	private Endereco endereco = new Endereco();
	
	@Embedded //O TELEFONE FAZ PARTE DE ALUNO E COMPARTILHA O ID DE ALUNO
	private Telefone telefone = new Telefone();
	
	public Aluno(AlunoDto dto) {
		this.matricula = dto.getMatricula();
		this.nome = dto.getNome();
		this.sexo = dto.getSexo();
		this.rg = dto.getRg();
		this.dataNascimento = dto.getDataNascimento();
		this.situacao = dto.getSituacao();
		this.email = dto.getEmail();		
	}
}
