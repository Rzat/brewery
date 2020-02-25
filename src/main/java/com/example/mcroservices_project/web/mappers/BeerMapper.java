package com.example.mcroservices_project.web.mappers;

import com.example.mcroservices_project.domain.Beer;
import com.example.mcroservices_project.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDto beerDto);

    BeerDto beerToBeerDto(Beer beer);

}
