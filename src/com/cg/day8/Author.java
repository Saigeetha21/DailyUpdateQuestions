package com.cg.day8;

public class Author {
	String aname;
	String aemail;
	int aphn;
	Book bk;
	
	public Author(String aname, String aemail, int aphn, Book bk) {
		super();
		this.aname = aname;
		this.aemail = aemail;
		this.aphn = aphn;
		this.bk = bk;
	}
	
	public Author() {
		super();
	}
	
	public String getAname() {
		return aname;
	}
	
	public void setAname(String aname) {
		this.aname = aname;
	}
	
	public String getAemail() {
		return aemail;
		
	}
	
	public void setAemail(String aemail) {
		this.aemail =  aemail;
	}
	
	public int getAphn() {
		return aphn;
	}
	
	public void setAphn(int aphn) {
		this.aphn=aphn;
	}
	
	public Book getBk() {
		return bk;
	}
	
	public void setBk(Book bk) {
		this.bk = bk;
	}

	@Override
	public String toString() {
		return "Author [aname=" + aname + ", aemail=" + aemail + ", aphn=" + aphn + ",bk="+bk+"]";
	}
	
	

}
