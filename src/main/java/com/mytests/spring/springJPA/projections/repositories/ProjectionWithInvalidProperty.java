package com.mytests.spring.springJPA.projections.repositories;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by irina on 2/20/2017.
 */
public interface ProjectionWithInvalidProperty {
  //  boolean isFoo();
    @Value("blablabla")
    String getBar();
}
