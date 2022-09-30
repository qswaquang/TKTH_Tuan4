package com.example.QuanLyChuyenBay.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ChungNhan_FK implements Serializable {
	
	@Column(name = "manv")
	private String maNV;
	
	@Column(name = "mamb")
	private String maMB;
}
