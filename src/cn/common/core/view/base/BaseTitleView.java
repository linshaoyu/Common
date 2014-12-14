package cn.common.core.view.base;

import cn.common.core.utils.ResourceUtils;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Title
 * 
 * @author yu
 * 
 */
public abstract class BaseTitleView extends BaseRelativeLayout {
	/**
	 * 返回按钮
	 */
	protected BaseButtonView backIV;
	protected BaseButtonView registerIv;

	/**
	 * 标题栏
	 */
	private ImageView titleIV;

	public BaseTitleView(Context context) {
		super(context);
		init(context);
	}

	public BaseTitleView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(context);
	}

	public BaseTitleView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init(context);
	}

	private void init(Context context) {
		setBackgroundResource(ResourceUtils.findDrawableIdByName(mContext, "efun_bg_title"));
		backIV = new BaseButtonView(mContext);
		backIV.setBackgroundResource(ResourceUtils.findDrawableIdByName(mContext, getBtnLeftBg()));
		if (!TextUtils.isEmpty(getBtnLeftTxt())) {
			backIV.setContentName(getBtnLeftTxt());
//			backIV.setContentSize(new int[] { (int) (getBackSize()[0] * ViewSize.TITLE_BACK_CONTENT_WIDTH[index]), (int) (getBackSize()[0] * ViewSize.TITLE_BACK_CONTENT_HEIGHT[index]) });
		}
		LayoutParams params = new LayoutParams(getBackSize()[0], getBackSize()[1]);
		params.addRule(RelativeLayout.CENTER_VERTICAL);
		params.setMargins(marginSize / 2, 0, 0, 0);
		this.addView(backIV, params);
		if (!TextUtils.isEmpty(titleName())) {
			titleIV = new ImageView(mContext);
			titleIV.setBackgroundResource(ResourceUtils.findDrawableIdByName(mContext, titleName()));
			params = new LayoutParams(getTitleSize()[0], getTitleSize()[1]);
			params.addRule(RelativeLayout.CENTER_IN_PARENT);
			this.addView(titleIV, params);
		}
		registerIv = new BaseButtonView(mContext);
		registerIv.setBackgroundResource(ResourceUtils.findDrawableIdByName(mContext, getBtnRightBg()));
		if (!TextUtils.isEmpty(getBtnRightTxt())) {
			registerIv.setContentName(getBtnRightTxt());
//			registerIv.setContentSize(new int[] { (int) (getBackSize()[0] * ViewSize.TITLE_BACK_CONTENT_WIDTH[index]), (int) (getBackSize()[0] * ViewSize.TITLE_BACK_CONTENT_HEIGHT[index]) });
		}
		params = new LayoutParams(getSetSize()[0], getSetSize()[1]);
		params.addRule(RelativeLayout.CENTER_VERTICAL);
		params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
		params.setMargins(0, 0, marginSize / 2, 0);
		this.addView(registerIv, params);

		if (!hasSetButton()) {
			registerIv.setVisibility(View.GONE);
		} else {
			registerIv.invalidateView();
		}
		if (!hasBackButton()) {
			backIV.setVisibility(View.GONE);
		} else {
			backIV.invalidateView();
		}
		// titleIV.setVisibility(View.GONE);

	}

	/**
	 * 标题资源名称
	 * 
	 * @return
	 */
	public abstract String titleName();

	/**
	 * 返回按钮长宽
	 * 
	 * @return
	 */
	public abstract int[] getBackSize();

	/**
	 * 标题长宽
	 * 
	 * @return
	 */
	public abstract int[] getTitleSize();

	/**
	 * 设置按钮长宽
	 * 
	 * @return
	 */
	public abstract int[] getSetSize();

	/**
	 * 是否包含设置按钮
	 * 
	 * @return
	 */
	public abstract boolean hasSetButton();

	/**
	 * 是否包含返回按钮
	 * 
	 * @return
	 */
	public abstract boolean hasBackButton();

	/**
	 * 左键的背景图
	 * 
	 * @return
	 */
	public abstract String getBtnLeftBg();

	/**
	 * 右键的背景图
	 * 
	 * @return
	 */
	public abstract String getBtnRightBg();

	/**
	 * 顶部左键的txt
	 * 
	 * @return
	 */
	public abstract String getBtnLeftTxt();

	/**
	 * 顶部右键的txt
	 * 
	 * @return
	 */
	public abstract String getBtnRightTxt();
}
