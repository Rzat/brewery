package com.example.mcroservices_project.services;

import com.example.mcroservices_project.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID()).beerName("Corono Extra ")
                .upc(123L).build();
    }

    @Override
    public BeerDto saveNewBeer() {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //todo impl
    }

    @Override
    public void deleteById(UUID beerId) {
        //todo impl
        log.debug("deleting beer" + beerId);
    }
}
