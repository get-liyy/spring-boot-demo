package com.zero.tools;


import java.util.Properties;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InitPublicPropertyConfigure {

	private final static Logger logger = LoggerFactory.getLogger(InitPublicPropertyConfigure.class);

	public static Properties getHttpProperties(String url, String passKey) {
		Properties pros = new Properties();

		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url);
		CloseableHttpResponse response;
		try {
			response = httpClient.execute(httpget);

			// 获取返回数据
			HttpEntity entity = response.getEntity();
			String s = EntityUtils.toString(entity, "UTF-8");

			if (s == null || s.equals("")) {
				return pros;
			}

			try {
				s = AesDecryptUtil.AesDecode(s, passKey);
			} catch (Exception e) {
				return pros;
			}

			JSONObject server_info = JSON.parseObject(s);
			for (String ser_key : server_info.keySet()) {
				/* 解析dyanmodb 表数组 */
				if (ser_key.equals("db.table")) {
					JSONObject dbtable = JSON.parseObject(server_info.getString(ser_key));
					for (String table : dbtable.keySet()) {
						pros.put(table, dbtable.getString(table));
					}
				} else {
					pros.put(ser_key, server_info.getString(ser_key));
				}
			}
		} catch (Exception e) {
			logger.error("error info *** ", e);
		}
		System.out.println(JSONObject.toJSONString(pros));
		logger.info("serverinfo *** "+JSONObject.toJSONString(pros));
		return pros;
	}

}
