package com.client.biz.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer	id;

	@Column(name = "nick_name")
	private String	nickName;

	private String	pic;

	private Integer	sex;

	@Column(name = "user_name")
	private String	userName;

	@Column(name = "user_pass")
	private String	userPass;

	@Column(name = "user_mail")
	private String	userMail;

	@Column(name = "is_activate")
	private Integer	isActivate;

	@Column(name = "create_time")
	private Date	createTime;

	@Column(name = "is_alive")
	private Integer	isAlive;

	@Column(name = "update_time")
	private Date	updateTime;

	private String	token;

	@Column(name = "send_time")
	private Date	sendTime;

	@Column(name = "is_active")
	private Boolean	isActive;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName == null ? null : nickName.trim();
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic == null ? null : pic.trim();
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass == null ? null : userPass.trim();
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail == null ? null : userMail.trim();
	}

	public Integer getIsActivate() {
		return isActivate;
	}

	public void setIsActivate(Integer isActivate) {
		this.isActivate = isActivate;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getIsAlive() {
		return isAlive;
	}

	public void setIsAlive(Integer isAlive) {
		this.isAlive = isAlive;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token == null ? null : token.trim();
	}

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
}