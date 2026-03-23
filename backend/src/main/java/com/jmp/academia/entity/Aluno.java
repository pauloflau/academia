package com.jmp.academia.entity;

import java.time.LocalDate;
import java.time.Year;

import com.jmp.academia.dtos.AlunoDto;
import com.jmp.academia.enums.Sexo;
import com.jmp.academia.enums.Situacao;
import com.jmp.academia.util.DiversosUtils;

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
		//this.matricula = dto.getMatricula();
		this.nome = dto.getNome();
		this.sexo = dto.getSexo();
		this.rg = dto.getRg();
		this.dataNascimento = dto.getDataNascimento();
		this.situacao = dto.getSituacao();
		this.email = dto.getEmail();		
	
		this.endereco.setRua(dto.getEnderecoDto().getRua());
		this.endereco.setNumero(dto.getEnderecoDto().getNumero()); 
		this.endereco.setComplemento(dto.getEnderecoDto().getComplemento());
		this.endereco.setCidade(dto.getEnderecoDto().getCidade());
		this.endereco.setCep(dto.getEnderecoDto().getCep());
		
		this.endereco.getEstado().setNome(dto.getEnderecoDto().getEstado().getNome());
		this.endereco.getEstado().setSigla(dto.getEnderecoDto().getEstado().getSigla());
		
		this.telefone.setDddCelular(dto.getTelefoneDto().getDddCelular());
		this.telefone.setNumeroCelular(dto.getTelefoneDto().getNumeroCelular());
		this.telefone.setDddFixo(dto.getTelefoneDto().getDddFixo());
		this.telefone.setNumeroFixo(dto.getTelefoneDto().getNumeroFixo());
	}
	
	public void atualizarDados(AlunoDto dto) {
	    this.nome = dto.getNome();
	    this.sexo = dto.getSexo();
	    this.rg = dto.getRg();
	    this.dataNascimento = dto.getDataNascimento();
	    this.situacao = dto.getSituacao();
	    this.email = dto.getEmail();

	    this.endereco.setRua(dto.getEnderecoDto().getRua());
	    this.endereco.setNumero(dto.getEnderecoDto().getNumero());
	    this.endereco.setComplemento(dto.getEnderecoDto().getComplemento());
	    this.endereco.setCidade(dto.getEnderecoDto().getCidade());
	    this.endereco.setCep(dto.getEnderecoDto().getCep());

	    this.endereco.getEstado().setSigla(dto.getEnderecoDto().getEstado().getSigla());

	    this.telefone.setDddCelular(dto.getTelefoneDto().getDddCelular());
	    this.telefone.setNumeroCelular(dto.getTelefoneDto().getNumeroCelular());
	    this.telefone.setDddFixo(dto.getTelefoneDto().getDddFixo());
	    this.telefone.setNumeroFixo(dto.getTelefoneDto().getNumeroFixo());
	}
	
	public void gerarMatricula(String maxMatricula) {
		Year ano = Year.now();
	    String anoAtual = String.valueOf(ano.getValue());
		
		if(maxMatricula == null) {
			maxMatricula = anoAtual + DiversosUtils.preencheZero(0,4);
		}
		
		int sequencial = Integer.parseInt(maxMatricula.substring(4));
		sequencial++;
		
		this.matricula = anoAtual + DiversosUtils.preencheZero(sequencial, 4);
	}
}
