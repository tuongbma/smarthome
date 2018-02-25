package com.viettel.service;

import com.viettel.model.IOFile;
import com.viettel.model.Response;
import com.viettel.model.Thing;
import org.springframework.stereotype.Service;

@Service
public class ThingService {
    IOFile file = new IOFile();
    Response r = new Response();

    public ThingService() {
    }

    public Response getResponse() {
        return r;
    }

    public Response editResponse(Response temp) {
        r.setData(temp.getData());
        return temp;
    }

    public boolean addThing(Thing temp) {
        if (!r.getData().contains(temp)) {
            r.getData().add(temp);
            r.setQuantity(r.getQuantity()+1);
            return true;
        }
        return false;
    }

    public Response findThing(String name) {
        Response rTemp = new Response();
        for (Thing temp : r.getData()) {
            if (temp.getName().equals(name)) {
                rTemp.getData().add(temp);
            }
        }
        rTemp.setQuantity(rTemp.getData().size());
        return rTemp;
    }
}
