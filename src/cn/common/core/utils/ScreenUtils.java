package cn.common.core.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;


public class ScreenUtils {

	DisplayMetrics dm = null;
	Display display = null;
	static ScreenUtils util = null;

	private ScreenUtils(Activity activity) {
		this.dm = new DisplayMetrics();
		this.display = activity.getWindowManager().getDefaultDisplay();
		this.display.getMetrics(this.dm);
	}

	public static ScreenUtils getInStance(Activity activity) {
		if (util == null) {
			util = new ScreenUtils(activity);
		}
		return util;
	}

	public int getPxWidth() {
		return dm.widthPixels;
	}

	public int getDipWidth() {
		return (this.dm.widthPixels / (int) this.dm.density);
	}

	public int getPxHeight() {
		return this.dm.heightPixels;
	}

	public int getPxValue(int dp_value) {
		return (int) (this.dm.density * dp_value);
	}

	public int getDpValue(int px_value) {
		return (int) (px_value / this.dm.density);
	}

	public int getStatuHeight(Activity activity) {
		Rect frame = new Rect();
		activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(frame);
		int statusBarHeight = frame.top;
		return statusBarHeight;
	}

	public boolean isPortrait(Activity activity) {
		DisplayMetrics dm = new DisplayMetrics();
		activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
		double mWidth = dm.widthPixels;
		double mHeight = dm.heightPixels;
		if (mHeight > mWidth) {
			return true;
		}
		return (mHeight >= mWidth);
	}

	public boolean isPhone(Context context) {
		TelephonyManager telManager = (TelephonyManager) context
				.getSystemService("phone");

		if (telManager.getPhoneType() == 0) {
			return false;
		}

		DisplayMetrics dm = new DisplayMetrics();
		((Activity) context).getWindowManager().getDefaultDisplay()
				.getMetrics(dm);
		int screenX = dm.widthPixels;
		int screenY = dm.heightPixels;
		int dpi = dm.densityDpi;
		float a = screenX / dpi;
		float b = screenY / dpi;
		double screenIn = Math.sqrt(a * a + b * b);

		return (screenIn <= 5.0D);
	}
}
