package com.perkuliahan.services;

import java.util.List;

import com.perkuliahan.entity.Mahasiswa;

public interface ModelMahasiswaInterface {

	public List<Mahasiswa> getAllMahasiswa();
	public Mahasiswa getMahasiswaByName(String name);
	public Mahasiswa addMahasiswa(Mahasiswa mahasiswa);
	public Mahasiswa getMahasiswaById(String id);
	public void deleteMahasiswa(String id);
}
