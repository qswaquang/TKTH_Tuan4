package com.example.QuanLyChuyenBay.entity;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tblChungNhan")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChungNhan {
	
	@EmbeddedId
	ChungNhan_FK chungNhan_FK;
	
	@ManyToOne
	@MapsId("maNV")
	@JoinColumn(name = "manv")
	NhanVien nhanVien;
	
	@ManyToOne
	@MapsId("maMB")
	@JoinColumn(name = "mamb")
	MayBay mayBay;
	
	
}
