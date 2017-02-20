package com.mytests.spring.springJPA.projections.repositories;

import com.mytests.spring.springJPA.projections.data.ChinsEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by irina on 2/20/2017.
 */
public interface ChinsRepoJustNameAndSex extends CrudRepository<ChinsEntity, Integer> {
    List<JustNameAndSex> findChinByColorContains(String color);
}
