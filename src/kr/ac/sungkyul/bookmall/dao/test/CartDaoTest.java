package kr.ac.sungkyul.bookmall.dao.test;

import java.util.List;

import kr.ac.sungkyul.bookmall.dao.CartDao;
import kr.ac.sungkyul.bookmall.vo.CartVo;

public class CartDaoTest {

	public static void main(String[] args) {
		// testCartDaoInsert();
		testCartDaoGetList();
	}
	
	public static void testCartDaoGetList() {
		CartDao dao = new CartDao();
		List<CartVo> list = dao.getList();

		for (CartVo vo : list) {
			System.out.println(vo);
		}
	}

	public static void testCartDaoInsert() {
		CartDao dao = new CartDao();

		CartVo vo = new CartVo();
		vo.setCount(1);
		vo.setBookNo(41L);
		vo.setMemberNo(1L);
		dao.insert(vo);

		vo = new CartVo();
		vo.setCount(2);
		vo.setBookNo(42L);
		vo.setMemberNo(1L);
		dao.insert(vo);
	}
}