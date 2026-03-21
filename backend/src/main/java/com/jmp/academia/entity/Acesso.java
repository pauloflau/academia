package com.jmp.academia.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tb_ENTRADAS_SAIDAS")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Acesso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @EqualsAndHashCode.Include
	private Integer id;
    
	@ManyToOne
	@JoinColumn(name = "ALUNO_ID", nullable = false)
	private Aluno aluno;
	
	@Column(name = "ENTRADA", nullable = false)
	private LocalDateTime entrada;
	
	@Column(name = "SAIDA", nullable = true)
	private LocalDateTime saida;
}
