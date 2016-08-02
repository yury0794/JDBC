package kr.ac.sungkyul.bookmall.vo;

public class CartVo {
	private Integer count;
	private Long bookNo;
	private String title;
	private Integer price;
	private Long memberNo;
	private String Name;
	private Long orderno;
	
	public Long getOrderno() {
		return orderno;
	}

	public void setOrderno(Long orderno) {
		this.orderno = orderno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Long getBookNo() {
		return bookNo;
	}

	public void setBookNo(Long bookNo) {
		this.bookNo = bookNo;
	}

	public Long getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(Long memberNo) {
		this.memberNo = memberNo;
	}

	@Override
	public String toString() {
		return "CartVo [count=" + count + ", title=" + title + ", price=" + price + ", Name=" + Name + "]";
	}
}