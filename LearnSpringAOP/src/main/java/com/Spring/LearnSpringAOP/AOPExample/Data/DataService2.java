package com.Spring.LearnSpringAOP.AOPExample.Data;

import org.springframework.stereotype.Repository;

@Repository
public class DataService2 {
    public int[] retrieveData(){
        return new int[]{111, 222, 333, 444, 555};
    }
}
