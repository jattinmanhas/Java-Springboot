package com.Spring.LearnSpringAOP.AOPExample.Business;

import com.Spring.LearnSpringAOP.AOPExample.Data.DataService1;
import com.Spring.LearnSpringAOP.AOPExample.Data.DataService2;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessService2 {
    private DataService2 dataService2;

    public BusinessService2(DataService2 dataService2){
        this.dataService2 = dataService2;
    }

    public int calculateMin(){
        int[] data =  dataService2.retrieveData();
//        throw new RuntimeException("Something went wrong");

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        return Arrays.stream(data).min().orElse(0);
    }
}
