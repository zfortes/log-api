package com.fortes.log.api.services.impl;

import com.fortes.log.api.entidies.Log;
import com.fortes.log.api.repositories.LogPageAbleRepository;
import com.fortes.log.api.repositories.LogRepository;
import com.fortes.log.api.services.LogService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;


import java.sql.Timestamp;
import java.util.List;

@RestController
public class LogServiceImpl implements LogService{

	@Autowired
	private LogRepository rp;
	
//	@Autowired
//	private LogPageAbleRepository rp2;

	
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
	
	@Transactional
	public Page<Log> recebePagina(int p, int tp){
		@SuppressWarnings("deprecation")
		PageRequest pageRequest = new PageRequest(p, tp);
		return rp.findAll(pageRequest);
	}
	
	
//	@Transactional
//	public Page<Log> listAllByPage(Pageable pageable) {
//		return rp2.findAll(pageable);
//	}
	
//	@Transactional
//	public List<Log> listPage(){
//		Pageable pageable;
//		List<Log> logs = rp.findAll(new Long(5), pageable);
//		return logs;
//	}
//	
	
	
	

	
}
