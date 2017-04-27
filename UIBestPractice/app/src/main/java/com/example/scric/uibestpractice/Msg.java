package com.example.scric.uibestpractice;

/**
 * Created by scric on 2017/4/27.
 */

public class Msg {
    public static final int TYPE_RECEIVED = 0;  // 表示这是一条收到的消息
    public static final int TYPE_SENT = 1;  // 表示这是一条发出的消息
    private String content;  // 表示消息的内容
    private int getTypeReceived; // 表示消息的类型

    public Msg(String content, int getTypeReceived) {
        this.content = content;
        this.getTypeReceived = getTypeReceived;
    }

    public String getContent() {
        return content;
    }

    public int getGetTypeReceived() {
        return getTypeReceived;
    }
}
