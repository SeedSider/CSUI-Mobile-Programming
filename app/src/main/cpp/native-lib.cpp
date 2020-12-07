//
// Created by Karasu on 12/8/2020.
//

#include <jni.h>
#include <string>
#include <iostream>

extern "C" JNIEXPORT jstring JNICALL
Java_id_ac_ui_cs_mobileprogramming_usmansidiq_helloworld_MainActivity_getHello(JNIEnv* env, jobject /* this */) {
    std::string hello = "Hello from C++";

    return env->NewStringUTF(hello.c_str());

}
