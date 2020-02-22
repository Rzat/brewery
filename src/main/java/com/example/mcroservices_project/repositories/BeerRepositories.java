package com.example.mcroservices_project.repositories;

import com.example.mcroservices_project.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepositories extends PagingAndSortingRepository<Beer, UUID> {
}
