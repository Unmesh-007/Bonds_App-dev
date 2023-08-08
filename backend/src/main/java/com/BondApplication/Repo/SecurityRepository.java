package com.BondApplication.Repo;



import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.BondApplication.Models.Security;

@Repository
public interface SecurityRepository extends  JpaRepository<Security , Long>{
	
 	@Query(nativeQuery = true, value="select * from Security s where s.securityMaturityDate between :startDate and :endDate")
	List<Security> getData_between(@Param("startDate") LocalDate date, @Param("endDate") LocalDate date2);

}
