package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "loainguyenlieu")
public class LoaiNguyenLieu implements Serializable {

 public long getId() {
		return LOAINGUYENLIEU_ID;
	}

	public void setId(long id) {
		this.LOAINGUYENLIEU_ID = id;
	}

	public String getLOAINGUYENLIEU_NAME() {
		return LOAINGUYENLIEU_NAME;
	}

	public void setLOAINGUYENLIEU_NAME(String lOAINGUYENLIEU_NAME) {
		LOAINGUYENLIEU_NAME = lOAINGUYENLIEU_NAME;
	}

	public String getLOAINGUYENLIEU_UNIT() {
		return LOAINGUYENLIEU_UNIT;
	}

	public void setLOAINGUYENLIEU_UNIT(String lOAINGUYENLIEU_UNIT) {
		LOAINGUYENLIEU_UNIT = lOAINGUYENLIEU_UNIT;
	}

private static final long serialVersionUID = -3009157732242241606L;
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 @Column(name = "LOAINGUYENLIEU_ID")
 private long LOAINGUYENLIEU_ID;

 @Column(name = "LOAINGUYENLIEU_NAME")
 private String LOAINGUYENLIEU_NAME;

 @Column(name = "LOAINGUYENLIEU_UNIT")
 private String LOAINGUYENLIEU_UNIT;

 protected LoaiNguyenLieu() {
 }

 public LoaiNguyenLieu(String LoaiNguyenLieuName, String LoaiNguyenLieuDVT) {

   this.LOAINGUYENLIEU_NAME = LoaiNguyenLieuName;
   this.LOAINGUYENLIEU_UNIT = LoaiNguyenLieuDVT;
 }

}