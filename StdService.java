
package com.prema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StdService {
    @Autowired
    StdRepo rep;
    public Std addData(Std s)
    {
     return rep.save(s);
    }
    public Std getData(String email)
    {
        return rep.findById(email).orElse(new Std());
    }
}
