package at.favre.udp;

import at.favre.lib.bytes.Bytes;

import java.nio.charset.StandardCharsets;

import static at.favre.lib.bytes.BytesTransformers.checksumCrc32;

/**
 * checkSum and other method for udp packet
 * @auther: luolin
 * @email: ll950129@gmail.com
 * create at 2018-12-08
 */
public class PacketUtils {

    /**
     * 计算指定内容的指定长度的校验和
     * @param msg 需要计算检验和的内容
     * @param length 检验和的长度
     * @return 校验和字节数组
     */
    public static byte[] checkSum(String msg, int length) {
       byte[] checkSum = new byte[length];
       Bytes bytes = Bytes.wrap(msg.getBytes(StandardCharsets.UTF_8)).transform(checksumCrc32());
       checkSum = bytes.array();
       return checkSum;
    }

    public static byte[] checkSum(byte[] msg, int length) {
        byte[] checkSum = new byte[length];
        Bytes bytes = Bytes.wrap(msg).transform(checksumCrc32());
        checkSum = bytes.array();
        return checkSum;
    }

}
