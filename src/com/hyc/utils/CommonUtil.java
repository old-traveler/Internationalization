package com.hyc.utils;


import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hyc on 2018/4/19 17:40
 */

public class CommonUtil {


    public static Map getParams(String query, String from, String to) {
        String salt = String.valueOf(System
                .currentTimeMillis());
        Map params = new HashMap();
        params.put("q", query);
        params.put("from", from);
        params.put("to", to);
        params.put("ext", "mp3");
        params.put("sign", getSign(salt, query));
        params.put("salt", salt);
        params.put("appKey", Constant.APP_KEY);
        return params;
    }

    public static Map getParams(String query,String to) {
        String salt = String.valueOf(System
                .currentTimeMillis());
        Map params = new HashMap();
        params.put("q", query);
        params.put("from", "auto");
        params.put("to", to);
        params.put("ext", "mp3");
        params.put("sign", getSign(salt, query));
        params.put("salt", salt);
        params.put("appKey", Constant.APP_KEY);
        return params;
    }

    public static String getSign(String salt, String queryString) {
        return md5(Constant.APP_KEY + queryString + salt + Constant.KEY);
    }


    private static String md5(String string) {
        if (string == null) {
            return null;
        }
        char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F'};

        try {
            byte[] btInput = string.getBytes("utf-8");
            /** 获得MD5摘要算法的 MessageDigest 对象 */
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            /** 使用指定的字节更新摘要 */
            mdInst.update(btInput);
            /** 获得密文 */
            byte[] md = mdInst.digest();
            /** 把密文转换成十六进制的字符串形式 */
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (byte byte0 : md) {
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            return null;
        }
    }


    /**
     * 进行URL编码
     *
     * @param input
     * @return
     */
    public static String encode(String input) {
        if (input == null) {
            return "";
        }
        try {
            return URLEncoder.encode(input, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return input;
    }


}