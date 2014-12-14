package cn.common.core.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * 
*    
* 项目名称：DTEduAppBaseLib   
* 类名称：ToastUtils   
* 类描述：   ToastUtils帮助类
* 创建人：Administrator   
* 创建时间：2014-4-9 下午4:04:51   
* 修改人：Administrator   
* 修改时间：2014-4-9 下午4:04:51   
* 修改备注：   
* @version    
*
 */
public class ToastUtils {

	/**
	* @Title: show 
	* @Description: TODO(短时间显示toast) 
	* @param context
	* @param text
	* @throws
	 */
	public static void show(Context context, CharSequence text) {
	        show(context, text, Toast.LENGTH_SHORT);
	}
	
	/**
	* @Title: show 
	* @Description: TODO(较长时间显示toast) 
	* @param context
	* @param text
	* @throws
	 */
	public static void showLong(Context context, CharSequence text){
		show(context, text, Toast.LENGTH_LONG);
	}
	
    public static void show(Context context, int resId) {
        show(context, context.getResources().getText(resId), Toast.LENGTH_SHORT);
    }

    public static void show(Context context, int resId, int duration) {
        show(context, context.getResources().getText(resId), duration);
    }

    /**
     * 
    * @Title: show 
    * @Description: TODO(自定义totast要显示的时长) 
    * @param context
    * @param text
    * @param duration 显示多长时间
    * @throws
     */
    public static void show(Context context, CharSequence text, int duration) {
        Toast.makeText(context, text, duration).show();
    }

    public static void show(Context context, int resId, Object... args) {
        show(context, String.format(context.getResources().getString(resId), args), Toast.LENGTH_SHORT);
    }

    public static void show(Context context, String format, Object... args) {
        show(context, String.format(format, args), Toast.LENGTH_SHORT);
    }

    public static void show(Context context, int resId, int duration, Object... args) {
        show(context, String.format(context.getResources().getString(resId), args), duration);
    }

    public static void show(Context context, String format, int duration, Object... args) {
        show(context, String.format(format, args), duration);
    }
}
