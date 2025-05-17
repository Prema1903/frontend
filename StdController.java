
package com.prema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("std")
public class StdController {
 
    @Autowired
    StdService ser;
    
    @PostMapping
    public Std addData( Std s)
    {
        return ser.addData(s);
    }
    
    @GetMapping("/{email}")
    public Std getData(@PathVariable("email") String email )
    {
        return ser.getData(email);
    }
    
}
