package com.demo.app.utils;

import android.util.Base64;

import java.io.IOException;
import java.nio.charset.Charset;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * Created by lanxingren on 2019-09-25.
 */
public class AESEncrypt {

    private static final String AES = "AES";
    private static final String AES_ALGORITHM = "AES/ECB/PKCS5Padding";
    private static final Charset UTF8 = Charset.forName("UTF-8");

    /**
     * AES加密
     *
     * @param data 待加密串
     * @param key  秘钥
     * @return 加密后的字符串
     */
    public static String encrypt(String data, String key) throws Exception {
        if (key == null) {
            return null;
        }

        // 判断Key是否为16位
        if (key.length() != 16) {
            return null;
        }

        byte[] raw = key.getBytes(UTF8);
        SecretKeySpec skeySpec = new SecretKeySpec(raw, AES);
        Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
        byte[] encrypted = cipher.doFinal(data.getBytes(UTF8));

        return base64Encode(encrypted);
    }

    /**
     * AES解密
     *
     * @param data 被加密的数据
     * @param key  秘钥
     * @return 解密后的字符串
     */
    public static String decrypt(String data, String key) throws Exception {
        try {
            if (key == null) {
                return null;
            }

            // 判断Key是否为16位
            if (key.length() != 16) {
                return null;
            }

            byte[] raw = key.getBytes(UTF8);
            SecretKeySpec skeySpec = new SecretKeySpec(raw, AES);
            Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, skeySpec);
            byte[] encrypted = base64Decode(data);
            try {
                byte[] original = cipher.doFinal(encrypted);
                return new String(original, UTF8);
            } catch (Exception e) {
                return "";
            }
        } catch (Exception ex) {
            return "";
        }
    }

    public static String base64Encode(byte[] data) {
        byte[] encode = Base64.encode(data, Base64.DEFAULT);
        return new String(encode, UTF8);
    }

    public static byte[] base64Decode(String data) throws IOException {
        return Base64.decode(data, Base64.DEFAULT);
    }
}
