package com.perkuliahan.services;

import java.util.List;

import com.perkuliahan.entity.Mahasiswa;

public interface ModelMahasiswaInterface {

	public List<Mahasiswa> getAllMahasiswa();
	public Mahasiswa getMahasiswaByName(String name);
	public Mahasiswa addMahasiswa(Mahasiswa mahasiswa);
	
	
}
