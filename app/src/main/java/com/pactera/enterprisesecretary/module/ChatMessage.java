package com.pactera.enterprisesecretary.module;

import java.io.Serializable;
import java.util.Map;

/**
 * 聊天信息包装类
 * 
 * @author Savvy 2014.11.28
 */
public class ChatMessage implements Serializable {

	private static final long serialVersionUID = -4012977018484775771L;

	private String name;// 名称
	private String type;// 内容类型
	private String message;// 信息
	private String voice;// 声音
	private String image;// 图片
	private String imagePath;// 图片地址
	private Map<String, String> order;// 订单
	private String systemInfo;// 系统信息
	private boolean messageFlag;// 信息类型,true为发送，false为接收
	private String sentTime;// 信息发送时间
	private String voicePath;// 声音文件路径
	private int voiceTime;// 音频时间
	private String loginUserHeadImage;// 登录的用户的头像
	private String chatUserHeadImage;// 对方的头像

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getVoice() {
		return voice;
	}

	public void setVoice(String voice) {
		this.voice = voice;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public boolean isMessageFlag() {
		return messageFlag;
	}

	public void setMessageFlag(boolean messageFlag) {
		this.messageFlag = messageFlag;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSentTime() {
		return sentTime;
	}

	public void setSentTime(String sentTime) {
		this.sentTime = sentTime;
	}

	public String getVoicePath() {
		return voicePath;
	}

	public void setVoicePath(String voicePath) {
		this.voicePath = voicePath;
	}

	public int getVoiceTime() {
		return voiceTime;
	}

	public void setVoiceTime(int voiceTime) {
		this.voiceTime = voiceTime;
	}

	public Map<String, String> getOrder() {
		return order;
	}

	public void setOrder(Map<String, String> order) {
		this.order = order;
	}

	public String getLoginUserHeadImage() {
		return loginUserHeadImage;
	}

	public void setLoginUserHeadImage(String loginUserHeadImage) {
		this.loginUserHeadImage = loginUserHeadImage;
	}

	public String getChatUserHeadImage() {
		return chatUserHeadImage;
	}

	public void setChatUserHeadImage(String chatUserHeadImage) {
		this.chatUserHeadImage = chatUserHeadImage;
	}

	public String getSystemInfo() {
		return systemInfo;
	}

	public void setSystemInfo(String systemInfo) {
		this.systemInfo = systemInfo;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

}
