package com.cloudtogo.demo.model.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
    @RequestMapping(method = RequestMethod.GET ,value="/plus")
    public double getPlusValue(@RequestParam double x,@RequestParam double y){
        return x+y;
    }
    @RequestMapping(method = RequestMethod.GET ,value="/minus")
    public double getMinusValue(@RequestParam double x,@RequestParam double y){
        return x-y;
    }
    @RequestMapping(method = RequestMethod.GET ,value="/multi")
    public double getMultiValue(@RequestParam double x,@RequestParam double y){
        return x*y;
    }
    @RequestMapping(method = RequestMethod.GET ,value="/devide")
    public double getDevideValue(@RequestParam double x,@RequestParam double y){
        return x/y;
    }
}
