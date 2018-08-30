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
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;


@Getter
@Setter
@SolrDocument(solrCoreName = "log")
public class Log {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Indexed(name = "id", type = "long")
	private Long id;
	

	@Indexed(name = "metodo", type = "string")
	@NotNull
	private String metodo;
	
//
//	@NotNull
//	@Column(name = "servico")
//	private String servico;
//
//	@NotNull
//	@Column(name = "user_name")
//	private String userName;
//
//	@Column(name = "data_hora")
//	private Timestamp dataHora;
//
//	@Column(name = "token")
//	private String token;

}
