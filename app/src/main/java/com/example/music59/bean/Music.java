package com.example.music59.bean;

/**
 * ============================================================
 * Copyright：${TODO}有限公司版权所有 (c) 2017
 * Author：   陈冠杰
 * Email：    815712739@qq.com
 * GitHub：   https://github.com/JackChen1999
 * 博客：     http://blog.csdn.net/axi295309066
 * 微博：     AndroidDeveloper
 * <p>
 * Project_Name：MediaPlayer
 * Package_Name：com.example.music59
 * Version：1.0
 * time：2016/2/15 12:44
 * des ：手机影音
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/

public class Music {
	public String title;//歌曲名
	public String artist;//歌手
	public String path;//路径
	public Music(String title, String artist, String path) {
		super();
		this.title = title;
		this.artist = artist;
		this.path = path;
	}
	
}
