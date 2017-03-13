package com.mytests.spring.springJPA.projections.extra_repositories;

import com.mytests.spring.springJPA.projections.data.Tab1Entity;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 3/10/2017.
 * Project: projections-test
 * *******************************
 */
@RepositoryDefinition(domainClass = Tab1Entity.class, idClass = Integer.class)
public interface Tab1Repository {
    List<JustNameAndAgeForBothTabs> findByAgeBetween(int age, int age2);
}
