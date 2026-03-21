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
public class EnderecoDto {
	private String rua;
	private Integer numero;
	private String complemento;
	private String cidade;
	private EstadoDto estado = new EstadoDto();
	private String cep;
}
