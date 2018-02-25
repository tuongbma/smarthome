package com.viettel.controller;

import com.viettel.model.Response;
import com.viettel.service.ThingService;
import com.viettel.model.Thing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ThingController {
    @Autowired
    ThingService thingService;
    @RequestMapping(value="/addthing", method = RequestMethod.POST)
    public Thing addThing(@RequestBody Thing t){
        thingService.addThing(t);
        return t;
    }

    @RequestMapping(value = "/getlistthing", method = RequestMethod.GET)
    public Response getListThing(){
        return thingService.getResponse();
    }

    @RequestMapping(value = "/editthing", method = RequestMethod.POST)
    public Response editThing(@RequestBody Response t){
        thingService.editResponse(t);
        return t;
    }


    @RequestMapping(value = "/findthing", method = RequestMethod.GET)
    public Response findThing(@RequestParam("name") String name){
        return thingService.findThing(name);

    }


}
