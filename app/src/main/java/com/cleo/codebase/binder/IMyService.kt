//package com.cleo.codebase.binder
//
//import android.os.IBinder
//import android.os.IInterface
//import android.os.RemoteException
//
///**
// * author:CliffLeopard
// * date:2023/1/31
// * time:11:01
// * email:precipiceleopard@gmail.com
// * link:
// */
//interface IMyService : IInterface {
//    @Throws(RemoteException::class)
//    fun sayHello(str: String?)
//
//    companion object {
//        val DESCRIPTOR = "com.cleo.codebase.binder.MyServer"
//        val TRANSACTION_say = IBinder.FIRST_CALL_TRANSACTION
//    }
//}
