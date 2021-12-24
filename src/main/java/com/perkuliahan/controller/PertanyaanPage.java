package com.perkuliahan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.perkuliahan.entity.MataKuliah;
import com.perkuliahan.entity.Pertanyaan;
import com.perkuliahan.services.ModelPertanyaan;

@Controller
public class PertanyaanPage {

	@Autowired
	ModelPertanyaan modelPertanyaan;
		
	@GetMapping("/pertanyaan/view")
	public String viewPertanyaan(Model model) {
		model.addAttribute("listPertanyaan",modelPertanyaan.getAllPertanyaan());
		return "view_pertanyaan";
	}
	
	
	@GetMapping("/pertanyaan/add")
	public String viewAddPertanyaan( Model model) {
		model.addAttribute("pertanyaan", new Pertanyaan()); 		//penampung data mahasiswa di html nya
		return "add_pertanyaan";
	}
	
	
	@PostMapping("/pertanyaan/view")
	public String addPertanyaan(@ModelAttribute Pertanyaan pertanyaan, Model model) {
		
		this.modelPertanyaan.addPertanyaan(pertanyaan); 		//penampung data mahasiswa di html nya
		model.addAttribute("listPertanyaan",modelPertanyaan.getAllPertanyaan());
		return "view_pertanyaan";
	}
	
	@GetMapping("/pertanyaan/update/{id}")
	public String viewUpdatePertanyaan(@PathVariable String id, Model model) {
		Pertanyaan pertanyaan = modelPertanyaan.getPertanyaanById(id);
		model.addAttribute("pertanyaan", pertanyaan); 		//penampung data mahasiswa di html nya
		return "add_pertanyaan";
	}
	 
	@GetMapping("/pertanyaan/delete/{id}")
	public String deletePertanyaan(@PathVariable String id, Model model) {
		
		this.modelPertanyaan.deletePertanyaan(id);
		model.addAttribute("listPertanyaan", modelPertanyaan.getAllPertanyaan()); 		//penampung data mahasiswa di html nya
		return "view_pertanyaan";
	}
	
	
}
