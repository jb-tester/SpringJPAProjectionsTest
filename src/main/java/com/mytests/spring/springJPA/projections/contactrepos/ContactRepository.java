package com.mytests.spring.springJPA.projections.contactrepos;

import com.mytests.spring.springJPA.projections.data.Contact;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.Optional;

/**
 * *
 * <p>Created by irina on 01.03.2021.</p>
 * <p>Project: SpringJPAProjectionsTest</p>
 * *
 */ 
@RepositoryDefinition(domainClass = Contact.class, idClass = Integer.class)
public interface ContactRepository {
    
    Optional<ContactWithDefaultMailAndPhone> findByLastname(String lastname);
}
