package com.mytests.spring.springJPA.projections.services;

import com.mytests.spring.springJPA.projections.repositories.ChinsRepoJustNameAndSex;
import com.mytests.spring.springJPA.projections.repositories.ChinsRepoUsingProjectionWithRenamedProperties;
import com.mytests.spring.springJPA.projections.repositories.JustNameAndSex;
import com.mytests.spring.springJPA.projections.repositories.ProjectionWithRenamedProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by irina on 2/20/2017.
 */
@Service("chinService")
public class ChinServiceImpl implements ChinService {

    @Autowired
    private ChinsRepoJustNameAndSex repo1;
    @Autowired
    private ChinsRepoUsingProjectionWithRenamedProperties repo2;


    @Override
    public List<String> getNameAndSexForChinsByColor(String color) {
        List<String> rez = new ArrayList<>();
        List<JustNameAndSex> chins = repo1.findChinByColorContains(color);
        for (JustNameAndSex chin : chins) {
            rez.add(chin.getSex() + " chinchilla " + chin.getName());
        }
        return rez;
    }

    @Override
    public List<String> getAvailableChinsBySex(String sex) {
       List<String> rez = new ArrayList<>();
       List<ProjectionWithRenamedProperties> chins = repo2.findChinsEntitiesBySex(sex);
       for (ProjectionWithRenamedProperties c:chins){
          String flag;
          if(c.isAvailable()){flag = "available";} else {flag = "not available";}
          rez.add(c.getName()+" "+flag+" "+c.getBar());
       }
       return rez;
    }
}
