package com.nccs.creditrecord.clientregister;
import org.springframework.data.jpa.repository.JpaRepository;
import com.nccs.creditrecord.vender.register.Vender;
public interface CreditClientRepository extends JpaRepository<CreditClient,Long>  {
  	//Optional<Vender>findById(Long u_id);

}