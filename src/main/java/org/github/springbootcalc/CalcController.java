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

    @RequestMapping("/subtract")
    public String subtract(@RequestParam(required = false) int a, @RequestParam(required = false) int b) {
        try {
            return "" + calculator.subtract(a, b);
        } catch (Exception e) {
            e.printStackTrace();
            return ("Usage <a href='subtract?a=20&b=5>subtract?a=20&b=5</a>");
        }
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
            @RequestMapping("/multiply")
    public String multiply(@RequestParam(required = false) int a, @RequestParam(required = false) int b) {
        try {
            return "" + calculator.multiply(a, b);
        } catch (Exception e) {
            e.printStackTrace();
            return ("Usage <a href='multiply?a=20&b=5>multiply?a=20&b=5</a>");
        }
    }
            @RequestMapping("/divide")
    public String divide(@RequestParam(required = false) int a, @RequestParam(required = false) int b) {
        try {
            return "" + calculator.divide(a, b);
        } catch (Exception e) {
            e.printStackTrace();
            return ("Usage <a href='divide?a=20&b=5>divide?a=20&b=5</a>");
        }
    }

}