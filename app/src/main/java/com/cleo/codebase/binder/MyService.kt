//package com.cleo.codebase.binder
//
//import android.os.Binder
//import android.os.IBinder
//import android.os.Parcel
//import android.util.Log
//
///**
// * author:CliffLeopard
// * date:2023/1/31
// * time:11:02
// * email:precipiceleopard@gmail.com
// * link:
// */
//class MyService : Binder(), IMyService {
//    override fun sayHello(str: String?) {
//        Log.e("MyService", "sahHello: $str")
//    }
//
//    override fun asBinder(): IBinder {
//        return this
//    }
//
//    override fun onTransact(code: Int, data: Parcel, reply: Parcel?, flags: Int): Boolean {
//        return super.onTransact(code, data, reply, flags)
//    }
//}