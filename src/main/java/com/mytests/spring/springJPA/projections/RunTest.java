package com.mytests.spring.springJPA.projections;

import com.mytests.spring.springJPA.projections.configs.MainConfig;
import com.mytests.spring.springJPA.projections.services.ChinService;
import com.mytests.spring.springJPA.projections.services.Tab1Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Iterator;
import java.util.List;

/**
 * Created by irina on 2/20/2017.
 */
public class RunTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        ChinService s1 = (ChinService) ctx.getBean("chinService");
        List<String> ebonyChins = s1.getNameAndSexForChinsByColor("ebony");
        System.out.println("==== ebony chins:");
        for (String s : ebonyChins) {
            System.out.println(s);
        }
        System.out.println("==== girls:");
        List<String> girls = s1.getAvailableChinsBySex("female");
        for(String s: girls){
            System.out.println(s);
        }
        System.out.println("==== tab1:");
        Tab1Service tab1 = (Tab1Service) ctx.getBean("tab1ServiceImpl");
        List<String> tabs = tab1.findByAge(30,50);
        for (String s:tabs){
            System.out.println(s);
        }
    }}