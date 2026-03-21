package com.jmp.academia.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Endereco {
	@Column(name = "RUA", nullable = false, length = 128)
	private String rua;
	
	@Column(name = "NUMERO", nullable = true, length = 6)
	private Integer numero;
	
	@Column(name = "COMPLEMENTO", nullable = true, length = 32)
	private String complemento;
	
	@Column(name = "CIDADE", nullable = false, length = 64)
	private String cidade;
	
	@ManyToOne
	@JoinColumn(name = "ESTADO_ID", nullable = false)
	private Estado estado = new Estado();
	
	@Column(name = "CEP", nullable = false, length = 8)
	private String cep;
}
