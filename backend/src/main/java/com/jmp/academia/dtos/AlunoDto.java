package com.jmp.academia.dtos;

import java.time.LocalDate;

import com.jmp.academia.entity.Aluno;
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
	private EnderecoDto enderecoDto = new EnderecoDto();
	private TelefoneDto telefoneDto = new TelefoneDto();
	
	public AlunoDto(Aluno entidade) {
		this.matricula = entidade.getMatricula();
		this.nome = entidade.getNome();
		this.sexo = entidade.getSexo();
		this.rg = entidade.getRg();
		this.dataNascimento = entidade.getDataNascimento();
		this.situacao = entidade.getSituacao();
		this.email = entidade.getEmail();	
		
		this.enderecoDto.setRua(entidade.getEndereco().getRua());
		this.enderecoDto.setNumero(entidade.getEndereco().getNumero()); 
		this.enderecoDto.setComplemento(entidade.getEndereco().getComplemento());
		this.enderecoDto.setCidade(entidade.getEndereco().getCidade());
		this.enderecoDto.setCep(entidade.getEndereco().getCep());
		this.enderecoDto.getEstado().setNome(entidade.getEndereco().getEstado().getNome());
		this.enderecoDto.getEstado().setSigla(entidade.getEndereco().getEstado().getSigla());
		
		this.telefoneDto.setDddCelular(entidade.getTelefone().getDddCelular());
		this.telefoneDto.setNumeroCelular(entidade.getTelefone().getNumeroCelular());	
		this.telefoneDto.setDddFixo(entidade.getTelefone().getDddFixo());
		this.telefoneDto.setNumeroFixo(entidade.getTelefone().getNumeroFixo());	

	}
}
