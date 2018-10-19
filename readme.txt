1.编译.h文件：
cmd> javah com.cc.jni.service.JniService
2.在vs中新建一个dll项目jniDemo，把编译好的com_cc_jni_service_JniService.h
copy到*.app目录下，在jniDemo.app下实现com_cc_jni_service_JniService.h中的方法
3.运行vs生成dll文件，并把.dll文件copy到项目根目录下
4.加载dll:
System.loadLibrary("Jni-demo");
5.调用~