package com.Spring.LearnSpringAOP.AOPExample.Business;

import com.Spring.LearnSpringAOP.AOPExample.Annotations.TrackTime;
import com.Spring.LearnSpringAOP.AOPExample.Data.DataService1;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;

@Service
public class BusinessService {
    private DataService1 dataService1;

    public BusinessService(DataService1 dataService1){
        this.dataService1 = dataService1;
    }

    @TrackTime
    public int calculateMax(){
        int[] data =  dataService1.retrieveData();
//        throw new RuntimeException("Something went wrong");

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        return Arrays.stream(data).max().orElse(0);
    }
}
