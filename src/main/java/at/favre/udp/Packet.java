package at.favre.udp;

/**
 * udp content field
 * @auther: luolin
 * @email: ll950129@gmail.com
 * create at 2018-12-08
 */
public class Packet {

    short dataType;

    short dataLen;

    String body;

    public Packet() {

    }

    public Packet(short dataType, short dataLen, String body) {
        this.dataType = dataType;
        this.dataLen = dataLen;
        this.body = body;
    }

    public short getDataType() {
        return dataType;
    }

    public void setDataType(short dataType) {
        this.dataType = dataType;
    }

    public short getDataLen() {
        return dataLen;
    }

    public void setDataLen(short dataLen) {
        this.dataLen = dataLen;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ packet datatype: ").append(dataType).append(", ")
                .append("datalen: ").append(dataLen).append(", ")
                .append("body: ").append(body).append(" }");
        return sb.toString();
    }
}
