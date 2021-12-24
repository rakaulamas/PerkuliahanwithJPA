package com.perkuliahan.repository;

import org.springframework.data.repository.CrudRepository;


import com.perkuliahan.entity.MataKuliah;

public interface MataKuliahRepository extends CrudRepository<MataKuliah, Long>{
	public MataKuliah findByNamaMataKuliah(String nama);
	public MataKuliah findByIdMataKuliah(Long id);
}
