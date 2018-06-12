package com.client.biz.bean;

public class Member {
	private Integer	id;
	private String	name;
	private String	msg;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", msg=" + msg + "]";
	}

}
