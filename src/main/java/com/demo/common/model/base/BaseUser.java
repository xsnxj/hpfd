package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseUser<M extends BaseUser<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setUserId(java.lang.Integer userId) {
		set("userId", userId);
		return (M)this;
	}
	
	public java.lang.Integer getUserId() {
		return getInt("userId");
	}

	public M setUserName(java.lang.String userName) {
		set("userName", userName);
		return (M)this;
	}
	
	public java.lang.String getUserName() {
		return getStr("userName");
	}

	public M setPhoneNumber(java.lang.String phoneNumber) {
		set("phoneNumber", phoneNumber);
		return (M)this;
	}
	
	public java.lang.String getPhoneNumber() {
		return getStr("phoneNumber");
	}

	public M setPassword(java.lang.Integer password) {
		set("password", password);
		return (M)this;
	}
	
	public java.lang.Integer getPassword() {
		return getInt("password");
	}

	public M setWeixinId(java.lang.String weixinId) {
		set("weixinId", weixinId);
		return (M)this;
	}
	
	public java.lang.String getWeixinId() {
		return getStr("weixinId");
	}

	public M setEmail(java.lang.String email) {
		set("email", email);
		return (M)this;
	}
	
	public java.lang.String getEmail() {
		return getStr("email");
	}

	public M setCreateTime(java.util.Date createTime) {
		set("createTime", createTime);
		return (M)this;
	}
	
	public java.util.Date getCreateTime() {
		return get("createTime");
	}

	public M setInvitationCode(java.lang.String invitationCode) {
		set("invitationCode", invitationCode);
		return (M)this;
	}
	
	public java.lang.String getInvitationCode() {
		return getStr("invitationCode");
	}

	public M setScore(java.lang.Integer score) {
		set("score", score);
		return (M)this;
	}
	
	public java.lang.Integer getScore() {
		return getInt("score");
	}

	public M setFunds(java.lang.Integer funds) {
		set("funds", funds);
		return (M)this;
	}
	
	public java.lang.Integer getFunds() {
		return getInt("funds");
	}

	public M setCurrentTask(java.lang.String currentTask) {
		set("currentTask", currentTask);
		return (M)this;
	}
	
	public java.lang.String getCurrentTask() {
		return getStr("currentTask");
	}

	public M setTaskIsEnd(java.lang.Integer taskIsEnd) {
		set("taskIsEnd", taskIsEnd);
		return (M)this;
	}
	
	public java.lang.Integer getTaskIsEnd() {
		return getInt("taskIsEnd");
	}

	public M setCurrentTaskIsEnd(java.lang.Integer currentTaskIsEnd) {
		set("currentTaskIsEnd", currentTaskIsEnd);
		return (M)this;
	}
	
	public java.lang.Integer getCurrentTaskIsEnd() {
		return getInt("currentTaskIsEnd");
	}

}
