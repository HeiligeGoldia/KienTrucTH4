package com.se.th04.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.se.th04.entity.ChungNhan;
import com.se.th04.repository.ChungNhanRepository;

@Service
public class ChungNhanServiceImpl implements ChungNhanService {
	
	@Autowired
	ChungNhanRepository chungNhanRespository;

	@Override
	public List<String> cau9() {
		// TODO Auto-generated method stub
		return chungNhanRespository.cau9();
	}

}
