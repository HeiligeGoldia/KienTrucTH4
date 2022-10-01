package com.se.th04.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.se.th04.entity.ChungNhan;
import com.se.th04.entity.ChungNhanPK;

public interface ChungNhanRepository extends JpaRepository<ChungNhan, ChungNhanPK>  {
	
//	9. Cho biết mã số của các phi công lái máy báy Boeing
	@Query(value = "SELECT nhanvien.MaNV FROM chungnhan INNER JOIN maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN nhanvien ON chungnhan.MaNV = nhanvien.MaNV "
			+ "where  Loai like '%Boeing%' "
			+ "group by nhanvien.MaNV", nativeQuery = true)
	public List<String> cau9();
	
}
