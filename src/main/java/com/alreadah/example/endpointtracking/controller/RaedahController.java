package com.alreadah.example.endpointtracking.controller;

import com.alreadah.example.endpointtracking.service.EndPointService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
public class RaedahController {
    @Autowired
    EndPointService endPointService;

    @GetMapping("/endPoint")
    public boolean EndPointCycleValidator(@RequestParam("list") ArrayList<Integer> list){
        log.info("inside EndPointCycleValidator() method,for list: {}",list.toString());
        boolean checkIfListHasEndPointCycle = endPointService.checkIfListHasEndPointCycle(list);
        log.info("list {} , has result of {}",list.toString(),checkIfListHasEndPointCycle);
        return checkIfListHasEndPointCycle;
    }
}
