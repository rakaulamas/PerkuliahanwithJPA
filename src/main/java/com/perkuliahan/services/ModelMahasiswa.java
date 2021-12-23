package com.perkuliahan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perkuliahan.entity.Mahasiswa;
import com.perkuliahan.repository.MahasiswaRepository;

@Service
public class ModelMahasiswa implements ModelMahasiswaInterface{

	
	@Autowired
	MahasiswaRepository mahasiswaRepo;
	
	@Override
	public List<Mahasiswa> getAllMahasiswa() {
		// TODO Auto-generated method stub
		return (List<Mahasiswa>) this.mahasiswaRepo.findAll();
	}

	@Override
	public Mahasiswa getMahasiswaByName(String nama) {
		// TODO Auto-generated method stub
		return this.mahasiswaRepo.findByNamaMahasiswa(nama);
	}


}
