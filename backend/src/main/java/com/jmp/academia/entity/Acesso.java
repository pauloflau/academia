package com.jmp.academia.entity;

import java.time.LocalDateTime;

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
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Acesso {
	
    @EqualsAndHashCode.Include
	private Integer id;
    
	private Aluno aluno;
	private LocalDateTime entrada;
	private LocalDateTime saida;
}
