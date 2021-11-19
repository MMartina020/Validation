package hu.Validation.controllers;

import hu.Validation.domain.Building;
import hu.Validation.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BuildingController {

    @Autowired
    private BuildingService service;

    @GetMapping("/buildings")
    private List<Building> getBuildings(){
        return service.getBuildings();
    }
}
