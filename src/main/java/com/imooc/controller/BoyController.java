package com.imooc.controller;

import com.imooc.domain.Boy;
import com.imooc.domain.Girl;
import com.imooc.domain.Result;
import com.imooc.repository.BoyRepository;
import com.imooc.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class BoyController {
    @Autowired
    private BoyRepository boyRepository;

    @PostMapping(value = "/Boy")
    public Result<Boy> addBoy(@Valid Boy boy, BindingResult bindingResult){
        if (bindingResult.hasErrors())
            return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());
        return ResultUtil.success(boyRepository.save(boy));
//        return boyRepository.save(boy);
    }
}
