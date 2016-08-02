package kr.ac.sungkyul.bookmall.app;

import java.util.List;
import java.util.Scanner;

import kr.ac.sungkyul.bookmall.dao.BookDao;
import kr.ac.sungkyul.bookmall.vo.BookVo;

public class BookMall {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("대여 하고 싶은 책의 번호를 입력하세요:");
		Long bookNo = scanner.nextLong();

		BookDao dao = new BookDao();
		dao.update(bookNo, 1/* 대여중 */ );

		System.out.println("*****도서 정보 출력하기******");
		displayBookInfo();

		scanner.close();
	}

	public static void displayBookInfo() {
		BookDao dao = new BookDao();
		List<BookVo> list = dao.getList();

		for (BookVo vo : list) {
			System.out.println("책제목:" + vo.getTitle() + ", " + "저자:" + vo.getAuthorName() + ", " + "대여유무:"
					+ (vo.getStatus() == 0 ? "재고있음" : "대여중"));
		}
	}
}