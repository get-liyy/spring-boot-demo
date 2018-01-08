package com.zero.tools;

/**
 * Created by frank on 16-8-8.
 */
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
public class AesDecryptUtil {
    public static String AesDecode( String source ,String passKey) throws  Exception{
        final byte[] pass = passKey.getBytes(StandardCharsets.US_ASCII);
        final byte[] magic = "Salted__".getBytes(StandardCharsets.US_ASCII);
        
        source = source.replaceAll("\\s", "");
        final byte[] inBytes = Base64.decode(source);
        final byte[] shouldBeMagic = Arrays.copyOfRange(inBytes, 0,magic.length);
        if (!Arrays.equals(shouldBeMagic, magic)) {
            System.out.println("Bad magic number");
            return "";
        }

        final byte[] salt = Arrays.copyOfRange(inBytes, magic.length, magic.length + 8);

        final byte[] passAndSalt = concat(pass, salt);

        byte[] hash = new byte[0];
        byte[] keyAndIv = new byte[0];
        for (int i = 0; i < 3; i++) {
            final byte[] data = concat(hash, passAndSalt);
            final MessageDigest md = MessageDigest.getInstance("MD5");
            hash = md.digest(data);
            keyAndIv = concat(keyAndIv, hash);
        }

        final byte[] keyValue = Arrays.copyOfRange(keyAndIv, 0, 16);
        final byte[] iv = Arrays.copyOfRange(keyAndIv, 16, 32);
        final Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        final SecretKeySpec key = new SecretKeySpec(keyValue, "AES");
        cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(iv));
        final byte[] clear = cipher.doFinal(inBytes, 16, inBytes.length - 16);
        final String clearText = new String(clear, StandardCharsets.UTF_8);
        return clearText;
    }
    private static byte[] concat(final byte[] a, final byte[] b) {
        final byte[] c = new byte[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        return c;
    }
    
    public static void main(String[] args) throws Exception {
		
		String passKey = "8YAhvcPU";
		String source = "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";
		System.out.println(AesDecode(source, passKey));
	}
    
}
