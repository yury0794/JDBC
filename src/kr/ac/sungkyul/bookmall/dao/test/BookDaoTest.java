package kr.ac.sungkyul.bookmall.dao.test;

import java.util.List;
import java.util.Scanner;

import kr.ac.sungkyul.bookmall.dao.BookDao;
import kr.ac.sungkyul.bookmall.vo.BookVo;

public class BookDaoTest {

	public static void main(String[] args) {
		testBookDaoInsert(); // 같은 값을 넣지 않도록 막아놓는다
		// testBookDaoDelete(); // 같은 값을 삭제하지 않도록 막아놓는다
		// testBookDaoUpdate();
		// testBookDaoDeleteAll();
		testBookDaoGetList();
	}

	public static void testBookDaoDeleteAll() {
		BookDao dao = new BookDao();
		int count = dao.delete(); // 참조된 애는 못지움
		System.out.println("삭제된 row 수 : " + count);
	}

	public static void testBookDaoUpdate() {
		BookDao dao = new BookDao();

		BookVo vo = new BookVo();
		vo.setNo(1L);
		vo.setTitle("향연2");
		vo.setRate(2);
		vo.setAuthorNo(1L);
		dao.update(vo);
	}

	public static void testBookDaoDelete() {
		BookDao dao = new BookDao();
		int count = dao.delete(1L); // 참조된 애는 못지움
		System.out.println("삭제된 row 수 : " + count);
	}

	public static void testBookDaoGetList() {
		BookDao dao = new BookDao();
		List<BookVo> list = dao.getList();

		for (BookVo vo : list) {
			System.out.println(vo);
		}
	}

	public static void testBookDaoInsert() {
		BookDao dao = new BookDao();

		BookVo vo = new BookVo();
		vo.setTitle("트와일라잇");
		vo.setRate(1);
		vo.setAuthorNo(1L);
		vo.setStatus(0); // 0:재고있음, 1:대여중
		dao.insert(vo);

		vo = new BookVo();
		vo.setTitle("뉴문");
		vo.setRate(1);
		vo.setAuthorNo(1L);
		vo.setStatus(0); // 0:재고있음, 1:대여중
		dao.insert(vo);

		vo = new BookVo();
		vo.setTitle("이클립스");
		vo.setRate(1);
		vo.setAuthorNo(1L);
		vo.setStatus(0); // 0:재고있음, 1:대여중
		dao.insert(vo);

		vo = new BookVo();
		vo.setTitle("브레이킹던");
		vo.setRate(1);
		vo.setAuthorNo(1L);
		vo.setStatus(0); // 0:재고있음, 1:대여중
		dao.insert(vo);

		vo = new BookVo();
		vo.setTitle("아리랑");
		vo.setRate(1);
		vo.setAuthorNo(2L);
		vo.setStatus(0);
		dao.insert(vo);

		vo = new BookVo();
		vo.setTitle("젊은그들");
		vo.setRate(1);
		vo.setAuthorNo(3L);
		vo.setStatus(0);
		dao.insert(vo);

		vo = new BookVo();
		vo.setTitle("아프니깐 청춘이다");
		vo.setRate(1);
		vo.setAuthorNo(4L);
		vo.setStatus(0);
		dao.insert(vo);

		vo = new BookVo();
		vo.setTitle("귀천");
		vo.setRate(1);
		vo.setAuthorNo(5L);
		vo.setStatus(0);
		dao.insert(vo);

		vo = new BookVo();
		vo.setTitle("태백산맥");
		vo.setRate(1);
		vo.setAuthorNo(2L);
		vo.setStatus(0);
		dao.insert(vo);

		vo = new BookVo();
		vo.setTitle("풀하우스");
		vo.setRate(1);
		vo.setAuthorNo(6L);
		vo.setStatus(0);
		dao.insert(vo);
	}
}