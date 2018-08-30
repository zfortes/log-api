package com.fortes.log.api.services.impl;

import javax.transaction.Transactional;

import com.fortes.log.api.dtos.LogDTO;
import com.fortes.log.api.entidies.Log;
import com.fortes.log.api.services.LogDTOService;

public class LogDTOServiceImpl implements LogDTOService{
	@Transactional
	public Log converteLog(LogDTO logDto) {
		Log log = new Log();
		log.setId(logDto.getId());
		log.setMetodo(logDto.getMetodo());
//		log.setServico(logDto.getServico());
//		log.setUserName(logDto.getUserName());
//		log.setDataHora(logDto.getDataHora());
		return log;
	}
}
