package kr.ac.sungkyul.bookmall.dao.test;

import java.util.List;

import kr.ac.sungkyul.bookmall.dao.AuthorDao;
import kr.ac.sungkyul.bookmall.vo.AuthorVo;

public class AuthorDaoTest {

	public static void main(String[] args) {
		testAuthorDaoInsert(); // 같은 값을 넣지 않도록 막아놓는다
		// testAuthorDaoDelete(); // 같은 값을 삭제하지 않도록 막아놓는다
		// testAuthorDaoUpdate();
		// testAuthorDaoDeleteAll();
		testAuthorDaoGetList();
	}

	public static void testAuthorDaoDeleteAll() {
		AuthorDao dao = new AuthorDao();
		int count = dao.delete(); // 참조된 애는 못지움
		System.out.println("삭제된 row 수 : " + count);
	}

	public static void testAuthorDaoUpdate() {
		AuthorDao dao = new AuthorDao();

		AuthorVo vo = new AuthorVo();
		vo.setNo(1L);
		vo.setName("플라톤2");
		vo.setDescription("그리스의 철학자");
		dao.update(vo);
	}

	public static void testAuthorDaoDelete() {
		AuthorDao dao = new AuthorDao();
		int count = dao.delete(2L); // 참조된 애는 못지움
		System.out.println("삭제된 row 수 : " + count);
	}

	public static void testAuthorDaoGetList() {
		AuthorDao dao = new AuthorDao();
		List<AuthorVo> list = dao.getList();

		for (AuthorVo vo : list) {
			System.out.println(vo);
		}
	}

	public static void testAuthorDaoInsert() {
		AuthorDao dao = new AuthorDao();

		AuthorVo vo = new AuthorVo();
		vo.setName("스테파니메이어");
		vo.setDescription("");
		dao.insert(vo);

		vo = new AuthorVo();
		vo.setName("조정래");
		vo.setDescription("");
		dao.insert(vo);

		vo = new AuthorVo();
		vo.setName("김동인");
		vo.setDescription("");
		dao.insert(vo);

		vo = new AuthorVo();
		vo.setName("김난도");
		vo.setDescription("");
		dao.insert(vo);

		vo = new AuthorVo();
		vo.setName("천상병");
		vo.setDescription("");
		dao.insert(vo);

		vo = new AuthorVo();
		vo.setName("원수연");
		vo.setDescription("");
		dao.insert(vo);
	}
}