package com.mytests.spring.springJPA.projections.extra_repositories;

import com.mytests.spring.springJPA.projections.data.Tab1Entity;
import com.mytests.spring.springJPA.projections.data.Tab2Entity;
import org.springframework.data.repository.RepositoryDefinition;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 3/10/2017.
 * Project: projections-test
 * *******************************
 */
@RepositoryDefinition(domainClass = Tab2Entity.class, idClass = Integer.class)
public interface Tab2Repository {
   JustNameAndAgeForBothTabs findByIdEquals(int id);
}
