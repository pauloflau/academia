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
public class Telefone {
	private Integer dddCelular;
	private Integer numeroCelular;
	private Integer dddFixo;
	private Integer numeroFixo;
}
