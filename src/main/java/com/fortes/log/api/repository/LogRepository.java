package com.fortes.log.api.repository;
import com.fortes.log.api.entidies.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends JpaRepository<Log, Long>{

}
