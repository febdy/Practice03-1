package com.javaex.problem08;

public class Book {
	int bookNo;
	String title;
	String author;
	int stateCode;

	public Book() {

	}

	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void rent() {
		System.out.println(this.title + "이(가) 대여 됐습니다.");
		this.stateCode = 0;
	}

	public void print() {
		System.out.print("책 제목:" + this.title + 
				", 작가:" + this.author + 
				", 대여 유무:");
		
		if(this.stateCode == 0)
			System.out.println("대여중");
		else if(this.stateCode == 1)
			System.out.println("재고있음");

	}

}
