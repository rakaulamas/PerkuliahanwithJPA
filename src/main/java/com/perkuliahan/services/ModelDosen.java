package com.perkuliahan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perkuliahan.entity.Dosen;
import com.perkuliahan.repository.DosenRepository;

@Service
public class ModelDosen implements ModelDosenInterface {
		
			@Autowired
			DosenRepository dosenRepo;

			
			@Override
			public List<Dosen> getAllDosen() {
				return (List<Dosen>) this.dosenRepo.findAll();
			}

			@Override
			public Dosen getDosenByName(String nama) {
				return this.dosenRepo.findByNamaDosen(nama);
			}

			@Override
			public Dosen addDosen(Dosen dosen) {
				return this.dosenRepo.save(dosen);
			}

			@Override
			public Dosen getDosenById(String id) {
				return ((Dosen)this.dosenRepo.findByIdDosen(Long.parseLong(id)));
			}

			@Override
			public void deleteDosen(String id) {
				this.dosenRepo.deleteById(Long.parseLong(id));
				
			}
			


}
