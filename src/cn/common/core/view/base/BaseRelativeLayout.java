package cn.common.core.view.base;

import cn.common.core.utils.ScreenUtils;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.RelativeLayout;


public class BaseRelativeLayout extends RelativeLayout{
	protected int index;
	/**
	 * 屏幕帮助类
	 */
	protected ScreenUtils mScreen;
	/**
	 * 上线文对象
	 */
	protected Context mContext;
	/**
	 * 判断是否是手机设备
	 */
	protected boolean isPhone;
	/**
	 * 设备宽度
	 */
	protected int mWidth;
	/**
	 * 设备高度
	 */
	protected int mHeight;
	/**
	 * margin大小
	 */
	protected int marginSize;
	
	protected boolean isPortrait;
	public BaseRelativeLayout(Context context) {
		super(context);
		init(context);
	}
	public BaseRelativeLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(context);
	}
	public BaseRelativeLayout(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init(context);
	}
	private void init(Context context){
		mContext = context;
		mScreen = ScreenUtils.getInStance((Activity)mContext);
		isPortrait = mScreen.isPortrait((Activity)mContext);
		mWidth = mScreen.getPxWidth();
		mHeight= mScreen.getPxHeight();
		isPhone= mScreen.isPhone(context);
		if(isPortrait){
			marginSize = mWidth / 20;
			index = 1;
		}else{
			marginSize = mWidth / 50;
			index = 0;
		}
	}
	
	public int color(int[] colors){
		return Color.rgb(colors[0], colors[1], colors[2]);
	}
}
