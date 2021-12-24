package com.perkuliahan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.perkuliahan.entity.MataKuliah;
import com.perkuliahan.repository.MataKuliahRepository;

@Service
public class ModelMataKuliah implements ModelMataKuliahInterface{
	
	@Autowired
	MataKuliahRepository matkulRepo;

	@Override
	public List<MataKuliah> getAllMataKuliah() {
		return (List<MataKuliah>) this.matkulRepo.findAll();
	}

	@Override
	public MataKuliah getMataKuliahByName(String nama) {
		return this.matkulRepo.findByNamaMataKuliah(nama);
	}

	@Override
	public MataKuliah addMataKuliah(MataKuliah mataKuliah) {
		return this.matkulRepo.save(mataKuliah);
	}

	@Override
	public MataKuliah getMataKuliahById(String id) {
		return ((MataKuliah)this.matkulRepo.findByIdMataKuliah(Long.parseLong(id)));
	}

	@Override
	public void deleteMataKuliah(String id) {
		this.matkulRepo.deleteById(Long.parseLong(id));
		
	}

}
