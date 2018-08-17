package com.fortes.log.api.services;

import javax.transaction.Transactional;

import com.fortes.log.api.dtos.LogDTO;
import com.fortes.log.api.entidies.Log;

public interface LogDTOService {
	@Transactional
	public Log converteLog(LogDTO logDto);
}
