package com.junyi.rpc.transport.command;

/**
 * User: JY
 * Date: 2020/5/5 0005
 * Description:
 */
public class Command {
    private Header header;
    private byte[] payload;

    public Command(Header header, byte[] payload) {
        this.header = header;
        this.payload = payload;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public byte[] getPayload() {
        return payload;
    }

    public void setPayload(byte[] payload) {
        this.payload = payload;
    }
}
