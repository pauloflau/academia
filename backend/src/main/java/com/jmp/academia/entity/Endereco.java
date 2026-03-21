package com.jmp.academia.entity;

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
@EqualsAndHashCode 
public class Endereco {
	private String rua;
	private Integer numero;
	private String complemento;
	private String cidade;
	private Estado estado = new Estado();
	private String cep;
}
