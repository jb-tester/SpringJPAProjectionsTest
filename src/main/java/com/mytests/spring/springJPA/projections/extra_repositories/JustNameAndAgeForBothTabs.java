package com.mytests.spring.springJPA.projections.extra_repositories;

import org.springframework.beans.factory.annotation.Value;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 3/10/2017.
 * Project: projections-test
 * *******************************
 */
public interface JustNameAndAgeForBothTabs {
    String getName();
    int getAge();
   // String getGender();





    @Value("#{target.id} #{target.name}")
    String getNameAndId();

}
