package idv.demo.watepay.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Service;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;

@Service
public class EncodeService {

    //generate hashcode with payinfo
    public String createHashCode(Object model) throws Throwable{

        //Object convert to json
        String jsonStr = serializeObj2Json(model);
        //Json convert String by HGPay Spec
        String input = jsonStr.replace('{', ' ').
                replace('}', ' ').replace(',', '&').trim();
        //Data hash with SHA256
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(input.getBytes("UTF-8"));
        return byte2Hex(hash);
    }

    //hashcode convert to string
    public String byte2Hex(byte[] bytes){

        StringBuffer stringBuffer = new StringBuffer();
        String temp =null;

        for  (int i=0;i<bytes.length;i++){
            temp  =Integer.toHexString(bytes[i] & 0xFF);
            if  (temp.length()==1){
                //1得到一位的进行补0操作
                stringBuffer.append("0");
            }
            stringBuffer.append(temp);
        }
        return stringBuffer.toString();
    }

    public String decryptAES(String jsonData, String key) throws Throwable {
        Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");

        // For zeroPadding
        int blockSize = cipher.getBlockSize();
        byte[] byteContent = jsonData.getBytes("UTF-8");
        int plaintextLength = byteContent.length;
        if (plaintextLength % blockSize != 0) {
            plaintextLength = plaintextLength + (blockSize - (plaintextLength % blockSize));
        }
        byte[] plaintext = new byte[plaintextLength];

        //System.arraycopy(byteContent, 0, plaintext, 0, byteContent.length);
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key.getBytes(), "AES"));// 初始化为加密模式的密码器

        return Base64.encodeBase64String(cipher.doFinal(plaintext));
    }

    public String serializeObj2Json(Object model) throws Throwable{
        ObjectMapper objMapper = new ObjectMapper();
        return objMapper.writeValueAsString(model);
    }

}
