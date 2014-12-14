package cn.common.core.http;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import cn.common.core.utils.LogUtils;

public class HttpUtil {
	
	public static String TAG = HttpUtil.class.getSimpleName();
	public static final String EMPTY = "";

	public static String getJsonByGet(String url, Map<String, Object> parameters) {
		String json = EMPTY;
		try {
			if (null != parameters && !parameters.isEmpty()) {
				url += getUrlParameter(parameters);
			}
			LogUtils.logI(TAG, "url:" + url);
			HttpResponse response = getHttpResponse(url);
			if (response == null) {
				return json;
			}
			if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				json = EntityUtils.toString(response.getEntity(), HTTP.UTF_8);
				return json;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return json;
	}
	
	
	public static String getJsonByPost(String url, Map<String, Object> parameters) {
		String json = EMPTY;
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		if (null != parameters && !parameters.isEmpty()) {
			Set<String> keys = parameters.keySet();
			for (String key : keys) {
				String value = parameters.get(key).toString();
				params.add(new BasicNameValuePair(key, value));
				LogUtils.logI(TAG, key + "==>" + value + "\n");
			}
		}
		try {
			HttpResponse response = getHttpResponse(url, params);
			if (response == null) {
				return json;
			}
			if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				json = EntityUtils.toString(response.getEntity(), HTTP.UTF_8);
				return json;
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return json;
	}

	/**
	 * get 参数拼接
	 * 
	 * @param parameters
	 * @return
	 */
	public static String getUrlParameter(Map<String, Object> params) {
		StringBuilder urlParameter = new StringBuilder();
		urlParameter.append("?");
		try {
			if (null != params && !params.isEmpty()) {
				Set<String> keys = params.keySet();
				for (String key : keys) {
					String value = URLEncoder.encode(params.get(key).toString(), HTTP.UTF_8);
					urlParameter.append(key);
					urlParameter.append("=");
					urlParameter.append(value);
					urlParameter.append("&");
					LogUtils.logI(TAG, key + "==>" + value + "\n");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return urlParameter.deleteCharAt(urlParameter.length()).toString();
	}


	/**
	 * post
	 * 
	 * @param url
	 * @param params
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws ClientProtocolException
	 */
	private static HttpResponse getHttpResponse(String url,
			List<NameValuePair> params) throws UnsupportedEncodingException,
			IOException, ClientProtocolException {
		HttpClient client = SSLSocketFactoryEx.getNewHttpClient();
		HttpPost httpPost = new HttpPost(url);
		httpPost.addHeader("charset", HTTP.UTF_8);
		HttpEntity entity = new UrlEncodedFormEntity(params, HTTP.UTF_8);
		httpPost.setEntity(entity);
		HttpResponse response = client.execute(httpPost);
		return response;
	}

	/**
	 * get
	 * 
	 * @param url  拼接后的url
	 * @return
	 * @throws IOException
	 * @throws ClientProtocolException
	 */
	private static HttpResponse getHttpResponse(String url) throws IOException,
			ClientProtocolException {
		HttpClient client = SSLSocketFactoryEx.getNewHttpClient();
		HttpGet httpGet = new HttpGet(url);
		httpGet.addHeader("charset", HTTP.UTF_8);
		HttpResponse response;
		response = client.execute(httpGet);
		return response;
	}

}
