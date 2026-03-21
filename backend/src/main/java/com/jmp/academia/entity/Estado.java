package com.jmp.academia.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tb_ESTADO")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Estado {
    
	@Id
	@Column(name="SIGLA", nullable = false, length = 2)
	@EqualsAndHashCode.Include
	private String sigla;
    
	@Column(name="NOME", nullable = false, length = 30)
	private String nome;
}
