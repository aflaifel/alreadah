package com.alreadah.example.endpointtracking.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EndPointService {

    public boolean checkIfListHasEndPointCycle(List<Integer> list ){
        if(list.isEmpty())
            return true;
        else{
            int counter = 0;
            int nextLocation=0;
            for(int i=0; i<=list.size()-1;i++){
                if(nextLocation>list.size()-1)
                    return false;
                else{
                    if(nextLocation == list.get(nextLocation))
                        nextLocation++;
                    counter++;
                    nextLocation = list.get(nextLocation);
                }
            }
            if(nextLocation<=list.size()-1 && list.get(nextLocation)== list.get(0))
                return true;
        }
        return false;
    }
}
