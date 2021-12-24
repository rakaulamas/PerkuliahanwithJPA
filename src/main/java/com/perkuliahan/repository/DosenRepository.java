package com.perkuliahan.repository;

import org.springframework.data.repository.CrudRepository;

import com.perkuliahan.entity.Dosen;


public interface DosenRepository extends CrudRepository<Dosen, Long>{
	public Dosen findByNamaDosen(String nama);
	public Dosen findByIdDosen(Long id);
}
