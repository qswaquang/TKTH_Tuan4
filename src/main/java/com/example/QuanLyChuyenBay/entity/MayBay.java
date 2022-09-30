package com.example.QuanLyChuyenBay.entity;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tblMayBay")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MayBay {
	
	@Id
	@Column(name = "mamb")
	private String maMayBay;
	private String loai;
	private int tamBay;
	
	@OneToMany(mappedBy = "mayBay")
	private Set<ChungNhan> chungNhans;
}
