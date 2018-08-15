package com.fortes.log.api.services;

import com.fortes.log.api.entidies.Log;
import com.fortes.log.api.repositories.LogRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;


import java.sql.Timestamp;
import java.util.List;

@RestController
public class LogService {

	@Autowired
	private LogRepository rp;

	
	@Transactional
	public Log salvar(Log log){	
		Timestamp dataDeHoje = new Timestamp(System.currentTimeMillis());
		dataDeHoje.toLocalDateTime();
		log.setDataHora(dataDeHoje);;
		return rp.save(log);	
	}
	
	@Transactional
	public List<Log> recebeTodos(){
		return rp.findAll();
	}

	
}
