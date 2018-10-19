package com.cc.jni.service;

public class JniService {

    //load library
    static {
        System.loadLibrary("Jni-demo");
    }

    /* void */
    public native void println(char c);
    /* return a*b */
    public native int multiply(int a, int b);
}
