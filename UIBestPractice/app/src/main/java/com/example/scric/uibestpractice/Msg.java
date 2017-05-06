package com.example.scric.uibestpractice;

/**
 * Created by scric on 2017/4/27.
 * @since  定义消息的实体类. 这是逻辑代码.
 */

class Msg {
    static final int TYPE_RECEIVED = 0;  // 表示这是一条收到的消息
    static final int TYPE_SENT = 1;  // 表示这是一条发出的消息
    private String content;  // 表示消息的内容
    private int getTypeReceived; // 表示消息的类型

    Msg(String content, int getTypeReceived) {
        this.content = content;
        this.getTypeReceived = getTypeReceived;
    }

    String getContent() {
        return content;
    }

    int getGetTypeReceived() {
        return getTypeReceived;
    }
}
