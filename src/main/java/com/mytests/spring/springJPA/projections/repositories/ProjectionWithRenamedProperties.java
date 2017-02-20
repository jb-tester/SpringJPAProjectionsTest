package com.mytests.spring.springJPA.projections.repositories;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by irina on 2/20/2017.
 */
public interface ProjectionWithRenamedProperties {
    String getName();
    @Value("#{target.sex}")
    String getGender();
    @Value("#{target.forSale and target.weight>500}")
    boolean isAvailable();
    @Value("!!!")
    String getBar();
}
