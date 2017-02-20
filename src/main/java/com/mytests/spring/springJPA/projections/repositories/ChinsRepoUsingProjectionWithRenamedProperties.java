package com.mytests.spring.springJPA.projections.repositories;

import com.mytests.spring.springJPA.projections.data.ChinsEntity;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;

/**
 * Created by irina on 2/20/2017.
 */
@RepositoryDefinition(domainClass = ChinsEntity.class, idClass = Integer.class)
public interface ChinsRepoUsingProjectionWithRenamedProperties {
    List<ProjectionWithRenamedProperties> findChinsEntitiesBySex(String sex);
}
