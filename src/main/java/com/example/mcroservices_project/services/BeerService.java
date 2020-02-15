package com.example.mcroservices_project.services;

import com.example.mcroservices_project.web.model.BeerDto;

public interface BeerService {
    BeerDto getBeerById(String beerId);
}
