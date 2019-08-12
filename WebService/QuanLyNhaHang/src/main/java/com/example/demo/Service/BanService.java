package com.example.demo.Service;

import java.util.List;

import org.springframework.boot.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Ban;

public interface BanService extends JpaRepository<Ban, Long>{

	//SEARCH BAN SU DUNG QUERY 
	@Query("FROM Ban WHERE BAN_NO LIKE %:keyword%")
	public List<Ban> search(@Param("keyword") String keyword);
	//SEARCH BAN SU DUNG CALL STORPROCEDURE
	
	 @Procedure(name = "firstProcedure") public String DanhSachBan();
	 
	
	//GET DNAH SACH BAN
	public default List<Ban> GetAllBans(){
		return this.findAll();
	}
	
	//GET 1 BAN
	public default Ban GetBan(long id) {
		return this.getOne(id);
		
	}
	
	//INSERT BAN
	public default boolean InsertBan(Ban o) {
		if(o!=null) {
			this.save(o);
			return true;
		}else {
			return false;
		}
		
	}
	
	//UPDATE BAN
	public default boolean UpdateBan(Ban o) {
		Ban temp=this.getOne(o.getBAN_ID());
		if(temp!=null) {
			temp.setBAN_NO(o.getBAN_NO());
			temp.setBAN_STATUS(o.getBAN_STATUS());
			this.save(temp);
			return true;
		}else {
			return false;
		}
	}
	
	//DELETE BAN
	public default boolean 	DeleteBan(long id) {
		Ban temp=this.getOne(id);
		if(temp!=null) {
			this.delete(temp);
			return true;
		}else {
			return false;
		}
	}
	
	
	
}
