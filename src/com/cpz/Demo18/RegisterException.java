package com.cpz.Demo18;
/*
自定义异常类
1.自定义异常类一般都是Exception结尾，说明类是一个异常类
2.自定义异常类，必须的继承Exception或者RuntimeException
    继承Exception：那么自定义的异常类就是一个编译期异常，如果方法内部抛出了编译期异常，就必须处理这个异常，要么throws，要么try。。catch
    继承RuntimeException：那么自定义的异常类就是一个运行期异常，无需处理，交给虚拟机（中断处理）
 */
public class RegisterException extends Exception{
    //添加一个空参数的构造方法
    public RegisterException() {
    }

    //添加一个带异常信息的构造方法
    public RegisterException(String message){
        super(message);
    }
}
