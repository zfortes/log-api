package com.fortes.log.api.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;

import com.fortes.log.api.entidies.Log;

public interface LogService {
//	Page<Log> findAll(Pageable pageable);
	@Transactional
	public Log salvar(Log log);
	
	@Transactional
	public List<Log> recebeTodos();
	
	@Transactional
	public Page<Log> recebePagina(int p, int tp);
}
