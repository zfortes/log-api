package com.fortes.log.api.entidies;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	
	@Column(name = "acao")
	private String acao;
	
	@Column(name = "servico")
	private String servico;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "data")
	private Timestamp data;
}
