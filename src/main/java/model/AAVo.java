package model;

import java.sql.Date;

public class AAVo {
	/*anum int auto_increment primary key, -- 유일한 값, 중복 허용xxx
    aname varchar(10) not null,
    PROFILE VARCHAR(100) DEFAULT 'images\pro.jpg',
    adate DATETIME DEFAULT NOW()*/
	
	private int anum;
	private String aname;
	private String profile;
	private Date adate;
	
	public int getAnum() {
		return anum;
	}
	public void setAnum(int anum) {
		this.anum = anum;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public Date getAdate() {
		return adate;
	}
	public void setAdate(Date adate) {
		this.adate = adate;
	}
	@Override
	public String toString() {
		return "AAVo [anum=" + anum + ", aname=" + aname + ", profile=" + profile + ", adate=" + adate + "]";
	}
	
	
	
}
