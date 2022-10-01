package com.se.th04.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.se.th04.entity.MayBay;
import com.se.th04.repository.MayBayRepository;

@Service
public class MayBayServiceImpl implements MayBayService {
	@Autowired
	private MayBayRepository mayBayRepository;
	
	@Override
	public List<String> cau2() {
		// TODO Auto-generated method stub
		return mayBayRepository.cau2();
	}

	@Override
	public int cau7() {
		// TODO Auto-generated method stub
		return mayBayRepository.cau7();
	}

	@Override
	public List<String> cau11() {
		// TODO Auto-generated method stub
		return mayBayRepository.cau11();
	}

	@Override
	public List<String> cau13() {
		// TODO Auto-generated method stub
		return mayBayRepository.cau13();
	}

	@Override
	public List<Object[]> cau16(){
		// TODO Auto-generated method stub
		return mayBayRepository.cau16();
	}

}
