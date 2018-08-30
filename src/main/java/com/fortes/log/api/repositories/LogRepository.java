package com.fortes.log.api.repositories;
import com.fortes.log.api.entidies.Log;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface LogRepository extends SolrCrudRepository<Log, Long>{

//	public List<Log> findAll(Long id, Pageable pageable);
	
//	List<Log> findById(Long id);
}
