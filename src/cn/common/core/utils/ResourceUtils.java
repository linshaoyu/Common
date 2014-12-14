package cn.common.core.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;

public class ResourceUtils {

	public static int getResourcesIdByName(Context context, String resType, String resourcesName)
	{
		Resources resources = context.getResources();
	 	int id = resources.getIdentifier(resourcesName, resType, context.getPackageName());
		if (id == 0) {
			Log.e("ResourceUtils", "资源文件读取不到！resourcesName:" + resourcesName);
		}
		return id;
	}
	
	
	public static String findStringByName(Context context, String resourceName){
		
		return context.getString(getResourcesIdByName(context, "string", resourceName));
	}
	
	public static int findLayoutIdByName(Context context, String resourcesName) {
		return getResourcesIdByName(context, "layout", resourcesName);
	}

	public static int findColorIdByName(Context context, String resourcesName) {
		return getResourcesIdByName(context, "color", resourcesName);
	}

	public static int findArrayIdByName(Context context, String resourcesName) {
		return getResourcesIdByName(context, "array", resourcesName);
	}

	public static int findStringIdByName(Context context, String resourcesName) {
		return getResourcesIdByName(context, "string", resourcesName);
	}
	
	public static int findDrawableIdByName(Context context, String resourcesName) {
		return getResourcesIdByName(context, "drawable", resourcesName);
	}
	
	public static int findViewIdByName(Context context, String resourcesName) {
		return getResourcesIdByName(context, "id", resourcesName);
	}

	public static int findAnimIdByName(Context context, String resourcesName) {
		return getResourcesIdByName(context, "anim", resourcesName);
	}

	public static int findStyleIdByName(Context context, String resourcesName) {
		return getResourcesIdByName(context, "style", resourcesName);
	}
	
}
