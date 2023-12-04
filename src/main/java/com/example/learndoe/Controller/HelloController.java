package com.example.learndoe.Controller;

import com.example.learndoe.Entity.TESTDB;
import com.example.learndoe.Entity.TESTDBModel;
import com.example.learndoe.repository.CustumerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private CustumerRepo custumerRepo;

    @GetMapping()
    public String hello() {
        return "Hello from nes";
    }

    @PostMapping("/addNew")
    public void saveNewUSer(@RequestBody TESTDBModel testdbModel) {
        TESTDB testdb = new TESTDB();
        testdb.setName(testdbModel.getName());
        testdb.setLastname(testdbModel.getLastname());
        custumerRepo.save(testdb);
    }

    @GetMapping("/getUser")
    private List<TESTDB> getAllUser() {
        return custumerRepo.findAll();
    }
}
