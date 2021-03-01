package com.mytests.spring.springJPA.projections.contactrepos;

/**
 * *
 * <p>Created by irina on 01.03.2021.</p>
 * <p>Project: SpringJPAProjectionsTest</p>
 * *
 */
public interface ContactWithDefaultMailAndPhone {
    
    String getFirstname();
    String getLastname();
    default String getTelephone(){
       return "xxxxxxx"; 
    }
    default String getEmail(){
        return "xxx@xxx.xxx";
    }        
}
