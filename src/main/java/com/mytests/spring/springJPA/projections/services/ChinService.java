package com.mytests.spring.springJPA.projections.services;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by irina on 2/20/2017.
 */

public interface ChinService {
    List<String> getNameAndSexForChinsByColor(String color);
    List<String> getAvailableChinsBySex(String sex);
}
