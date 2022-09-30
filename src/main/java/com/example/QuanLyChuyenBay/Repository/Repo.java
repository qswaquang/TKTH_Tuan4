package com.example.QuanLyChuyenBay.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.QuanLyChuyenBay.entity.ChuyenBay;


@Repository
public interface Repo extends JpaRepository<ChuyenBay, String> {
	@Query(value = "SELECT * FROM tbl_chuyen_bay u WHERE u.ga_den = :gaDen", nativeQuery = true)
	public List<ChuyenBay> findChuyenBayByGaDen(@Param("gaDen") String gaDen);

}
