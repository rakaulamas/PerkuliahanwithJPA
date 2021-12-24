package com.perkuliahan.services;

import java.util.List;

import com.perkuliahan.entity.Dosen;


public interface ModelDosenInterface {

	public List<Dosen> getAllDosen();
	public Dosen getDosenByName(String nama);		//kalo ada error cek sini
	public Dosen addDosen(Dosen dosen);
	public Dosen getDosenById(String id);
	public void deleteDosen(String id);
}
