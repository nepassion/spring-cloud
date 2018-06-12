package com.client.biz.model;

import java.util.Date;

public class User {
	private Integer	id;

	/**
	 * 昵称
	 */
	private String	nickName;

	/**
	 * 头像
	 */
	private String	pic;

	/**
	 * 性别
	 */
	private Integer	sex;

	/**
	 * 登录名
	 */
	private String	userName;

	private String	userPass;

	/**
	 * 用户邮箱
	 */
	private String	userMail;

	/**
	 * 0.未激活 1已激活
	 */
	private Integer	isActivate;

	/**
	 * 创建时间
	 */
	private Date	createTime;

	/**
	 * 活动状态 0.未活动 1.正在活动
	 */
	private Integer	isAlive;

	private Date	updateTime;

	private String	token;

	private Date	sendTime;

	private Boolean	isActive;

	/**
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 获取昵称
	 *
	 * @return nick_name - 昵称
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * 设置昵称
	 *
	 * @param nickName
	 *            昵称
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	/**
	 * 获取头像
	 *
	 * @return pic - 头像
	 */
	public String getPic() {
		return pic;
	}

	/**
	 * 设置头像
	 *
	 * @param pic
	 *            头像
	 */
	public void setPic(String pic) {
		this.pic = pic;
	}

	/**
	 * 获取性别
	 *
	 * @return sex - 性别
	 */
	public Integer getSex() {
		return sex;
	}

	/**
	 * 设置性别
	 *
	 * @param sex
	 *            性别
	 */
	public void setSex(Integer sex) {
		this.sex = sex;
	}

	/**
	 * 获取登录名
	 *
	 * @return user_name - 登录名
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 设置登录名
	 *
	 * @param userName
	 *            登录名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return user_pass
	 */
	public String getUserPass() {
		return userPass;
	}

	/**
	 * @param userPass
	 */
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	/**
	 * 获取用户邮箱
	 *
	 * @return user_mail - 用户邮箱
	 */
	public String getUserMail() {
		return userMail;
	}

	/**
	 * 设置用户邮箱
	 *
	 * @param userMail
	 *            用户邮箱
	 */
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	/**
	 * 获取0.未激活 1已激活
	 *
	 * @return is_activate - 0.未激活 1已激活
	 */
	public Integer getIsActivate() {
		return isActivate;
	}

	/**
	 * 设置0.未激活 1已激活
	 *
	 * @param isActivate
	 *            0.未激活 1已激活
	 */
	public void setIsActivate(Integer isActivate) {
		this.isActivate = isActivate;
	}

	/**
	 * 获取创建时间
	 *
	 * @return create_time - 创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 设置创建时间
	 *
	 * @param createTime
	 *            创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 获取活动状态 0.未活动 1.正在活动
	 *
	 * @return is_alive - 活动状态 0.未活动 1.正在活动
	 */
	public Integer getIsAlive() {
		return isAlive;
	}

	/**
	 * 设置活动状态 0.未活动 1.正在活动
	 *
	 * @param isAlive
	 *            活动状态 0.未活动 1.正在活动
	 */
	public void setIsAlive(Integer isAlive) {
		this.isAlive = isAlive;
	}

	/**
	 * @return update_time
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * @param updateTime
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * @return token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * @return send_time
	 */
	public Date getSendTime() {
		return sendTime;
	}

	/**
	 * @param sendTime
	 */
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	/**
	 * @return is_active
	 */
	public Boolean getIsActive() {
		return isActive;
	}

	/**
	 * @param isActive
	 */
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", nickName=" + nickName + ", pic=" + pic + ", sex=" + sex + ", userName=" + userName
				+ ", userPass=" + userPass + ", userMail=" + userMail + ", isActivate=" + isActivate + ", createTime="
				+ createTime + ", isAlive=" + isAlive + ", updateTime=" + updateTime + ", token=" + token
				+ ", sendTime=" + sendTime + ", isActive=" + isActive + "]";
	}

}