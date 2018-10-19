package com.cc.jni;

import com.cc.jni.service.JniService;

public class Run {
    public static void main(String[] args) {
        JniService service = new JniService();
        service.println('c');
        service.multiply(4, 6);
    }
}
