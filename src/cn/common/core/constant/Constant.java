package cn.common.core.constant;

public class Constant {

	public static final String PLAT_FORM = "android";

	/**
	 * 三方平台
	 */
	public static class Platform {
		public static final String MAC = "mac";
		public static final String FB = "fb";
		public static final String EVATAR = "evatar";
		public static final String YAHOO = "yahoo";
		public static final String YOUXIN = "yushin";
		public static final String OPPO = "oppo";
		public static final String FENGHUANG = "phtv";
		public static final String BAIDU = "baidu";
		public static final String QQ = "qq";
		public static final String SINA = "sina";
		public static final String DUOKOO = "duokoo";
		public static final String WANDOUJIA = "wandoujia";
		public static final String DANGLE = "dangle";
		public static final String ANZHI = "anzhi";
		public static final String XIAOMI = "xiaomi";
		public static final String APPCHINA = "appchina";
		public static final String LENOVO = "lenovo";
		public static final String QIHOO = "qihoo";
		public static final String ND = "91";
		public static final String UC = "uc";
	}

	/**
	 * 合作商
	 */
	public static class Partner {
		public static final String EVATAR = "evatar";
	}

	/**
	 * Activity返回
	 */
	public static class ActivityResult {
		public static final int PROTOCOL_FALSE = 1000;
		public static final int PROTOCOL_TRUE = 1001;

		public static final int COMMON_FACEBOOK_LOGIN = 1002;
		public static final int BIND_FACEBOOK_LOGIN = 1003;

		public static final int LOGIN_BY_EVENTER = 1004;

		// 新浪微博
		public static final int SSOLOGIN_SINA_WEIBO = 32973;
	}

	/**
	 * selecter图片名称
	 * 
	 * @author Jesse
	 * 
	 */
	public static class ViewSelecter {
		public static final String EFUN_BAKC_SELECTER = "efun_back_selecter";
		public static final String EFUN_SET_SELECTER = "efun_set_selecter";
		public static final String EFUN_COMMON_BTN_SELECTER = "efun_common_btn_selecter";
		public static final String EFUN_THIRD_BTN_SELECTER = "efun_third_btn_selecter";
	}

	/**
	 * 登陆的权限
	 */
	public static class Scope {
		public static final String LOGIN_QQ_SCOPE = "get_user_info";
		public static final String LOGIN_WEIBO_SCOPE = "";
	}

	/**
	 * 控件大小比例值
	 */
	public static class ViewSize {
		public static final double[] LOGO_HEIGHT = new double[] { ViewScreen.LANDSCAPE_LOGO_HEIGHT, ViewScreen.PORTRAIT_LOGO_HEIGHT };
		public static final double[] LOGO_WIDTH = new double[] { ViewScreen.LANDSCAPE_LOGO_WIDTH, ViewScreen.PORTRAIT_LOGO_WIDTH };

		public static final double[] TITLE_HEIGHT = new double[] { ViewScreen.LANDSCAPE_TITLE_HEIGHT, ViewScreen.PORTRAIT_TITLE_HEIGHT };
		public static final double[] TITLE_NAME_HEIGHT = new double[] { ViewScreen.LANDSCAPE_TITLE_NAME_HEIGHT, ViewScreen.PORTRAIT_TITLE_NAME_HEIGHT };
		public static final double[] TITLE_LOGIN_WIDTH = new double[] { ViewScreen.LANDSCAPE_TITLE_LOGIN_WIDTH, ViewScreen.PORTRAIT_TITLE_LOGIN_WIDTH };
		public static final double[] TITLE_RETRIEVE_WIDTH = new double[] { ViewScreen.LANDSCAPE_TITLE_RETRIEVE_WIDTH, ViewScreen.PORTRAIT_TITLE_RETRIEVE_WIDTH };
		public static final double[] TITLE_REGISTER_WIDTH = new double[] { ViewScreen.LANDSCAPE_TITLE_REGISTER_WIDTH, ViewScreen.PORTRAIT_TITLE_REGISTER_WIDTH };
		public static final double[] TITLE_RESETPASSWORD_WIDTH = new double[] { ViewScreen.LANDSCAPE_TITLE_RESETPASSWORD_WIDTH, ViewScreen.PORTRAIT_TITLE_RESETPASSWORD_WIDTH };
		public static final double[] TITLE_BIND_WIDTH = new double[] { ViewScreen.LANDSCAPE_TITLE_BIND_WIDTH, ViewScreen.PORTRAIT_TITLE_BIND_WIDTH };
		public static final double[] TITLE_BIND_FB_WIDTH = new double[] { ViewScreen.LANDSCAPE_TITLE_BIND_FB_WIDTH, ViewScreen.PORTRAIT_TITLE_BIND_FB_WIDTH };
		public static final double[] TITLE_ACCOUNT_MANAGER_WIDTH = new double[] { ViewScreen.LANDSCAPE_TITLE_ACCOUNT_MANAGER_WIDTH, ViewScreen.PORTRAIT_TITLE_ACCOUNT_MANAGER_WIDTH };
		public static final double[] TITLE_CLAUSE_WIDTH = new double[] { ViewScreen.LANDSCAPE_TITLE_CLAUSE_WIDTH, ViewScreen.PORTRAIT_TITLE_CLAUSE_WIDTH };
		public static final double[] TITLE_BIG_PLAYER_WIDTH = new double[] { ViewScreen.LANDSCAPE_TITLE_BIG_PLAYER_WIDTH, ViewScreen.PORTRAIT_TITLE_BIG_PLAYER_WIDTH };
		public static final double[] TITLE_BACK_HEIGHT = new double[] { ViewScreen.LANDSCAPE_TITLE_BACK_HEIGHT, ViewScreen.PORTRAIT_TITLE_BACK_HEIGHT };
		public static final double[] TITLE_BACK_WIDTH = new double[] { 0, ViewScreen.PORTRAIT_TITLE_BACK_WIDTH };
		public static final double[] TITLE_BACK_CONTENT_WIDTH = new double[] { 0, ViewScreen.PORTRAIT_TITLE_BACK_CONTENT_WIDTH };
		public static final double[] TITLE_BACK_CONTENT_HEIGHT = new double[] { 0, ViewScreen.PORTRAIT_TITLE_BACK_CONTENT_HEIGHT };
		public static final double[] TITLE_SET_HEIGHT = new double[] { ViewScreen.LANDSCAPE_TITLE_SET_HEIGHT, ViewScreen.PORTRAIT_TITLE_SET_HEIGHT };

		public static final double[] INPUT_ITEM_HEIGHT = new double[] { ViewScreen.LANDSCAPE_INPUT_ITEM_HEIGHT, ViewScreen.PORTRAIT_INPUT_ITEM_HEIGHT };
		public static final double[] INPUT_ITEM_WIDTH = new double[] { ViewScreen.LANDSCAPE_INPUT_ITEM_WIDTH, ViewScreen.PORTRAIT_INPUT_ITEM_WIDTH };

		public static final double[] COMMON_BUTTON_HEIGHT = new double[] { ViewScreen.LANDSCAPE_COMMON_BUTTON_HEIGHT, ViewScreen.PORTRAIT_COMMON_BUTTON_HEIGHT };;
		public static final double[] COMMON_BUTTON_LOGO_COME_NOW_WIDTH = new double[] { ViewScreen.LANDSCAPE_COMMON_BUTTON_LOGO_COME_NOW_WIDTH, ViewScreen.PORTRAIT_COMMON_BUTTON_LOGO_COME_NOW_WIDTH };;
		public static final double[] COMMON_BUTTON_LOGO_ACCOUNT_MANANGER_WIDTH = new double[] { ViewScreen.LANDSCAPE_COMMON_BUTTON_LOGO_ACCOUNT_MANANGER_WIDTH, ViewScreen.PORTRAIT_COMMON_BUTTON_LOGO_ACCOUNT_MANANGER_WIDTH };
		public static final double[] COMMON_BUTTON_LOGIN_WIDTH = new double[] { ViewScreen.LANDSCAPE_COMMON_BUTTON_LOGIN_WIDTH, ViewScreen.PORTRAIT_COMMON_BUTTON_LOGIN_WIDTH };
		public static final double[] COMMON_BUTTON_REGISTER_WIDTH = new double[] { ViewScreen.LANDSCAPE_COMMON_BUTTON_REGISTER_WIDTH, ViewScreen.PORTRAIT_COMMON_BUTTON_REGISTER_WIDTH };
		public static final double[] COMMON_BUTTON_RETRIEVE_WIDTH = new double[] { ViewScreen.LANDSCAPE_COMMON_BUTTON_RETRIEVE_WIDTH, ViewScreen.PORTRAIT_COMMON_BUTTON_RETRIEVE_WIDTH };
		public static final double[] COMMON_BUTTON_RESET_PASSWORD_WIDTH = new double[] { ViewScreen.LANDSCAPE_COMMON_BUTTON_RESET_PASSWORD_WIDTH, ViewScreen.PORTRAIT_COMMON_BUTTON_RESET_PASSWORD_WIDTH };
		public static final double[] COMMON_BUTTON_BIND_WIDTH = new double[] { ViewScreen.LANDSCAPE_COMMON_BUTTON_BIND_WIDTH, ViewScreen.PORTRAIT_COMMON_BUTTON_BIND_WIDTH };
		public static final double[] COMMON_BUTTON_CLAUSE_SURE_WIDTH = new double[] { ViewScreen.LANDSCAPE_COMMON_BUTTON_CLAUSE_SURE_WIDTH, ViewScreen.PORTRAIT_COMMON_BUTTON_CLAUSE_SURE_WIDTH };
		public static final double[] COMMON_BUTTON_CLAUSE_CANNEL_WIDTH = new double[] { ViewScreen.LANDSCAPE_COMMON_BUTTON_CLAUSE_CANNEL_WIDTH, ViewScreen.PORTRAIT_COMMON_BUTTON_CLAUSE_CANNEL_WIDTH };
		public static final double[] COMMON_BUTTON_ACCOUNT_MANAGER_RESET_WIDTH = new double[] { ViewScreen.LANDSCAPE_COMMON_BUTTON_ACCOUNT_MANAGER_RESET_WIDTH, ViewScreen.PORTRAIT_COMMON_BUTTON_ACCOUNT_MANAGER_RESET_WIDTH };
		public static final double[] COMMON_BUTTON_ACCOUNT_MANAGER_EXCHANGE_WIDTH = new double[] { ViewScreen.LANDSCAPE_COMMON_BUTTON_ACCOUNT_MANAGER_EXCHANGE_WIDTH, ViewScreen.PORTRAIT_COMMON_BUTTON_ACCOUNT_MANAGER_EXCHANGE_WIDTH };
		public static final double[] COMMON_BUTTON_ACCOUNT_MANAGER_FREEBIND_WIDTH = new double[] { ViewScreen.LANDSCAPE_COMMON_BUTTON_ACCOUNT_MANAGER_FREEBIND_WIDTH, ViewScreen.PORTRAIT_COMMON_BUTTON_ACCOUNT_MANAGER_FREEBIND_WIDTH };
		public static final double[] COMMON_BUTTON_ACCOUNT_MANAGER_FACEBOOKBIND_WIDTH = new double[] { ViewScreen.LANDSCAPE_COMMON_BUTTON_ACCOUNT_MANAGER_FACEBOOKBIND_WIDTH, ViewScreen.PORTRAIT_COMMON_BUTTON_ACCOUNT_MANAGER_FACEBOOKBIND_WIDTH };

		public static final double[] TEXT_HEIGHT = new double[] { ViewScreen.LANDSCAPE_TEXT_HEIGHT, ViewScreen.PORTRAIT_TEXT_HEIGHT };
		public static final double[] TEXT_RETRIVE_WIDTH = new double[] { ViewScreen.LANDSCAPE_TEXT_RETRIVE_WIDTH, ViewScreen.PORTRAIT_TEXT_RETRIVE_WIDTH };
		public static final double[] TEXT_ACCOUNT_MORE_WIDTH = new double[] { ViewScreen.LANDSCAPE_TEXT_ACCOUNT_MORE_WIDTH, ViewScreen.PORTRAIT_TEXT_ACCOUNT_MORE_WIDTH };

		public static final double[] TEXT_AGREE_WIDTH = new double[] { ViewScreen.LANDSCAPE_TEXT_AGREE_WIDTH, ViewScreen.PORTRAIT_TEXT_AGREE_WIDTH };
		public static final double[] TEXT_PROTORL_WIDTH = new double[] { ViewScreen.LANDSCAPE_TEXT_PROTORL_WIDTH, ViewScreen.PORTRAIT_TEXT_PROTORL_WIDTH };

		public static final double[] OTHER_LOGIN_TITLE_HEIGHT = new double[] { ViewScreen.LANDSCAPE_OTHER_LOGIN_TITLE_HEIGHT, ViewScreen.PORTRAIT_OTHER_LOGIN_TITLE_HEIGHT };
		public static final double[] OTHER_LOGIN_TITLE_WIDTH = new double[] { ViewScreen.LANDSCAPE_OTHER_LOGIN_TITLE_WIDTH, ViewScreen.PORTRAIT_OTHER_LOGIN_TITLE_WIDTH };

		public static final double[] THIRD_LOGIN_BUTTON_HEIGHT = new double[] { ViewScreen.LANDSCAPE_THIRD_LOGIN_BUTTON_HEIGHT, ViewScreen.PORTRAIT_THIRD_LOGIN_BUTTON_HEIGHT };

		public static final double[] PAY_COMMIT_BUTTON_HEIGHT = new double[] { ViewScreen.LANDSCAPE_THIRD_LOGIN_BUTTON_HEIGHT, ViewScreen.PORTRAIT_PAY_COMMIT_BUTTON_HEIGHT };

		public static final double[] THIRD_LOGIN_BUTTON_FACEBOOK_WIDTH = new double[] { ViewScreen.LANDSCAPE_THIRD_LOGIN_BUTTON_FACEBOOK_WIDTH, ViewScreen.PORTRAIT_THIRD_LOGIN_BUTTON_FACEBOOK_WIDTH };
		public static final double[] THIRD_LOGIN_BUTTON_FREE_WIDTH = new double[] { ViewScreen.LANDSCAPE_THIRD_LOGIN_BUTTON_FREE_WIDTH, ViewScreen.PORTRAIT_THIRD_LOGIN_BUTTON_FREE_WIDTH };
		public static final double[] THIRD_LOGIN_BUTTON_BIGPLAYER_WIDTH = new double[] { ViewScreen.LANDSCAPE_THIRD_LOGIN_BUTTON_BIGPLAYER_WIDTH, ViewScreen.PORTRAIT_THIRD_LOGIN_BUTTON_BIGPLAYER_WIDTH };

		public static final double[] CLAUSE_BACKGROUND_HEIGHT = new double[] { ViewScreen.LANDSCAPE_CLAUSE_BACKGROUND_HEIGHT, ViewScreen.PORTRAIT_CLAUSE_BACKGROUND_HEIGHT };

		public static final double[] ACCOUNT_MANAGER_WIDTH = new double[] { 0, ViewScreen.PORTRAIT_ACCOUNTMANAGER_VIEW_WIDTH };

		public static final double[] HINTS_NAME_WIDTH = new double[] { 0, ViewScreen.PORTRAIT_HINTS_NAME_WIDTH };
	}

	/**
	 * 比例
	 * 
	 * @author Jesse
	 * 
	 */
	private static class ViewScreen {
		public static final double LANDSCAPE_LOGO_HEIGHT = 0.35;
		public static final double LANDSCAPE_LOGO_WIDTH = 2.099447513812155;

		public static final double LANDSCAPE_TITLE_HEIGHT = 0.15;
		public static final double LANDSCAPE_TITLE_NAME_HEIGHT = 0.09;
		public static final double LANDSCAPE_TITLE_LOGIN_WIDTH = 2.112676056338028;
		public static final double LANDSCAPE_TITLE_RETRIEVE_WIDTH = 5.333333333333333;
		public static final double LANDSCAPE_TITLE_REGISTER_WIDTH = 5.288888888888889;
		public static final double LANDSCAPE_TITLE_RESETPASSWORD_WIDTH = 5.333333333333333;
		public static final double LANDSCAPE_TITLE_BIND_WIDTH = 6.909090909090909;
		public static final double LANDSCAPE_TITLE_BIND_FB_WIDTH = 7.577777777777778;
		public static final double LANDSCAPE_TITLE_ACCOUNT_MANAGER_WIDTH = 5.333333333333333;
		public static final double LANDSCAPE_TITLE_CLAUSE_WIDTH = 9.577777777777778;
		public static final double LANDSCAPE_TITLE_BIG_PLAYER_WIDTH = 3.155555555555556;
		public static final double LANDSCAPE_TITLE_BACK_HEIGHT = 0.1;
		public static final double LANDSCAPE_TITLE_SET_HEIGHT = 0.1;

		public static final double LANDSCAPE_INPUT_ITEM_HEIGHT = 0.14;
		public static final double LANDSCAPE_INPUT_ITEM_WIDTH = 3.597080291970803;

		public static final double LANDSCAPE_COMMON_BUTTON_HEIGHT = 0.15;
		public static final double LANDSCAPE_COMMON_BUTTON_LOGO_COME_NOW_WIDTH = 5.375;
		public static final double LANDSCAPE_COMMON_BUTTON_LOGO_ACCOUNT_MANANGER_WIDTH = 5.35;
		public static final double LANDSCAPE_COMMON_BUTTON_LOGIN_WIDTH = 3.837837837837838;
		public static final double LANDSCAPE_COMMON_BUTTON_REGISTER_WIDTH = 3.342105263157895;
		public static final double LANDSCAPE_COMMON_BUTTON_RETRIEVE_WIDTH = 5.263157894736842;
		public static final double LANDSCAPE_COMMON_BUTTON_RESET_PASSWORD_WIDTH = 5.289473684210526;
		public static final double LANDSCAPE_COMMON_BUTTON_BIND_WIDTH = 5.289473684210526;
		public static final double LANDSCAPE_COMMON_BUTTON_CLAUSE_SURE_WIDTH = 2.736842105263158;
		public static final double LANDSCAPE_COMMON_BUTTON_CLAUSE_CANNEL_WIDTH = 2.615384615384615;
		public static final double LANDSCAPE_COMMON_BUTTON_ACCOUNT_MANAGER_RESET_WIDTH = 5.289473684210526;
		public static final double LANDSCAPE_COMMON_BUTTON_ACCOUNT_MANAGER_EXCHANGE_WIDTH = 5.289473684210526;
		public static final double LANDSCAPE_COMMON_BUTTON_ACCOUNT_MANAGER_FREEBIND_WIDTH = 6.684210526315789;
		public static final double LANDSCAPE_COMMON_BUTTON_ACCOUNT_MANAGER_FACEBOOKBIND_WIDTH = 6.24390243902439;

		public static final double LANDSCAPE_TEXT_HEIGHT = 0.05;
		public static final double LANDSCAPE_TEXT_RETRIVE_WIDTH = 7.290322580645161;
		public static final double LANDSCAPE_TEXT_ACCOUNT_MORE_WIDTH = 7;

		public static final double LANDSCAPE_TEXT_AGREE_WIDTH = 6.741935483870968;
		public static final double LANDSCAPE_TEXT_PROTORL_WIDTH = 9.67741935483871;

		public static final double LANDSCAPE_OTHER_LOGIN_TITLE_HEIGHT = 0.08;
		public static final double LANDSCAPE_OTHER_LOGIN_TITLE_WIDTH = 4.697674418604651;

		public static final double LANDSCAPE_THIRD_LOGIN_BUTTON_HEIGHT = 0.12;

		public static final double LANDSCAPE_THIRD_LOGIN_BUTTON_FACEBOOK_WIDTH = 4.72;
		public static final double LANDSCAPE_THIRD_LOGIN_BUTTON_FREE_WIDTH = 4.045977011494253;
		public static final double LANDSCAPE_THIRD_LOGIN_BUTTON_BIGPLAYER_WIDTH = 3.142857142857143;
		public static final double LANDSCAPE_CLAUSE_BACKGROUND_HEIGHT = 0.6;

		public static final double PORTRAIT_LOGO_HEIGHT = 0.20;
		public static final double PORTRAIT_LOGO_WIDTH = 2.099447513812155;

		public static final double PORTRAIT_TITLE_HEIGHT = 0.085;
		public static final double PORTRAIT_TITLE_NAME_HEIGHT = 0.040;
		public static final double PORTRAIT_TITLE_LOGIN_WIDTH = 2.112676056338028;
		public static final double PORTRAIT_TITLE_RETRIEVE_WIDTH = 5.333333333333333;
		public static final double PORTRAIT_TITLE_REGISTER_WIDTH = 5.288888888888889;
		public static final double PORTRAIT_TITLE_RESETPASSWORD_WIDTH = 5.333333333333333;
		public static final double PORTRAIT_TITLE_BIND_WIDTH = 6.909090909090909;
		public static final double PORTRAIT_TITLE_BIND_FB_WIDTH = 7.577777777777778;
		public static final double PORTRAIT_TITLE_ACCOUNT_MANAGER_WIDTH = 5.333333333333333;
		public static final double PORTRAIT_TITLE_CLAUSE_WIDTH = 9.577777777777778;
		public static final double PORTRAIT_TITLE_BIG_PLAYER_WIDTH = 3.155555555555556;
		public static final double PORTRAIT_TITLE_BACK_HEIGHT = 0.05;
		public static final double PORTRAIT_TITLE_BACK_WIDTH = 2.287878787878;
		public static final double PORTRAIT_TITLE_BACK_CONTENT_WIDTH = 0.6;
		public static final double PORTRAIT_TITLE_BACK_CONTENT_HEIGHT = 0.2;
		public static final double PORTRAIT_TITLE_SET_HEIGHT = 0.05;

		public static final double PORTRAIT_INPUT_ITEM_HEIGHT = 0.075;
		public static final double PORTRAIT_INPUT_ITEM_WIDTH = 1.798540145985402;

		public static final double PORTRAIT_COMMON_BUTTON_HEIGHT = 0.055;
		public static final double PORTRAIT_COMMON_BUTTON_LOGO_COME_NOW_WIDTH = 5.375;
		public static final double PORTRAIT_COMMON_BUTTON_LOGO_ACCOUNT_MANANGER_WIDTH = 5.35;
		public static final double PORTRAIT_COMMON_BUTTON_LOGIN_WIDTH = 3.073170713;
		public static final double PORTRAIT_COMMON_BUTTON_REGISTER_WIDTH = 3.342105263157895;
		public static final double PORTRAIT_COMMON_BUTTON_RETRIEVE_WIDTH = 5.263157894736842;
		public static final double PORTRAIT_COMMON_BUTTON_RESET_PASSWORD_WIDTH = 5.290322580645164;
		public static final double PORTRAIT_COMMON_BUTTON_BIND_WIDTH = 4.289473684210526;
		public static final double PORTRAIT_COMMON_BUTTON_CLAUSE_SURE_WIDTH = 2.736842105263158;
		public static final double PORTRAIT_COMMON_BUTTON_CLAUSE_CANNEL_WIDTH = 2.615384615384615;
		public static final double PORTRAIT_COMMON_BUTTON_ACCOUNT_MANAGER_RESET_WIDTH = 5.289473684210526;
		public static final double PORTRAIT_COMMON_BUTTON_ACCOUNT_MANAGER_EXCHANGE_WIDTH = 5.289473684210526;
		public static final double PORTRAIT_COMMON_BUTTON_ACCOUNT_MANAGER_FREEBIND_WIDTH = 6.684210526315789;
		public static final double PORTRAIT_COMMON_BUTTON_ACCOUNT_MANAGER_FACEBOOKBIND_WIDTH = 6.24390243902439;

		public static final double PORTRAIT_TEXT_HEIGHT = 0.0255;
		public static final double PORTRAIT_TEXT_RETRIVE_WIDTH = 7.290322580645161;
		public static final double PORTRAIT_TEXT_ACCOUNT_MORE_WIDTH = 4.375;

		public static final double PORTRAIT_TEXT_AGREE_WIDTH = 6.741935483870968;
		public static final double PORTRAIT_TEXT_PROTORL_WIDTH = 18.32;

		public static final double PORTRAIT_OTHER_LOGIN_TITLE_HEIGHT = 0.04;
		public static final double PORTRAIT_OTHER_LOGIN_TITLE_WIDTH = 4.697674418604651;

		public static final double PORTRAIT_THIRD_LOGIN_BUTTON_HEIGHT = 0.055;

		public static final double PORTRAIT_PAY_COMMIT_BUTTON_HEIGHT = 0.075;

		public static final double PORTRAIT_THIRD_LOGIN_BUTTON_FACEBOOK_WIDTH = 4.72;
		public static final double PORTRAIT_THIRD_LOGIN_BUTTON_FREE_WIDTH = 7.261904761904;
		public static final double PORTRAIT_THIRD_LOGIN_BUTTON_BIGPLAYER_WIDTH = 3.142857142857143;

		public static final double PORTRAIT_CLAUSE_BACKGROUND_HEIGHT = 0.6;

		public static final double PORTRAIT_ACCOUNTMANAGER_VIEW_WIDTH = 0.25;

		public static final double PORTRAIT_HINTS_NAME_WIDTH = 0.8;
	}

	/**
	 * 纯色
	 * 
	 * @author Jesse
	 * 
	 */
	public static class ViewColor {
		public static final int[] COLORS_BACKGROUND = { 255, 255, 255 };
		public static final int[] COLORS_COMMON_BUTTON = { 41, 88, 142 };
	}

	/**
	 * Fragment TAG
	 */
	public static class FragmentTags {
		public static final String STACK = "STACK";
		public static final String LOGIN_SELECT = "LOGIN_SELECT";
		public static final String LOGIN = "LOGIN";
		public static final String REGISTER = "REGISTER";
		public static final String MANAGER = "MANAGER";
		public static final String RESET_PASSWORD = "RESET_PASSWORD";
		public static final String FORGET_PASSWORD = "FORGET_PASSWORD";
		public static final String BIND = "BIND";
		public static final String BIND_FB = "BIND_FB";
		public static final String CLAUSE = "CLAUSE";
		public static final String BIGPLAYER = "BIGPLAYER";
		public static final String BIND_EMAIL = "BIND_EMAIL";

		// 储值类的TAG
		public static final String PAY_SELECT = "PAY_SELECT";
		public static final String YEEPAY_ONE_CARD = "YEEPAY_ONE_CARD";
		public static final String YEEPAY_RECHARGEABLE_CRAE = "PAY_RECHARGEABLE_CARE";
		public static final String PAY_RESULT = "PAY_RESULT";
		public static final String PAY_WEB_CLIENT="PAY_WEB_CLIENT";
	}

	/**
	 * 文件存储类（存储登陆信息）
	 */
	public static class DatabaseValue {
		public static final String EFUN_FILE = "Efun.db";
		public static final String LOGIN_USERNAME = "LOGIN_USERNAME";
		public static final String LOGIN_PASSWORD = "LOGIN_PASSWORD";
		public static final String ADS_ADVERTISERS_NAME = "ADS_ADVERTISERS_NAME";
		public static final String ADS_PARTNER_NAME = "ADS_PARTNER_NAME";
		public static final String IS_FACEBOOK_LOGIN = "IS_FACEBOOK_LOGIN";
		// public static final String
		// ALLOW_FACEBOOK_SHARE="ALLOW_FACEBOOK_SHARE";
		public static final String THIRD_PLATFORM_EVATAR_NAME = "THIRD_PLATFORM_EVATAR_NAME";
		public static final String THIRD_PLATFORM_EVATAR_PASSWORD = "THIRD_PLATFORM_EVATAR_PASSWORD";
		public static final String YAHOO_ID = "YAHOO_ID";

		public static final String BIND_ACCOUNT_USERNAME = "BIND_ACCOUNT_USERNAME";

	}

	/**
	 * MetaDate name
	 */
	public static class MetaData {
		/**
		 * APP_KEY
		 */
		public static final String GAME_KEY_META = "appkey";
		/**
		 * gameCode
		 */
		public static final String GAME_CODE_META = "gamecode";

		public static final String SDK_LISTENER = "sdklistener";
	}

	/**
	 * yeepay 支付通道名称
	 */
	public static class YeePay {

		public static final String JUNNET = "JUNNET";
		public static final String SNDACARD = "SNDACARD";
		public static final String SZX = "SZX";
		public static final String ZHENGTU = "ZHENGTU";
		public static final String QQCARD = "QQCARD";
		public static final String UNICOM = "UNICOM";
		public static final String JIUYOU = "JIUYOU";
		public static final String YPCARD = "YPCARD";
		public static final String NETEASE = "NETEASE";
		public static final String WANMEI = "WANMEI";
		public static final String SOHU = "SOHU";
		public static final String TELECOM = "TELECOM";
		public static final String ZONGYOU = "ZONGYOU";
		public static final String TIANXIA = "TIANXIA";
		public static final String TIANHONG = "TIANHONG";

		public static final String NAME_JUNNET = "骏网一卡通";
		public static final String NAME_SNDACARD = "盛大卡";
		public static final String NAME_SZX = "移动卡";
		public static final String NAME_ZHENGTU = "征途卡";
		public static final String NAME_QQCARD = "Q币卡";
		public static final String NAME_UNICOM = "联通卡";
		public static final String NAME_JIUYOU = "久游卡";
		public static final String NAME_YPCARD = "易宝e卡通";
		public static final String NAME_NETEASE = "网易卡";
		public static final String NAME_WANMEI = "完美卡";
		public static final String NAME_SOHU = "搜狐卡";
		public static final String NAME_TELECOM = "电信卡";
		public static final String NAME_ZONGYOU = "纵游一卡通";
		public static final String NAME_TIANXIA = "天下一卡通";
		public static final String NAME_TIANHONG = "天宏一卡通";
	}

	/**
	 * 回退按钮的点击事件
	 * 
	 * @author Administrator
	 * 
	 */
	public static class BtnBackTag {
		public static final String NAME_BACK_PAY_SELECT = "充值方式选择页";
		public static final String NAME_BACK_YEEPAY_ONE_CARD = "一卡通支付页";
		public static final String NAME_BACK_YEEPAY_RECHARGEABLE_CARD = "充值卡支付页";
		public static final String NAME_BACK_YEEPAY_DEPOSIT_CARD = "储蓄卡支付页";
	}
	
	
	public static class PageResult{
		
		public static final String NAME_PAY_ALIPAY = "支付宝";
		public static final String NAME_PAY_ONE = "一卡通";
		public static final String NAME_PAY_RECHARGEABLE_CARD = "充值卡";
		public static final String NAME_PAY_DEPOSIT_CARD = "储蓄卡";
		public static final String NAME_PAY_YEE = "易宝";
	}
	
	
	/**
	 * Intent传输过程中的Key
	 * 
	 * @author Administrator
	 * 
	 */
	public static class ExtraKey {
		public static final String KEY_PAYBEAN = "pBean";
		public static final String KEY_CONTROLBEAN = "cBean";
	}

	public static class OtherParams {
		public static final int CHECK_ORDER_COUNTS = 5;
		public static final int CHECK_ORDER_SLEEP_TIME = 10000;
	}
}
