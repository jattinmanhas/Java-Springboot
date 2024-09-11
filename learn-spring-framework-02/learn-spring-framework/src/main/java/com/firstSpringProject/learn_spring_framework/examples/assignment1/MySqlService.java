package com.firstSpringProject.learn_spring_framework.examples.assignment1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Qualifier
public class MySqlService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[]{1,2,3,4,5};
    }
}
