package kr.ac.sungkyul.bookmall.dao.test;

import java.util.List;

import kr.ac.sungkyul.bookmall.dao.MemberDao;
import kr.ac.sungkyul.bookmall.vo.MemberVo;

public class MemberDaoTest {

	public static void main(String[] args) {
		testMemberDaoInsert();
		testMemberDaoGetList();
	}
	
	public static void testMemberDaoGetList() {
		MemberDao dao = new MemberDao();
		List<MemberVo> list = dao.getList();

		for (MemberVo vo : list) {
			System.out.println(vo);
		}
	}
	
	public static void testMemberDaoInsert() {
		MemberDao dao = new MemberDao();
		
		MemberVo vo = new MemberVo();
		vo.setName("전유리");
		vo.setPhone("111-1111-1111");
		vo.setEmail("a@naver.com");
		vo.setPassword("123456");
		vo.setAddress("경기도");		
		dao.insert(vo);
	}
}