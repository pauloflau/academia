package com.jmp.academia.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable //significa que faz parte de outra classe e o id esta em quem defini como @Embedded
public class Telefone {
	
	@Column(name = "CELULAR_DDD", nullable = false, length = 2)
	private Integer dddCelular;
	
	@Column(name = "CELULAR_NUMERO", nullable = false, length = 9)
	private Integer numeroCelular;

	@Column(name = "FIXO_DDD", nullable = true, length = 2)
	private Integer dddFixo;

	@Column(name = "FIXO_NUMERO", nullable = true, length = 9)
	private Integer numeroFixo;
}
