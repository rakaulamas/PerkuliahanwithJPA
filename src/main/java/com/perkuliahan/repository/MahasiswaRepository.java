package com.perkuliahan.repository;

import org.springframework.data.repository.CrudRepository;

import com.perkuliahan.entity.Mahasiswa;

public interface MahasiswaRepository extends CrudRepository<Mahasiswa, Long>{
		public Mahasiswa findByNamaMahasiswa(String nama);
		public Mahasiswa findByIdMahasiswa(Long id);
}
