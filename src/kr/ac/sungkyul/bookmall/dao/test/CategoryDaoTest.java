package kr.ac.sungkyul.bookmall.dao.test;

import java.util.List;

import kr.ac.sungkyul.bookmall.dao.CategoryDao;
import kr.ac.sungkyul.bookmall.vo.CategoryVo;

public class CategoryDaoTest {

	public static void main(String[] args) {
		testCategoryDaoInsert();
		testCategoryDaoGetList();
	}

	public static void testCategoryDaoGetList() {
		CategoryDao dao = new CategoryDao();
		List<CategoryVo> list = dao.getList();

		for (CategoryVo vo : list) {
			System.out.println(vo);
		}
	}

	public static void testCategoryDaoInsert() {
		CategoryDao dao = new CategoryDao();

		CategoryVo vo = new CategoryVo();
		vo.setGenre("소설");
		dao.insert(vo);

		vo = new CategoryVo();
		vo.setGenre("수필");
		dao.insert(vo);

		vo = new CategoryVo();
		vo.setGenre("컴퓨터/IT");
		dao.insert(vo);

		vo = new CategoryVo();
		vo.setGenre("인문");
		dao.insert(vo);

		vo = new CategoryVo();
		vo.setGenre("경제");
		dao.insert(vo);

		vo = new CategoryVo();
		vo.setGenre("예술");
		dao.insert(vo);
	}
}