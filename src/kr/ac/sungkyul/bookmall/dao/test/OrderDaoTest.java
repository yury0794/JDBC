package kr.ac.sungkyul.bookmall.dao.test;

import java.util.List;

import kr.ac.sungkyul.bookmall.dao.OrderDao;
import kr.ac.sungkyul.bookmall.vo.OrderVo;

public class OrderDaoTest {

	public static void main(String[] args) {
		// testOrderDaoInsert();
		testOrderDaoGetList();
	}

	public static void testOrderDaoGetList() {
		OrderDao dao = new OrderDao();
		List<OrderVo> list = dao.getList();

		for (OrderVo vo : list) {
			System.out.println(vo);
		}
	}

	public static void testOrderDaoInsert() {
		OrderDao dao = new OrderDao();

		OrderVo vo = new OrderVo();
		vo.setTotalPrice(10000);
		vo.setMemberNo(1L);
		dao.insert(vo);
	}
}