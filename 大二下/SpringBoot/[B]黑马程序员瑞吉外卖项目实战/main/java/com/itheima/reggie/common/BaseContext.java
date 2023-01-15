package com.itheima.reggie.common;

/**
 * 基于ThreadLocal封装工具类, 用户保存和获取当前登录用户id
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    /**
     * 设置当前登录用户id
     * @param id 用户id
     */
    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }

    /**
     * 获取当前登录用户id
     * @return 用户id
     */
    public static Long getCurrentId() {
        return threadLocal.get();
    }
}
