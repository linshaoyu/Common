package cn.common.core.utils;

import android.util.Log;

public class LogUtils {
	private static final String TAG = "JDP";
	private static boolean mDebugLog = false;
	private static boolean mInfo = false;

	public static void enableDebug(boolean debug) {
		mDebugLog = debug;
	}

	public static void enableInfo(boolean info) {
		mInfo = info;
	}

	public static void logD(String msg) {
		if (mDebugLog) {
			Log.d(TAG, msg);
		}
	}

	public static void logD(String tag, String msg) {
		if (mDebugLog) {
			Log.d(tag, msg);
		}
	}

	public static void logI(String msg) {
		if (mInfo) {
			Log.i(TAG, msg);
		}
	}

	public static void logI(String tag, String msg) {
		if (mInfo) {
			Log.i(tag, msg);
		}
	}

	public static void logE(String msg) {
		Log.e(TAG, msg);
	}

	public static void logW(String msg) {
		Log.w(TAG, msg);
	}
}
