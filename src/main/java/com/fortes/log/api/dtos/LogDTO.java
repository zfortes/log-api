package com.fortes.log.api.dtos;

import java.sql.Timestamp;

import javax.validation.constraints.NotNull;

import com.fortes.log.api.entidies.Log;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LogDTO {
	
	private Long id;

	
	@NotNull
	private String metodo;
	
	@NotNull
	private String servico;
	
	@NotNull
	private String userName;
	
	private Timestamp dataHora;

	LogDTO(){}
	
	LogDTO(Log log) {
		this.id = log.getId();
		this.metodo = log.getMetodo();
		this.servico = log.getServico();
		this.userName = log.getUserName();
		this.dataHora = log.getDataHora();
	}
}
