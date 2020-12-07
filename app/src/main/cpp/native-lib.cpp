//
// Created by Karasu on 12/8/2020.
//

#include <jni.h>
#include <string>
#include <iostream>

extern "C" JNIEXPORT jstring JNICALL
Java_id_ac_ui_cs_mobileprogramming_usmansidiq_helloworld_MainActivity_getHello(JNIEnv* env, jobject) {
    std::string hello = "Hello from C++";

    return env->NewStringUTF(hello.c_str());
}

extern "C" JNIEXPORT jstring JNICALL
Java_id_ac_ui_cs_mobileprogramming_usmansidiq_helloworld_MainActivity_getStatus(JNIEnv* env, jobject, jstring name){
    const char *personName = env->GetStringUTFChars(name, NULL);
    char returnString[20];
    if (strlen(personName)%3==0) {
        strcpy(returnString, " Killer");
        env->ReleaseStringUTFChars(name, personName);

        return env->NewStringUTF(returnString);
    } else if (strlen(personName)%3==1) {
        strcpy(returnString, " Saver");
        env->ReleaseStringUTFChars(name, personName);
        return env->NewStringUTF(returnString);
    } else {
        strcpy(returnString, " Traitor");
        env->ReleaseStringUTFChars(name, personName);
        return env->NewStringUTF(returnString);
    }
}