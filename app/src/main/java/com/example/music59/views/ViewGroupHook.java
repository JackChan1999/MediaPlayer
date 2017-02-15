package com.example.music59.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

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

public class ViewGroupHook extends FrameLayout {

	public ViewGroupHook(Context paramContext) {
		super(paramContext);
	}

	public ViewGroupHook(Context paramContext, AttributeSet paramAttributeSet) {
		super(paramContext, paramAttributeSet);
	}

	public ViewGroupHook(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
		super(paramContext, paramAttributeSet, paramInt);
	}

	// 为了保证能够响应触摸事件 返回true
	public boolean onTouchEvent(MotionEvent paramMotionEvent) {
		//		return super.onTouchEvent(paramMotionEvent);
		//action_down
		//action_move
		switch (paramMotionEvent.getAction()) {
		case MotionEvent.ACTION_DOWN:
			System.out.println("---viewGroudHook---onTouchEvent---ACTION_DOWN");
			break;
		case MotionEvent.ACTION_MOVE:
			System.out.println("---viewGroudHook---onTouchEvent---ACTION_MOVE");
			break;
		case MotionEvent.ACTION_UP:
			System.out.println("---viewGroudHook---onTouchEvent---ACTION_UP");

			break;
		case MotionEvent.ACTION_CANCEL:
			System.out.println("---viewGroudHook---onTouchEvent---ACTION_CANCEL");
			
			break;

		default:
			break;
		}
		return true;//action_down
	}
}
