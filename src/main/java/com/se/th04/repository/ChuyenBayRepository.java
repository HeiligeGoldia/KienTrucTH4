package com.se.th04.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.se.th04.entity.ChuyenBay;

public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String>  {
	
//	1.Cho biết các chuyến bay đi Đà Lạt (DAD)
	@Query(value = "select * from chuyenbay where GaDen = 'DAD'", nativeQuery = true)
	public List<ChuyenBay> cau1();
	
//  4.Cho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km.
	@Query(value = "select * from chuyenbay where dodai < 10000 and dodai > 8000", nativeQuery = true)
	public List<ChuyenBay> cau4();
	
//  5.Cho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV).
	@Query(value = "select * from chuyenbay where GaDi = 'SGN' and GaDen = 'BMV'", nativeQuery = true)
	public List<ChuyenBay> cau5();
	
//	6.Có bao nhiêu chuyến bay xuất phát từ Sài Gòn (SGN).
	
	public int cau6();
	
//	14. Cho biết các chuyến bay có thể ñược thực hiện bởi máy bay Airbus A320
	
	public List<ChuyenBay> cau14();
	
//	17. Giả sử một hành khách muốn đi thẳng từ ga A đến ga B rồi quay trở về ga A. Cho biết các đường bay nào có thể đáp ứng yêu cầu này.
	
	public List<ChuyenBay> cau17();
	
//	18. Với mỗi ga có chuyến bay xuất phát từ đó cho biết có bao nhiêu chuyến bay khởi hành từ ga đó.
	
	public List<Object[]> cau18();
	
//	19. Với mỗi ga có chuyến bay xuất phát từ đó cho biết tổng chi phí phải trả cho phi công lái các chuyến bay khởi hành từ ga đó.
	
	public List<Object[]> cau19();
	
//	20. Cho biết danh sách các chuyến bay có thể khởi hành trước 12:00
	
	public List<ChuyenBay> cau20();
	
//	21. Với mỗi địa điểm xuất phát cho biết có bao nhiêu chuyến bay có thể khởi hành trước 12:00.
	
	public List<Object[]> cau21();
	
//	28. Tìm các chuyến bay có thể được thực hiện bởi tất cả các loại máy bay Boeing
	
	public List<ChuyenBay> cau28();
}
