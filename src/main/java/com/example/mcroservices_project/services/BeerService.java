package com.example.mcroservices_project.services;

import com.example.mcroservices_project.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer();

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
