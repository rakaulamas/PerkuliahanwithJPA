package com.perkuliahan.services;

import java.util.List;


import com.perkuliahan.entity.MataKuliah;

public interface ModelMataKuliahInterface {
	
	
	public List<MataKuliah> getAllMataKuliah();
	public MataKuliah getMataKuliahByName(String nama);		//kalo ada error cek sini
	public MataKuliah addMataKuliah(MataKuliah mataKuliah);
	public MataKuliah getMataKuliahById(String id);
	public void deleteMataKuliah(String id);
}
