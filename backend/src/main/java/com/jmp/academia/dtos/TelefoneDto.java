package com.jmp.academia.dtos;

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
public class TelefoneDto {
	private Integer dddCelular;
	private Integer numeroCelular;
	private Integer dddFixo;
	private Integer numeroFixo;
}
