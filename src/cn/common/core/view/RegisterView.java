package cn.common.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.inputmethod.EditorInfo;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import cn.common.core.constant.Constant.ViewSelecter;
import cn.common.core.constant.Constant.ViewSize;
import cn.common.core.utils.ResourceUtils;
import cn.common.core.view.base.BaseButtonView;
import cn.common.core.view.base.BaseFrameLayout;
import cn.common.core.view.base.BaseInputView;
import cn.common.core.view.base.BaseTitleView;


public class RegisterView extends BaseFrameLayout {
	private BaseInputView mInputLayoutView;
	private BaseButtonView mRegisterBtn;
	private CheckBox checkCB;
	private ImageView protorlIV;

	public RegisterView(Context context) {
		super(context);
		init();
	}

	public RegisterView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	private void init() {
		// 获取输入框
		mInputLayoutView = getInputLayout();
		int height = (int) (mHeight * ViewSize.INPUT_ITEM_HEIGHT[index]);
		int width = 0;
		// 单个输入框的高度*4
		params = new LayoutParams(LayoutParams.MATCH_PARENT, height * BaseInputView.INPUT_NUM_4);
		if (isPortrait) {
			params.setMargins(marginSize, marginSize*2, marginSize, 0);
		}
		mContainerLayout.addView(mInputLayoutView, params);

		initButtonViews();

		// 同意协议的选项
		// checkCB = new BaseImageView(mContext);
		checkCB = new CheckBox(mContext);
		// checkCB.setButtonDrawable(EfunResourceUtil.findDrawableIdByName(mContext,
		// "efun_checkbox_focus"));
		checkCB.setChecked(true);
		checkCB.setButtonDrawable(ResourceUtils.findDrawableIdByName(mContext, "efun_checkbox_focus"));
		// checkCB.setBackgroundResource(BitmapUtil.createDrawable(mContext,
		// "efun_checkbox_focus"));

		// 会员条款的Imageview
		protorlIV = new ImageView(mContext);
		protorlIV.setBackgroundResource(ResourceUtils.findDrawableIdByName(mContext, "efun_clause"));

		// 我已同意的那一行的所有控件
		LinearLayout tempLayout = new LinearLayout(mContext);
		tempLayout.setOrientation(LinearLayout.HORIZONTAL);
		tempLayout.setGravity(Gravity.CENTER_VERTICAL);
		height = (int) (mHeight * ViewSize.TEXT_HEIGHT[index]);
		width = height;
		params = new LayoutParams((int) (width * 1.5f), (int) (height * 1.5f));
		params.rightMargin = marginSize / 4;
		tempLayout.addView(checkCB, params);

		width = (int) (height * ViewSize.TEXT_PROTORL_WIDTH[index]);
		params = new LayoutParams(width, height);
		tempLayout.addView(protorlIV, params);

		params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
		params.setMargins(marginSize / 3 * 2, marginSize / 2, marginSize / 3 * 2, 0);
		mContainerLayout.addView(tempLayout, params);

		height = (int) (mHeight * ViewSize.THIRD_LOGIN_BUTTON_HEIGHT[index]);
		params = new LayoutParams(LayoutParams.MATCH_PARENT, height);
		if (isPortrait) {
			params.setMargins(marginSize, marginSize / 2, marginSize, 0);
		}
		mContainerLayout.addView(mRegisterBtn, params);

	}

	// 注册按钮
	private void initButtonViews() {
		int height = (int) (mHeight * ViewSize.COMMON_BUTTON_HEIGHT[index]) / 2;
		int width = (int) (height * ViewSize.COMMON_BUTTON_REGISTER_WIDTH[index]);
		mRegisterBtn = new BaseButtonView(mContext);
		mRegisterBtn.setBtnType(BaseButtonView.BUTTON_TYPE_RIGHT);
		mRegisterBtn.setContentName("efun_register_btn");
		mRegisterBtn.setContentSize(new int[] { width, height });
		width = height;
		mRegisterBtn.setRightName("efun_arrow");
		mRegisterBtn.setRightSize(new int[] { width, height });
		mRegisterBtn.setBackgroundResource(ResourceUtils.findDrawableIdByName(mContext, ViewSelecter.EFUN_COMMON_BTN_SELECTER));
		mRegisterBtn.invalidateView();
	}

	// 输入框
	private BaseInputView getInputLayout() {
		return new BaseInputView(mContext) {
			// 行为
			@Override
			public int[] setInputImeOptions() {
				return new int[] { EditorInfo.IME_ACTION_NEXT, EditorInfo.IME_ACTION_NEXT, EditorInfo.IME_ACTION_NEXT, EditorInfo.IME_ACTION_DONE };
			}

			// 默认提示
			@Override
			public String[] setInputHints() {
				return new String[] { "hint_account", "hint_password", "hint_confirn_password", "hint_email" };
			}

			// 是否密码类型
			@Override
			public boolean[] passwordTypes() {
				return new boolean[] { false, true, true, false };
			}

			// 输入框个数
			@Override
			public int inputNums() {
				return INPUT_NUM_4;
			}

			// 背景
			@Override
			public String inputBackground() {
				return "efun_input_4_bg";
			}

			@Override
			public String[] setInputTitle() {
				// TODO Auto-generated method stub
				return new String[] { "efun_reset_psw_account", "efun_bind_account_psw", "efun_bind_account_confirm_psw", "efun_bind_account_email" };
			}

			@Override
			public float setHintRate() {
				// TODO Auto-generated method stub
				return 0.165803f;
			}

			@Override
			public float setHintWidthRate() {
				// TODO Auto-generated method stub
				return 0.3f;
			}

			@Override
			public void hasContent() {
				// TODO Auto-generated method stub
			}

			@Override
			public void hasNoContent() {
				// TODO Auto-generated method stub

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
				return false;
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

	public BaseButtonView getRegisterBtn() {
		return mRegisterBtn;
	}

	public CheckBox getCheckCB() {
		return checkCB;
	}

	public ImageView getProtorlIV() {
		return protorlIV;
	}

	public BaseInputView getInputLayoutView() {
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
