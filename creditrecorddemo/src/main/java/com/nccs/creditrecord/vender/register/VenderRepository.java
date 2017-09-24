package com.nccs.creditrecord.vender.register;
import org.springframework.data.jpa.repository.JpaRepository;
public interface VenderRepository extends JpaRepository<Vender,Long>  {
  	//Optional<Vender>findById(Long u_id);

}

