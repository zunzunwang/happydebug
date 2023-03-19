package dailybugs.bugs_07242022;

import java.nio.charset.StandardCharsets;

public class ByteTransString {
    public static void main(String[] args) {
        /**
         * String to byte[]
         */
        String str = "HelloWorld";
        System.out.println("----------Encode by UTF 8---------------");
        byte[] bytesUTF8 = str.getBytes(StandardCharsets.UTF_8);
        byte[] bytesUTF16 = str.getBytes(StandardCharsets.UTF_16);
        String decodeBytesUTF8 = new String(bytesUTF8);
        String decodeBytesUTF16 = new String(bytesUTF16, StandardCharsets.UTF_16);
    }
}


