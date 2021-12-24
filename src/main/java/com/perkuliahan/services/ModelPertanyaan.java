package com.perkuliahan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perkuliahan.entity.MataKuliah;
import com.perkuliahan.entity.Pertanyaan;
import com.perkuliahan.repository.PertanyaanRepository;

@Service
public class ModelPertanyaan implements ModelPertanyaanInterface {

	@Autowired
	PertanyaanRepository pertanyaanRepo;

	
	//Methods
	@Override
	public List<Pertanyaan> getAllPertanyaan() {
		return (List<Pertanyaan>) this.pertanyaanRepo.findAll();
	}

	
	@Override
	public Pertanyaan addPertanyaan(Pertanyaan pertanyaan) {
		return this.pertanyaanRepo.save(pertanyaan);
	}

	@Override
	public Pertanyaan getPertanyaanById(String id) {
		return ((Pertanyaan)this.pertanyaanRepo.findByIdPertanyaan(Long.parseLong(id)));
	}

	@Override
	public void deletePertanyaan(String id) {
		this.pertanyaanRepo.deleteById(Long.parseLong(id));
		
	}
	
	
}
