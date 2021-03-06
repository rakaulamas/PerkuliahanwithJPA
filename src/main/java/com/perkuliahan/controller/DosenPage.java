package com.perkuliahan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.perkuliahan.entity.Dosen;
import com.perkuliahan.services.ModelDosen;

@Controller
public class DosenPage {
				
			@Autowired
			ModelDosen modelDosen;
				
			
			@GetMapping("/dosen/view")
			public String viewDosen(Model model) {
				model.addAttribute("listDosen",modelDosen.getAllDosen());
				return "view_dosen";
			}
			
			
			@GetMapping("/dosen/add")
			public String viewAddDosen( Model model) {
				model.addAttribute("dosen", new Dosen()); 		//penampung data mahasiswa di html nya
				return "add_dosen";
			}
			
			
			@PostMapping("/dosen/view")
			public String addDosen(@ModelAttribute Dosen dosen, Model model) {
				
				this.modelDosen.addDosen(dosen); 		//penampung data mahasiswa di html nya
				model.addAttribute("listDosen",modelDosen.getAllDosen());
				return "view_dosen";
			}
			
			@GetMapping("/dosen/update/{id}")
			public String viewUpdateDosen(@PathVariable String id, Model model) {
				Dosen dosen = modelDosen.getDosenById(id);
				model.addAttribute("dosen", dosen); 		//penampung data mahasiswa di html nya
				return "add_dosen";
			}
			 
			@GetMapping("/dosen/delete/{id}")
			public String deleteDosen(@PathVariable String id, Model model) {
				
				this.modelDosen.deleteDosen(id);
				model.addAttribute("listDosen", modelDosen.getAllDosen()); 		//penampung data mahasiswa di html nya
				return "view_dosen";
			}
			
			
}
