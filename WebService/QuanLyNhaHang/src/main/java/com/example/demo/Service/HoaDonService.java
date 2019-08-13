package com.example.demo.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Ban;
import com.example.demo.model.HoaDon;

public interface HoaDonService extends JpaRepository<HoaDon,Long>{
	    @Modifying
	    @Query(value = "insert into hoadon (HOADON_NO) VALUES (:id,:insertLink)", nativeQuery = true)
	    @Transactional
	    void TaoHoaDon(@Param("id") Long id,@Param("insertLink") String insertLink);
  
   
}
