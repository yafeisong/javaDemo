package com.geor;

import java.security.MessageDigest;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * 加密的工具类
 * 
 * @author caomei
 * 
 */
public class SecUtils {
	
	private static final Logger logger = LoggerFactory.getLogger(SecUtils.class);
	static Encoder64Specail encoder = new Encoder64Specail();
	private SecUtils(){
		throw new IllegalAccessError("工具类不能实例化");
	}
	/**
	 * MD5加密(32位)
	 * 
	 * @param instr
	 *            要加密的字符串
	 * @return 返回加密后的字符串
	 */
	public final static String encoderByMd5With32Bit(String instr) {
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd',
				'e', 'f' };
		try {
			if (instr != null && !"".equals(instr)) {
				byte[] strTemp = instr.getBytes();
				// MD5计算方法
				MessageDigest mdTemp = MessageDigest.getInstance("MD5");
				mdTemp.update(strTemp);
				byte[] md = mdTemp.digest();
				int j = md.length;
				char str[] = new char[j * 2];
				int k = 0;
				for (int i = 0; i < j; i++) {
					byte byte0 = md[i];
					str[k++] = hexDigits[byte0 >>> 4 & 0xf];
					str[k++] = hexDigits[byte0 & 0xf];
				}
				return new String(str);
			} else {
				return null;
			}
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			return null;
		}
	}

	/**
	 * 获取随机的UUID字符串
	 * 
	 * @return String
	 */
	public static String getUUID() {
		return UUID.randomUUID().toString().replace("-", "");
	}
	public static String getStringId() {
		UUID uid = UUID.randomUUID();
		long low = uid.getLeastSignificantBits();
		long high = uid.getMostSignificantBits();
		return encoder.encodeBytes(bytes(low)) + new String(encoder.encodeBytes(bytes(high)).substring(6));
	}	
	public static byte[] bytes(long x){
		byte[] v = new byte[8];
		v[0] = (byte)(x >> 56);
		v[1] = (byte)(x >> 48);
		v[2] = (byte)(x >> 40);
		v[3] = (byte)(x >> 32);
		v[4] = (byte)(x >> 24);
		v[5] = (byte)(x >> 16);
		v[6] = (byte)(x >> 8);
		v[7] = (byte)(x >> 0);
		return v;
	}
}
