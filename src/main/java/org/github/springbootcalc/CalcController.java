package org.github.springbootcalc;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.clc.Calculator;

@RestController
public class CalcController {

    Calculator calculator = new Calculator();

    @RequestMapping("")
    public String index() {
        return "Try <a href='add'>/add</a> <a href='sub'>/sub</a> <a href='mul'>/mul</a> and <a href='div'>/div</a> URLs";
    }

    @RequestMapping("/add")
    public String add(@RequestParam(required = false) int a, @RequestParam(required = false) int b) {
        try {
            return "" + calculator.add(a, b);
        } catch (Exception e) {
            e.printStackTrace();
            return ("Usage <a href='add?a=20&b=5>add?a=20&b=5</a>");
        }
    }

}