package cn.common.core.view.base;

import java.util.ArrayList;

import cn.common.core.utils.LogUtils;
import cn.common.core.utils.ResourceUtils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputType;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * 输入框
 * 
 * @author yu
 * 
 */
public abstract class BaseInputView extends BaseLinearLayout {
	/**
	 * 两个输入框类型
	 */
	public static final int INPUT_NUM_2 = 2;
	/**
	 * 三个输入框类型
	 */
	public static final int INPUT_NUM_3 = 3;
	/**
	 * 四个输入框类型
	 */
	public static final int INPUT_NUM_4 = 4;

	/**
	 * 
	 */
	private BaseButtonView mIvHint;

	/**
	 * 
	 */
	private String[] inputTitle;

	private ArrayList<EditText> viewOfArray;

	private float hintRate ;
	
	private float hintWidthRate;

	public BaseInputView(Context context) {
		super(context);
		init(context);
	}

	public BaseInputView(Context context, AttributeSet attrs) {
		super(context, attrs); 
		init(context);
	}

	private void init(Context context) {
		setOrientation(LinearLayout.VERTICAL);
		setBackgroundResource(ResourceUtils.findDrawableIdByName(context, inputBackground()));
		if (inputNums() == 0) {
			return;
		}
		inputTitle = setInputTitle();
		hintRate=setHintRate();
		hintWidthRate=setHintWidthRate();
		createInputs();

	}

	/**
	 * 创建输入框
	 */
	@SuppressLint("NewApi")
	private void createInputs() {
		viewOfArray = new ArrayList<EditText>(4);
		EditText itemInputView = null;
		// 1.0f weight
		// 每行的布局
		LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT,
				LayoutParams.MATCH_PARENT, 1.0f);
		params.gravity = Gravity.CENTER_VERTICAL;
		// 每个输入框前的提示部分（如账号）
		LayoutParams paramsTxt = new LayoutParams((int) (mWidth * hintWidthRate),
				LayoutParams.MATCH_PARENT);
		params.leftMargin=marginSize/4;
//		int width = (int) (mWidth *hintWidthRate*Constant.ViewSize.HINTS_NAME_WIDTH[index]);
//		int height = (int) (width * hintRate);

		LayoutParams paramsInput = new LayoutParams(LayoutParams.MATCH_PARENT,
				LayoutParams.WRAP_CONTENT);

		for (int i = 0; i < inputNums(); i++) {
			LinearLayout ly = new LinearLayout(mContext);
			ly.setOrientation(HORIZONTAL);

			mIvHint = new BaseButtonView(mContext);
//			mIvHint.setContentSize(new int[] { width, height });
			if (inputTitle.length > i) {
				mIvHint.setContentName(inputTitle[i]);
			}

			itemInputView = new EditText(mContext);
			// 设置背景
			itemInputView.setBackgroundResource(0);
			// 设置隐藏提示
			itemInputView.setHint(ResourceUtils.findStringIdByName(mContext,
					setInputHints()[i]));
			// 设置单行
			itemInputView.setSingleLine(true);
			// 设置行为
			itemInputView.setImeOptions(setInputImeOptions()[i]);
			// 设置颜色类型
			itemInputView.setTextColor(Color.BLACK);
			// 设置字体大小
			itemInputView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 17);
			// 设置隐藏提示的颜色
			itemInputView.setHintTextColor(Color.LTGRAY);
			// 限定字数
			itemInputView
					.setFilters(new InputFilter[] { new InputFilter.LengthFilter(
							60) });
			// 设置密码类型	
			if (passwordTypes()[i]) {
				itemInputView.setInputType(InputType.TYPE_CLASS_TEXT
						| InputType.TYPE_TEXT_VARIATION_PASSWORD);
			}
			ly.addView(mIvHint, paramsTxt);
			ly.addView(itemInputView, paramsInput);
			this.addView(ly, params);
			mIvHint.invalidateView();
			// 添加到列表
			viewOfArray.add(itemInputView);
			itemInputView.addTextChangedListener(new TextWatcher() {
				
				@Override
				public void onTextChanged(CharSequence s, int start, int before, int count) {
					// TODO Auto-generated method stub
					//判断是否有输入文字
					if (isInput()) {
						LogUtils.logI("Input");
						hasContent();
					}else {
						hasNoContent();
					}
				}
				
				@Override
				public void beforeTextChanged(CharSequence s, int start, int count,
						int after) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void afterTextChanged(Editable s) {
					// TODO Auto-generated method stub
					
				}
			});
		}
	}

	/**
	 * 获取输入的值
	 * 
	 * @return
	 */
	public String[] getContentValues() {
		EditText itemInputView = null;
		String[] values = new String[inputNums()];
		for (int i = 0; i < viewOfArray.size(); i++) {
			itemInputView = viewOfArray.get(i);
			values[i] = itemInputView.getText().toString();
		}
		return values;
	}
	
	/**
	 * 判断用户是否输入了数据
	 * @return
	 */
	public boolean isInput(){
		for (int i = 0; i < getContentValues().length; i++) {
			if (!TextUtils.isEmpty(getContentValues()[i])) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 设置输入的值
	 * 
	 * @return
	 */
	public void setContentValues(String[] values) {
		EditText itemInputView = null;
		for (int i = 0; i < values.length; i++) {
			itemInputView = viewOfArray.get(i);
			itemInputView.setText(values[i]);
		}
	}

	/**
	 * 输入框个数
	 * 
	 * @return
	 */
	public abstract int inputNums();

	/**
	 * 输入背景
	 * 
	 * @return
	 */
	public abstract String inputBackground();

	/**
	 * 设置Hint默认值
	 * 
	 * @return
	 */
	public abstract String[] setInputHints();

	/**
	 * 设置软键盘点击动作
	 * 
	 * @return
	 */
	public abstract int[] setInputImeOptions();

	/**
	 * 设置是否是密码类型
	 * 
	 * @return
	 */
	public abstract boolean[] passwordTypes();

	/**
	 * 设置输入框前的提示
	 */
	public abstract String[] setInputTitle();

	/**
	 * 设置前面文字的比率
	 */
	public abstract float setHintRate();
	
	/**
	 * 设置前面文字的比率
	 */
	public abstract float setHintWidthRate();
	
	/**
	 * 有输入框不为空的回调事件
	 */
	public abstract void hasContent();
	
	/**
	 * 输入框全为空的回调事件
	 */
	public abstract void hasNoContent();
}
