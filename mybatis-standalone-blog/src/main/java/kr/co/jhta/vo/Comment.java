package kr.co.jhta.vo;

import java.util.Date;

public class Comment {
	
	private int no;
	private String writer;
	private String content;
	private Blog blogNo;
	private Date createdDate;
	
	public Comment() {}

	public Comment(int no, String writer, String content, Blog blogNo, Date createdDate) {
		super();
		this.no = no;
		this.writer = writer;
		this.content = content;
		this.blogNo = blogNo;
		this.createdDate = createdDate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Blog getBlogNo() {
		return blogNo;
	}

	public void setBlogNo(Blog blogNo) {
		this.blogNo = blogNo;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	

}
