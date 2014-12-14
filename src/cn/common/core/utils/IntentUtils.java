package cn.common.core.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class IntentUtils {

	/**
	 * 到指定页面
	 * 
	 * @param context
	 * @param clazz
	 */
	public static void startActivity(Context context, Class<? extends FragmentActivity> clazz) {
		Intent it = new Intent(context, clazz);
		context.startActivity(it);
	}

	public static void startActivityForResult(Context context, Class<? extends FragmentActivity> clazz, int requestCode) {
		Intent it = new Intent(context, clazz);
		((Activity) context).startActivityForResult(it, requestCode);
	}
	
	/**
	 * 传递 Bean 对象到指定页面
	 * 
	 * @param context
	 * @param clazz
	 * @param bean
	 */
	public static void goWithBundle(Context context, Class<? extends FragmentActivity> clazz, String key, Bundle bundle) {
		Intent it = new Intent(context, clazz);
		it.putExtra(key, bundle);
		context.startActivity(it);
	}
	
	public static void start2Activity(Context context, Class<? extends Activity> clazz) {
		Intent it = new Intent(context, clazz);
		context.startActivity(it);
	}
	
	public static void start2FActivity(Context context, Class<? extends Activity> clazz){
		Intent it = new Intent(context, clazz);
		context.startActivity(it);
		((Activity)context).finish();
	}

	public static void start2ActivityForResult(Context context, Class<? extends Activity> clazz, int requestCode) {
		Intent it = new Intent(context, clazz);
		((Activity) context).startActivityForResult(it, requestCode);
	}
	
	public static void goBackActivityForResult(Context context, int resultCode, Bundle bundle){
		Intent it = new Intent();
		it.putExtras(bundle);
		((Activity)context).setResult(resultCode, it);
		((Activity)context).finish();
	}
}
