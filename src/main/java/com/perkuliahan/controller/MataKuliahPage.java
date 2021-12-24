package com.perkuliahan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.perkuliahan.entity.MataKuliah;
import com.perkuliahan.services.ModelMataKuliah;

@Controller
public class MataKuliahPage {
		
	@Autowired
	ModelMataKuliah modelMatkul;
	
	@GetMapping("/matakuliah/view")
	public String viewMataKuliah(Model model) {
		model.addAttribute("listMataKuliah",modelMatkul.getAllMataKuliah());
		return "view_matakuliah";
	}
	
	
	@GetMapping("/matakuliah/add")
	public String viewAddMataKuliah( Model model) {
		model.addAttribute("matakuliah", new MataKuliah()); 		//penampung data mahasiswa di html nya
		return "add_matakuliah";
	}
	
	
	@PostMapping("/matakuliah/view")
	public String addMataKuliah(@ModelAttribute MataKuliah mataKuliah, Model model) {
		
		this.modelMatkul.addMataKuliah(mataKuliah); 		//penampung data mahasiswa di html nya
		model.addAttribute("listMataKuliah",modelMatkul.getAllMataKuliah());
		return "view_matakuliah";
	}
	
	@GetMapping("/matakuliah/update/{id}")
	public String viewUpdateMataKuliah(@PathVariable String id, Model model) {
		MataKuliah mataKuliah = modelMatkul.getMataKuliahById(id);
		model.addAttribute("matakuliah", mataKuliah); 		//penampung data mahasiswa di html nya
		return "add_matakuliah";
	}
	 
	@GetMapping("/matakuliah/delete/{id}")
	public String deleteMataKuliah(@PathVariable String id, Model model) {
		
		this.modelMatkul.deleteMataKuliah(id);
		model.addAttribute("listMataKuliah", modelMatkul.getAllMataKuliah()); 		//penampung data mahasiswa di html nya
		return "view_matakuliah";
	}
	
	
}
