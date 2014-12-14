package cn.common.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import cn.common.core.constant.Constant.ViewSelecter;
import cn.common.core.constant.Constant.ViewSize;
import cn.common.core.utils.ResourceUtils;
import cn.common.core.view.base.BaseButtonView;
import cn.common.core.view.base.BaseFrameLayout;
import cn.common.core.view.base.BaseInputView;
import cn.common.core.view.base.BaseTitleView;


/**
 * 登陸界面
 * 
 * @author yu
 * 
 */
public class LoginView extends BaseFrameLayout {
	private BaseInputView mInputLayoutView;
	private BaseButtonView mLoginBtn, mFreeBtn;
	private View helpView;

	public LoginView(Context context) {
		super(context);
		init();
	}

	public LoginView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	private void init() {
		// 输入框的设置
		mInputLayoutView = getInputLayout();

		// mHeight是屏幕高度。每个输入框的高度是屏幕高度*0.07（竖屏）
		int height = (int) (mHeight * ViewSize.INPUT_ITEM_HEIGHT[index]);
		int width;
		// 每个输入框的高度*输入框个数
		params = new LayoutParams(LayoutParams.MATCH_PARENT, height * BaseInputView.INPUT_NUM_2);
		// 当竖屏的时候Margin变大
		if (isPortrait) {
			params.setMargins(marginSize, marginSize*2, marginSize, 0);
		}
		// 添加输入框
		mContainerLayout.addView(mInputLayoutView, params);

		// 实例两个Button 登入，游客登入
		initButtonViews();

		// 添加登陆按钮
		params = new LayoutParams(LayoutParams.MATCH_PARENT, (int) (mHeight * ViewSize.THIRD_LOGIN_BUTTON_HEIGHT[index]));
		params.setMargins(marginSize, marginSize / 2, marginSize, 0);
		mContainerLayout.addView(mLoginBtn, params);

		RelativeLayout ryMore = new RelativeLayout(mContext);
		// 添加更多功能按钮
		helpView = new ImageView(mContext);
		helpView.setBackgroundResource(ResourceUtils.findDrawableIdByName(mContext, "efun_account_more"));

		// 免注册登陆
		height = (int) (mHeight * ViewSize.THIRD_LOGIN_BUTTON_HEIGHT[index]);
		params = new LayoutParams(LayoutParams.MATCH_PARENT, height);
		if (isPortrait) {
			params.setMargins(marginSize, marginSize / 2, marginSize, marginSize);
		} else {
		}
		mContainerLayout.addView(mFreeBtn, params);

		// 更多选项的按钮 index=1是竖屏
		height = (int) (mHeight * ViewSize.TEXT_HEIGHT[index]);
		width = (int) (height * ViewSize.TEXT_ACCOUNT_MORE_WIDTH[index]);
		android.widget.RelativeLayout.LayoutParams paramsMore;
		paramsMore = new android.widget.RelativeLayout.LayoutParams(width, height);
		paramsMore.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
		paramsMore.setMargins(0, 0, marginSize / 2, 0);
		ryMore.addView(helpView, paramsMore);

		params = new LayoutParams(LayoutParams.MATCH_PARENT, height);
		mContainerLayout.addView(ryMore, params);
	}

	private void initButtonViews() {
		int height = (int) (mHeight * ViewSize.COMMON_BUTTON_HEIGHT[index]) / 2;
		int width = (int) (height * ViewSize.COMMON_BUTTON_LOGIN_WIDTH[index]);
		// 登陆按钮
		mLoginBtn = new BaseButtonView(mContext);
		mLoginBtn.setBtnType(BaseButtonView.BUTTON_TYPE_RIGHT);
		mLoginBtn.setContentName("efun_login_btn_hide_selecter");
		mLoginBtn.setContentSize(new int[] { width, height });
		width = height;
		mLoginBtn.setRightName("efun_arrow");
		mLoginBtn.setRightSize(new int[] { width, height });
		mLoginBtn.setBackgroundResource(ResourceUtils.findDrawableIdByName(mContext, ViewSelecter.EFUN_COMMON_BTN_SELECTER));
		mLoginBtn.invalidateView();
		// height = (int) (height / 1.5);

		width = (int) (height * ViewSize.THIRD_LOGIN_BUTTON_FREE_WIDTH[index]);
		mFreeBtn = new BaseButtonView(mContext);
		mFreeBtn.setContentName("efun_third_free_btn");
		mFreeBtn.setContentSize(new int[] { width, height });
		mFreeBtn.setBackgroundResource(ResourceUtils.findDrawableIdByName(mContext, ViewSelecter.EFUN_COMMON_BTN_SELECTER));
		mFreeBtn.invalidateView();

	}

	private BaseInputView getInputLayout() {
		return new BaseInputView(mContext) {
			@Override
			public int[] setInputImeOptions() {
				return new int[] { EditorInfo.IME_ACTION_NEXT, EditorInfo.IME_ACTION_DONE };
			}

			@Override
			public String[] setInputHints() {
				return new String[] { "hint_account", "hint_password" };
			}

			@Override
			public boolean[] passwordTypes() {
				return new boolean[] { false, true };
			}

			@Override
			public int inputNums() {
				return INPUT_NUM_2;
			}

			@Override
			public String inputBackground() {
				return "efun_input_2_bg";
			}

			@Override
			public String[] setInputTitle() {
				// TODO Auto-generated method stub
				return new String[] { "efun_account_hint", "efun_psw_hint" };
			}

			@Override
			public float setHintRate() {
				// TODO Auto-generated method stub
				return 0.4081632f;
			}

			@Override
			public float setHintWidthRate() {
				// TODO Auto-generated method stub
				return 0.16f;
			}

			@Override
			public void hasContent() {
				// TODO Auto-generated method stub
				mLoginBtn.getContentIV().setEnabled(true);
				mLoginBtn.setClickable(true);
			}

			@Override
			public void hasNoContent() {
				// TODO Auto-generated method stub
				mLoginBtn.getContentIV().setEnabled(false);
				mLoginBtn.setClickable(false);
			}
		};
	}

	@Override
	public BaseTitleView getTitleView() {
		return new BaseTitleView(mContext) {
			int width = 0;
			int height = 0;

			@Override
			public String titleName() {
				return "";
			}

			@Override
			public int[] getTitleSize() {
				height = (int) (mHeight * ViewSize.TITLE_NAME_HEIGHT[index]);
				width = (int) (height * ViewSize.TITLE_LOGIN_WIDTH[index]);
				return new int[] { width, height };
			}

			@Override
			public int[] getBackSize() {
				height = (int) (mHeight * ViewSize.TITLE_BACK_HEIGHT[index]);
				width = (int) (height * ViewSize.TITLE_BACK_WIDTH[index]);
				return new int[] { width, height };
			}

			@Override
			public int[] getSetSize() {
				height = (int) (mHeight * ViewSize.TITLE_SET_HEIGHT[index]);
				width = (int) (height * ViewSize.TITLE_BACK_WIDTH[index]);
				return new int[] { width, height };
			}

			@Override
			public boolean hasSetButton() {
				return true;
			}

			@Override
			public String getBtnLeftBg() {
				// TODO Auto-generated method stub
				return "efun_back_normal";
			}

			@Override
			public String getBtnRightBg() {
				// TODO Auto-generated method stub
				return "efun_register_normal";
			}

			@Override
			public String getBtnLeftTxt() {
				// TODO Auto-generated method stub
				return "efun_back_content_normal";
			}

			@Override
			public String getBtnRightTxt() {
				// TODO Auto-generated method stub
				return "efun_register_content_normal";
			}

			@Override
			public boolean hasBackButton() {
				// TODO Auto-generated method stub
				return true;
			}
		};
	}

	public BaseInputView getInputLayoutView() {
		return mInputLayoutView;
	}

	public BaseButtonView getLoginBtn() {
		return mLoginBtn;
	}

	public BaseButtonView getFreeBtn() {
		return mFreeBtn;
	}

	public View getHelpView() {
		return helpView;
	}

	public BaseInputView getmInputLayoutView() {
		return mInputLayoutView;
	}

	@Override
	public int getRootLayout() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTitleViewHeight() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
