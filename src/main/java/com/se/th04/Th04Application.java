package com.se.th04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.se.th04.service.ChungNhanServiceImpl;
import com.se.th04.service.ChuyenBayServiceImpl;
import com.se.th04.service.MayBayServiceImpl;
import com.se.th04.service.NhanVienServiceImpl;

@SpringBootApplication
public class Th04Application implements CommandLineRunner {
	
	@Autowired
	private ChungNhanServiceImpl cnserv;
	
	@Autowired
	private ChuyenBayServiceImpl cbserv;
	
	@Autowired
	private MayBayServiceImpl mbserv;
	
	@Autowired
	private NhanVienServiceImpl nvserv;

	public static void main(String[] args) {
		SpringApplication.run(Th04Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}

}