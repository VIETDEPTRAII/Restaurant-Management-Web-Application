package org.websparrow.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nguyenlieu")
public class Nguyenlieu {
	
	// TODO: Generate getters and setters...

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name = "NGUYENLIEU_ID")
		private int nguyenLieuId;

		@Column(name = "NGUYENLIEU_NAME")
		private String nguyenLieuName;

		@Column(name = "NGUYENLIEU_PRICE")
		private String nguyenLieuPrice;

		@Column(name = "NGUYENLIEU_DATE")
		private int nguyenLieuDate;
		
		@Column(name = "LOAINGUYENLIEU_LOAINGUYENLIEU_ID")
		private int loaiNguyenLieuId;

		public int getNguyenLieuId() {
			return nguyenLieuId;
		}

		public void setNguyenLieuId(int nguyenLieuId) {
			this.nguyenLieuId = nguyenLieuId;
		}

		public String getNguyenLieuName() {
			return nguyenLieuName;
		}

		public void setNguyenLieuName(String nguyenLieuName) {
			this.nguyenLieuName = nguyenLieuName;
		}

		public String getNguyenLieuPrice() {
			return nguyenLieuPrice;
		}

		public void setNguyenLieuPrice(String nguyenLieuPrice) {
			this.nguyenLieuPrice = nguyenLieuPrice;
		}

		public int getNguyenLieuDate() {
			return nguyenLieuDate;
		}

		public void setNguyenLieuDate(int nguyenLieuDate) {
			this.nguyenLieuDate = nguyenLieuDate;
		}

		public int getLoaiNguyenLieuId() {
			return loaiNguyenLieuId;
		}

		public void setLoaiNguyenLieuId(int loaiNguyenLieuId) {
			this.loaiNguyenLieuId = loaiNguyenLieuId;
		}
		
}
