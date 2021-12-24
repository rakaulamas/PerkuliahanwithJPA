package com.perkuliahan;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.perkuliahan.entity.Dosen;
import com.perkuliahan.entity.Mahasiswa;
import com.perkuliahan.entity.MataKuliah;
import com.perkuliahan.entity.Nilai;
import com.perkuliahan.entity.Pertanyaan;
import com.perkuliahan.entity.PlotMatakuliah;
import com.perkuliahan.entity.Soal;
import com.perkuliahan.repository.PlotMKRepository;
import com.perkuliahan.repository.SoalRepository;

@SpringBootApplication
public class PerkuliahanApplication implements CommandLineRunner{

	@Autowired
	private PlotMKRepository plotMKRepo;
	
	@Autowired
	private SoalRepository soalRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(PerkuliahanApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		PlotMatakuliah plotMK = new PlotMatakuliah();
//		
//		Mahasiswa mahasiswa = new Mahasiswa();
//		mahasiswa.setNamaMahasiswa("Raka");
//		mahasiswa.setJenisKelamin("Pria");
//		mahasiswa.setNim("12345");
//		mahasiswa.setPassword("rahasia");
//		
//		plotMK.setMahasiswa(mahasiswa);
//		
//		Dosen dosen = new Dosen();
//		dosen.setNamaDosen("DewaBrata");
//		dosen.setUsername("Dewa");
//		dosen.setPassword("cupang");
//		plotMK.setDosen(dosen);
//		
//		MataKuliah matakuliah = new MataKuliah();
//		matakuliah.setNamaMataKuliah("Robotic");
//		plotMK.setMataKuliah(matakuliah);
//		
//		List<Soal> lstSoal = new ArrayList<>();
//		Soal soal1= new Soal();
//		soal1.setNamaSoal("Fundamental");
//		soal1.setStatus(1);
//
//		Nilai nilai = new Nilai();
//		nilai.setNilai("100");
//		soal1.setNilai(nilai);
//		plotMK.setLstSoal(lstSoal);
//		
//		Pertanyaan pertanyaan1 = new Pertanyaan();
//		pertanyaan1.setPertanyaan("Apa yg dimaksud dengan robotica?");
//		pertanyaan1.setJawaban1("Robot");
//		pertanyaan1.setJawaban2("Listrik");
//		pertanyaan1.setJawaban3("Gaya");
//		pertanyaan1.setJawaban4("Tidak ada yang benar");
//		pertanyaan1.setStatusGambar("https://www.skipprichard.com/wp-content/uploads/2018/10/bigstock-215605168.jpg");
//		
//		List<Pertanyaan> lstPertanyaans = new ArrayList<>();
//		
//		lstPertanyaans.add(pertanyaan1);
//		soal1.setLstPertanyaan(lstPertanyaans);
//		
//		lstSoal.add(soal1);
//		
//	
//		plotMK.setLstSoal(lstSoal);
//		
//		this.plotMKRepo.save(plotMK);
//		
//		Soal soalx = this.soalRepo.findByNamaSoal("Fundamental");
//		System.out.println(soalx.getNamaSoal());
//		
	}

}
