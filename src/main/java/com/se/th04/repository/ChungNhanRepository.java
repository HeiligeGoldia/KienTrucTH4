package com.se.th04.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.se.th04.entity.ChungNhan;
import com.se.th04.entity.ChungNhanPK;

public interface ChungNhanRepository extends JpaRepository<ChungNhan, ChungNhanPK>  {
	
//	9. Cho biết mã số của các phi công lái máy báy Boeing
	
	public List<String> cau9();
	
}
