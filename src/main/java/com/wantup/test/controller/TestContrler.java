package com.wantup.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zhaoluowei
 * @version 1.0
 * @date 2019/5/28 13:21
 */
@RestController
@RequestMapping(value = "/test")
public class TestContrler {

    public String testMethodOne(){

        return null;
    }


}
