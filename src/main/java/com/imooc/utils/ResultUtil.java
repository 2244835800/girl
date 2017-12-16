package com.imooc.utils;

import com.imooc.domain.Result;

/**
 * 封装结果
 * Created by 廖师兄
 * 2017-01-21 13:39
 */
public class ResultUtil {

    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }


    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
