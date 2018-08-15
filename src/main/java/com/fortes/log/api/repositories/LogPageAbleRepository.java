package com.fortes.log.api.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.fortes.log.api.entidies.Log;

public interface LogPageAbleRepository extends PagingAndSortingRepository<Log, Long>{

}
