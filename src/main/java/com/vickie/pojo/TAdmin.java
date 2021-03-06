package com.vickie.pojo;

public class TAdmin {
    private Integer id;

    private String loginAcct;

    private String userPswd;

    private String userName;

    private String email;

    private String createTime;

    public Integer getId() {
        return id;
    }

    public TAdmin(Integer id, String loginAcct, String userPswd, String userName, String email, String createTime) {
		this.id = id;
		this.loginAcct = loginAcct;
		this.userPswd = userPswd;
		this.userName = userName;
		this.email = email;
		this.createTime = createTime;
	}

	public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginAcct() {
        return loginAcct;
    }

    public void setLoginAcct(String loginAcct) {
        this.loginAcct = loginAcct;
    }

    public String getUserPswd() {
        return userPswd;
    }

    public void setUserPswd(String userPswd) {
        this.userPswd = userPswd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}