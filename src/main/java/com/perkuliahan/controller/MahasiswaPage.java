package com.perkuliahan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.perkuliahan.entity.Mahasiswa;
import com.perkuliahan.services.ModelMahasiswa;

@Controller
public class MahasiswaPage {

	@Autowired
	ModelMahasiswa modelMahasiswa;
	
	
	@GetMapping("/mahasiswa/view")
	public String viewMahasiswa(Model model) {
		model.addAttribute("listMahasiswa",modelMahasiswa.getAllMahasiswa());
		return "view_mahasiswa";
	}

	@GetMapping("/mahasiswa/add")
	public String viewAddMahasiswa( Model model) {
		model.addAttribute("mahasiswa", new Mahasiswa()); 		//penampung data mahasiswa di html nya
		return "add_mahasiswa";
	}
	
	@PostMapping("/mahasiswa/view")
	public String addMahasiswa(@ModelAttribute Mahasiswa mahasiswa, Model model) {
		
		this.modelMahasiswa.addMahasiswa(mahasiswa); 		//penampung data mahasiswa di html nya
		model.addAttribute("listMahasiswa",modelMahasiswa.getAllMahasiswa());
		return "view_mahasiswa";
	}
	
	
}
