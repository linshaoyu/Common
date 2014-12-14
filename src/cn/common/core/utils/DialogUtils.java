package cn.common.core.utils;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import cn.common.core.callback.INegativeListener;
import cn.common.core.callback.IPositiveListener;

public class DialogUtils {
	
	
	public static void show(Context context, String message, IPositiveListener positiveListener, INegativeListener negativeListener){
		
		String title = ResourceUtils.findStringByName(context, "s_notice_title");
		String positiveStr = ResourceUtils.findStringByName(context, "s_confirm");
		String negativeStr = ResourceUtils.findStringByName(context, "s_cancel");
		
		show(context, message, title, positiveStr, negativeStr, positiveListener, negativeListener);
	}
	
	
	public static void show(Context context, String message, String title, String positiveStr, String negativeStr,
			final IPositiveListener positiveListener, final INegativeListener negativeListener){
		
		show(context, message, title, positiveStr, negativeStr, new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				dialog.dismiss();
				if (positiveListener != null) {
					positiveListener.positiveCall();
				}
			}
		}, new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				dialog.dismiss();
				
				if (negativeListener != null) {
					negativeListener.negativeCall();
				}
			}
		});
	}
	

	public static void show(Context context, String message, String title, String positiveStr, String negativeStr,
			DialogInterface.OnClickListener positiveListener, DialogInterface.OnClickListener negativeListener) {

		AlertDialog.Builder builder = new Builder(context);

		builder.setMessage(message);
		builder.setTitle(title);
		builder.setPositiveButton(positiveStr, positiveListener);
		builder.setNegativeButton(negativeStr, negativeListener);
		builder.create().show();

	}
}
