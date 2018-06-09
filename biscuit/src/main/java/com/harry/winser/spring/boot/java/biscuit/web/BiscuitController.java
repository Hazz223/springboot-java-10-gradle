package com.harry.winser.spring.boot.java.biscuit.web;

import com.harry.winser.spring.boot.java.biscuit.service.BiscuitDto;
import com.harry.winser.spring.boot.java.biscuit.service.BiscuitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class BiscuitController {

    private final BiscuitService biscuitService;

    @Autowired
    public BiscuitController(BiscuitService biscuitService) {
        this.biscuitService = biscuitService;
    }

    @GetMapping("/biscuits")
    public Set<BiscuitDto> getAll() {

        return this.biscuitService.getAllBiscuits();
    }
}
