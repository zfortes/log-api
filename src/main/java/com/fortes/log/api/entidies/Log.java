package com.fortes.log.api.entidies;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Log {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_log")
	private Long id;
	

	@Column(name = "metodo")
	@NotNull
	private String metodo;
	
	
	@NotNull
	@Column(name = "servico")
	private String servico;
	
	@NotNull
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "data_hora")
	private Timestamp dataHora;
	
	@Column(name = "token")
	private String token;

}
