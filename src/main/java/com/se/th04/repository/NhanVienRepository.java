package com.se.th04.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.se.th04.entity.NhanVien;

public interface NhanVienRepository extends JpaRepository<NhanVien, String>  {
	
//	3. Tìm các nhân viên có lương nhỏ hơn 10,000.
	@Query(value = "select * from [dbo].[nhanvien] where [Luong]<10000",nativeQuery = true)
	public List<NhanVien> cau3();
	
//	8. Cho biết tổng số lương phải trả cho các nhân viên.
	@Query(value = "", nativeQuery = true)
	public int cau8();
	
//	10. Cho biết các nhân viên có thể lái máy bay có mã số 747.
	@Query(value = "", nativeQuery = true)
	public List<NhanVien> cau10();
	
//	12. Cho biết mã số của các phi công vừa lái được Boeing vừa lái được Airbus.
	@Query(value = "", nativeQuery = true)
	public List<String> cau12();
	
//	15. Cho biết tên của các phi công lái máy bay Boein
	@Query(value = "", nativeQuery = true)
	public List<String> cau15();
	
//	22. Cho biết mã số của các phi công chỉ lái được 3 loại máy bay
	@Query(value = "", nativeQuery = true)
	public List<String> cau22();
	
//	23. Với mỗi phi công có thể lái nhiều hơn 3 loại máy bay, cho biết mã số phi công và tầm bay lớn nhất của các loại máy bay mà phi công đó có thể lái.
	@Query(value = "", nativeQuery = true)
	public List<Object[]> cau23();
	
//	24. Với mỗi phi công cho biết mã số phi công và tổng số loại máy bay mà phi công đó có thể lái.
	@Query(value = "", nativeQuery = true)
	public List<Object[]> cau24();
	
//	25. Tìm các nhân viên không phải là phi công.
	@Query(value = "", nativeQuery = true)
	public List<NhanVien> cau25();
	
//	26. Cho biết mã số của các nhân viên có lương cao nhất.
	@Query(value = "", nativeQuery = true)
	public List<String> cau26();
	
//	27. Cho biết tổng số lương phải trả cho các phi công
	@Query(value = "", nativeQuery = true)
	public int cau27();
	
}
