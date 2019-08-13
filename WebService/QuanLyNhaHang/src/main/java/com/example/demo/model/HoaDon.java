package com.example.demo.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "hoadon")
public class HoaDon implements Serializable {
	 private static final long serialVersionUID = 1L;
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "HOADON_ID")
	 private long HOADON_ID;
	 
	 @Column(name="HOADON_NO")
	 private String HOADON_NO;
	 
	 @Column(name = "HOADON_DATE")
	 private Date HOADON_DATE;

	 @Column(name = "HOADON_STATUS")
	 private String HOADON_STATUS;
	 
	 @Column(name = "HOADON_TAX")
	 private String HOADON_TAX;
	 
	 @Column(name = "KHACHHANG_KHACHHANG_ID")
	 private int KHACHHANG_KHACHHANG_ID;
	 
	 @Column(name="BAN_BAN_ID")
	 private int BAN_BAN_ID;
	 
	 @Column(name = "NHANVIEN_NHANVIEN_ID")
	 private int LOAIMONAN_LOAIMONAN_ID;
	 @Transient
	 private String TENLOAI_MONAN;
}
