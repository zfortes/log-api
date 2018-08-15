package com.fortes.log.api.repositories;
import com.fortes.log.api.entidies.Log;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends JpaRepository<Log, Long>{
//	public List<Log> findAll(Long id, Pageable pageable);
}
