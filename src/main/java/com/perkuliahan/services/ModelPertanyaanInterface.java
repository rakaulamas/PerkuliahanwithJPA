package com.perkuliahan.services;

import java.util.List;

import com.perkuliahan.entity.Pertanyaan;

public interface ModelPertanyaanInterface {
	
	public List<Pertanyaan> getAllPertanyaan();		
	public Pertanyaan addPertanyaan(Pertanyaan pertanyaan);			//kalo ada error cek sini
	public Pertanyaan getPertanyaanById(String id);
	public void deletePertanyaan(String id);
}
