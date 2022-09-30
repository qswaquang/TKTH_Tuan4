package com.example.QuanLyChuyenBay.Services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.QuanLyChuyenBay.Repository.Repo;
import com.example.QuanLyChuyenBay.entity.ChuyenBay;

@RestController
public class Services {
	
	@Autowired
	Repo repo;
	
	@GetMapping("/ChuyenBay?{gaden}")
	public List<ChuyenBay> getChuyenBayByGaDen(@PathVariable("gaden") String gaden) {
		List<ChuyenBay> chuyenBays = repo.findChuyenBayByGaDen(gaden);
		System.out.println(chuyenBays);
		return chuyenBays;
	}
	
	@GetMapping("/")
	public String asd() {
		return "asd";
	}
}
