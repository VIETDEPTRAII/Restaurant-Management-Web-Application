package org.websparrow.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loainguyenlieu")
public class LoaiNguyenLieu {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "LOAINGUYENLIEU_ID")
	private int loaiNguyenLieuId;
	
	@Column(name = "LOAINGUYENLIEU_NAME")
	private String loaiNguyenLieuName;

	@Column(name = "LOAINGUYENLIEU_UNIT")
	private String loaiNguyenLieuUnit;

	public int getLoaiNguyenLieuId() {
		return loaiNguyenLieuId;
	}

	public void setLoaiNguyenLieuId(int loaiNguyenLieuId) {
		this.loaiNguyenLieuId = loaiNguyenLieuId;
	}

	public String getLoaiNguyenLieuName() {
		return loaiNguyenLieuName;
	}

	public void setLoaiNguyenLieuName(String loaiNguyenLieuName) {
		this.loaiNguyenLieuName = loaiNguyenLieuName;
	}

	public String getLoaiNguyenLieuUnit() {
		return loaiNguyenLieuUnit;
	}

	public void setLoaiNguyenLieuUnit(String loaiNguyenLieuUnit) {
		this.loaiNguyenLieuUnit = loaiNguyenLieuUnit;
	}
	
	
}
