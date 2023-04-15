package com.devhamzat.CGPA.calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class CgpaController {
    private  final CgpaCalculator cgpaCalculator;
    public  CgpaController(CgpaCalculator cgpaCalculator){
        this.cgpaCalculator = cgpaCalculator;
    }
}
