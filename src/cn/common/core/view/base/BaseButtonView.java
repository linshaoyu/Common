package cn.common.core.view.base;

import cn.common.core.utils.ResourceUtils;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * 普通按钮
 * @author yu
 *
 */
public class BaseButtonView extends BaseRelativeLayout{
	/**
	 * 右侧有图类型
	 */
	public static final int BUTTON_TYPE_RIGHT = 2;
	/**
	 * 左侧有图类型
	 */
	public static final int BUTTON_TYPE_LEFT = 1;
	/**
	 * 左右有图类型
	 */
	public static final int BUTTON_TYPE_ALL = 3;
	
	private int mBtnType;
	private int[] mLeftSize,mRightSize,mContentSize;
	private String mLeftName,mContentName,mRightName ;
	
	private ImageView leftIV;
	private ImageView contentIV;
	private ImageView rightIV;
	
	private int contentMarginLeft;
	
	private int contentMarginRight;
	
	private int rule;
	
	public BaseButtonView(Context context) {
		super(context);
	}
	public BaseButtonView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	public BaseButtonView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}
	
	public void invalidateView() {
		init();
	}
	
	private void init(){
		LayoutParams params = null;
		if(mContentName!=null && mContentSize!=null){
			contentIV = new ImageView(mContext);
			contentIV.setBackgroundResource(ResourceUtils.findDrawableIdByName(mContext, mContentName));
			params = new LayoutParams(mContentSize[0], mContentSize[1]);
			if (rule==0) {
				params.addRule(RelativeLayout.CENTER_IN_PARENT);
			}else {
				params.addRule(rule);
			}
			params.setMargins(contentMarginLeft, 0, contentMarginRight, 0);
			this.addView(contentIV, params);
		}
		if(mBtnType==BUTTON_TYPE_RIGHT || mBtnType==BUTTON_TYPE_ALL){
			if(mRightName!=null && mRightSize!=null){
				rightIV = new ImageView(mContext);
				rightIV.setBackgroundResource(ResourceUtils.findDrawableIdByName(mContext,mRightName));
				params = new LayoutParams(mRightSize[0], mRightSize[1]);
				params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
				params.addRule(RelativeLayout.CENTER_VERTICAL);
				params.rightMargin = marginSize;
				this.addView(rightIV, params);
			}
		}
		if(mBtnType==BUTTON_TYPE_LEFT ||mBtnType==BUTTON_TYPE_ALL){
			if(mLeftName!=null && mLeftSize!=null){
				leftIV = new ImageView(mContext);
				leftIV.setBackgroundResource(ResourceUtils.findDrawableIdByName(mContext,mLeftName));
				params = new LayoutParams(mLeftSize[0], mLeftSize[1]);
				params.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
				params.addRule(RelativeLayout.CENTER_VERTICAL);
				params.leftMargin = marginSize;
				this.addView(leftIV, params);
			}
		}
	}
	/**
	 * 设置按钮类型
	 * @param mBtnType
	 */
	public void setBtnType(int mBtnType) {
		this.mBtnType = mBtnType;
	}
	/**
	 * 设置左侧图片长宽
	 * @param mLeftSize
	 */
	public void setLeftSize(int[] mLeftSize) {
		this.mLeftSize = mLeftSize;
	}
	/**
	 * 设置右侧图片长宽
	 * @param mRightSize
	 */
	public void setRightSize(int[] mRightSize) {
		this.mRightSize = mRightSize;
	}
	/**
	 * 设置中间图片长宽
	 * @param mContentSize
	 */
	public void setContentSize(int[] mContentSize) {
		this.mContentSize = mContentSize;
	}
	/**
	 * 设置左边图片名称
	 * @param mLeftName
	 */
	public void setLeftName(String mLeftName) {
		this.mLeftName = mLeftName;
	}
	/**
	 * 设置中间图片名称
	 * @param mContentName
	 */
	public void setContentName(String mContentName) {
		this.mContentName = mContentName;
	}
	/**
	 * 设置右边图片名称
	 * @param mRightName
	 */
	public void setRightName(String mRightName) {
		this.mRightName = mRightName;
	}
	public ImageView getContentIV() {
		return contentIV;
	}
	
	/**
	 * 添加margin
	 * @param contentMarginLeft
	 */
	public void setContentMarginLeft(int contentMarginLeft) {
		this.contentMarginLeft = contentMarginLeft;
	}
	public void setContentMarginRight(int contentMarginRight) {
		this.contentMarginRight = contentMarginRight;
	}
	
	/**
	 * 添加rule
	 * @param rule
	 */
	public void setRule(int rule) {
		this.rule = rule;
	}
	
}
