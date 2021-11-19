package hu.Validation.service;

import hu.Validation.domain.Building;
import hu.Validation.repositories.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildingService {

    @Autowired
    private BuildingRepository repository;

    public List<Building> getBuildings() {
        return repository.findAll();
    }
}
