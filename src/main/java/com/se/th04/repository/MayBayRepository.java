package com.se.th04.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.se.th04.entity.MayBay;

public interface MayBayRepository extends JpaRepository<MayBay, Integer>  {
	
//	2. Cho biết các loại máy bay có tầm bay lớn hơn 10,000km.
	@Query(value = "select loai from [dbo].[maybay] where [TamBay]>10000", nativeQuery = true)
	public List<String> cau2();
	
//	7. Có bao nhiêu loại máy báy Boeing.
	@Query(value = "", nativeQuery = true)
	public int cau7();
	
//	11. Cho biết mã số của các loại máy bay mà nhân viên có họ Nguyễn có thể lái.
	@Query(value = "", nativeQuery = true)
	public List<String> cau11();

//	13. Cho biết các loại máy bay có thể thực hiện chuyến bay VN280
	@Query(value = "", nativeQuery = true)
	public List<String> cau13();
	
//	16. Với mỗi loại máy bay có phi công lái cho biết mã số, loại máy báy và tổng số phi công có thể lái loại máy bay đó.
	@Query(value = "", nativeQuery = true)
	public List<Object[]> cau16();
}
