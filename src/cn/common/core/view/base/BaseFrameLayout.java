package cn.common.core.view.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.LinearLayout;


/**
 * 布局框架
 * 
 * @author yu
 * 
 */
public abstract class BaseFrameLayout extends BaseLinearLayout {
	private BaseTitleView mTitleView;
	protected LayoutParams params = null;
	protected LinearLayout mContainerLayout;

	public BaseFrameLayout(Context context) {
		super(context);
		init();
	}

	public BaseFrameLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	private void init() {
		setBackgroundColor(getRootLayout());
		setOrientation(LinearLayout.VERTICAL);

		mContainerLayout = new LinearLayout(mContext);
		mContainerLayout.setOrientation(LinearLayout.VERTICAL);

		// 顶部Title的高度 ,ViewSize.TITLE_HEIGHT[index]是占屏幕高度的比例，index是屏幕的方向
//		int height = (int) (mHeight * ViewSize.TITLE_HEIGHT[index]);
		params = new LayoutParams(LayoutParams.MATCH_PARENT, getTitleViewHeight());
		// 上下的边距
		params.setMargins(0, 0, 0, 0);

		// 顶部TitleView
		mTitleView = getTitleView();
		if (mTitleView != null) {
			this.addView(mTitleView, params);
		}

//		// 输入框的高度
//		height = (int) (mHeight * ViewSize.INPUT_ITEM_HEIGHT[index]);
//		// 输入框的宽度
//		int width = (int) (height * ViewSize.INPUT_ITEM_WIDTH[index]);
//		// 判断横屏或竖屏
//		if (isPortrait) {
//			params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
//		} else {
//			params = new LayoutParams(width * 2, LayoutParams.MATCH_PARENT);
//		}
		// 设置为水平居中
		params.gravity = Gravity.CENTER_HORIZONTAL;
		this.addView(mContainerLayout, params);

	}

	/**
	 * 得到标题栏控件
	 * 
	 * @return
	 */
	public abstract BaseTitleView getTitleView();

	/**
	 * 获取返回按钮控件
	 * 
	 * @return
	 */
	public BaseButtonView getBackIV() {
		if (mTitleView != null) {
			return mTitleView.backIV;
		}
		return null;
	}

	/**
	 * 获取设置按钮
	 * 
	 * @return
	 */
	public BaseButtonView getRegisterIV() {
		if (mTitleView != null) {
			return mTitleView.registerIv;
		}
		return null;
	}
	
	//设置布局背景颜色
	public abstract int getRootLayout();
	//设置title高度
	public abstract int getTitleViewHeight();

}
