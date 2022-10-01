package com.se.th04.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.se.th04.entity.ChuyenBay;
import com.se.th04.repository.ChuyenBayRepository;

@Service
public class ChuyenBayServiceImpl implements ChuyenBayService {
	@Autowired 
	private ChuyenBayRepository chuyenBayRepository;
	
	@Override
	public List<ChuyenBay> cau1() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.cau1();
	}

	@Override
	public List<ChuyenBay> cau4() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.cau4();
	}

	@Override
	public List<ChuyenBay> cau5() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.cau5();
	}

	@Override
	public int cau6() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.cau6();
	}

	@Override
	public List<ChuyenBay> cau14() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.cau14();
	}

	@Override
	public List<ChuyenBay> cau17() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.cau17();
	}

	@Override
	public List<Object[]> cau18() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.cau18();
	}

	@Override
	public List<Object[]> cau19() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.cau19();
	}

	@Override
	public List<ChuyenBay> cau20() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.cau20();
	}

	@Override
	public List<Object[]> cau21() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.cau21();
	}

	@Override
	public List<ChuyenBay> cau28() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.cau28();
	}
	
}
