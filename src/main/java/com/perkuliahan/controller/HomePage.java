package com.perkuliahan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.perkuliahan.repository.MahasiswaRepository;
import com.perkuliahan.services.ModelMahasiswa;

@Controller
public class HomePage {
	
		@Autowired
		ModelMahasiswa modelMahasiswa;
	
		
//		
//		@GetMapping("/")
//		public String viewHomePage(Model model) {
////			model.addAttribute("mahasiswa",mahasiswaRepo.findAll());
//			
//			return "index";
//		}
		
		
		
	
}
