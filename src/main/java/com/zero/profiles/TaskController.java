package com.zero.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liyanyong on 2017/12/22.
 */
@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    DBConnector connector;

    @RequestMapping(value={"/",""})
    public String hellTask() {
        connector.configure();
        return "hello task !! myage is ";
    }
}
