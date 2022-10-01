package com.se.th04.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.se.th04.entity.NhanVien;
import com.se.th04.repository.NhanVienRepository;

@Service
public class NhanVienServiceImpl implements NhanVienService {
	
	@Autowired
	private NhanVienRepository nhanVienRepository;

	@Override
	public List<NhanVien> cau3() {
		// TODO Auto-generated method stub
		return nhanVienRepository.cau3();
	}

	@Override
	public int cau8() {
		// TODO Auto-generated method stub
		return nhanVienRepository.cau8();
	}

	@Override
	public List<NhanVien> cau10() {
		// TODO Auto-generated method stub
		return nhanVienRepository.cau10();
	}

	@Override
	public List<String> cau12() {
		// TODO Auto-generated method stub
		return nhanVienRepository.cau12();
	}

	@Override
	public List<String> cau15() {
		// TODO Auto-generated method stub
		return nhanVienRepository.cau15();
	}

	@Override
	public List<String> cau22() {
		// TODO Auto-generated method stub
		return nhanVienRepository.cau22();
	}

	@Override
	public List<Object[]> cau23() {
		// TODO Auto-generated method stub
		return nhanVienRepository.cau23();
	}

	@Override
	public List<Object[]> cau24() {
		// TODO Auto-generated method stub
		return nhanVienRepository.cau24();
	}

	@Override
	public List<NhanVien> cau25() {
		// TODO Auto-generated method stub
		return nhanVienRepository.cau25();
	}

	@Override
	public List<String> cau26() {
		// TODO Auto-generated method stub
		return nhanVienRepository.cau26();
	}

	@Override
	public int cau27() {
		// TODO Auto-generated method stub
		return nhanVienRepository.cau27();
	}

}
