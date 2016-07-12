package com.jsb.rest.comm;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class JSBUtils
{   
    /**
     * 首字母大写
     * 
     * @param name
     * @return
     */
    public static String captureName(String name)
    {
        char[] cs = name.toCharArray();
        cs[0] -= 32;
        return String.valueOf(cs);
    }
    
    /**
     * 获取格式化之后的当前系统时间
     * 
     * @return
     */
    public static String getGmtTimeStr()
    {
        Calendar cd = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssZ");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+0")); // 设置时区为GMT
        return sdf.format(cd.getTime());
    }
    
    private final static String[] hexDigits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d",
        "e", "f"};
    
    public static byte[] HmacSHA256(String data, byte[] key)
        throws NoSuchAlgorithmException, InvalidKeyException, IllegalStateException, UnsupportedEncodingException
    {
        String algorithm = "HmacSHA256";
        Mac mac = Mac.getInstance(algorithm);
        mac.init(new SecretKeySpec(key, algorithm));
        return mac.doFinal(data.getBytes("UTF-8"));
    }
    
    /**
     * 将一个字节转化成十六进制形式的字符串
     * 
     * @param b 字节数组
     * @return 字符串
     */
    private static String byteToHexString(byte b)
    {
        int ret = b;      
        if (ret < 0)
        {
            ret += 256;
        }
        int m = ret / 16;
        int n = ret % 16;
        return hexDigits[m] + hexDigits[n];
    }
    
    /**
     * 转换字节数组为十六进制字符串
     * 
     * @param bytes 字节数组
     * @return 十六进制字符串
     */
    public static String byteArrayToHexString(byte[] bytes)
    {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < bytes.length; i++)
        {
            sb.append(byteToHexString(bytes[i]));
        }
        return sb.toString();
    }  
    
    public static String getSignatureKey(String key, String reqId, String strToSign)
        throws Exception
    {
        byte[] kSecret = ("JSB4" + key).getBytes("UTF-8");
        MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
        sha1.update(strToSign.getBytes("UTF-8"));
        String hexDigest = byteArrayToHexString(sha1.digest());
        byte[] kReqid = HmacSHA256(reqId, kSecret);
        byte[] kSigning = HmacSHA256(hexDigest, kReqid);
        String signature = byteArrayToHexString(kSigning);
        return signature;
    }
}
