package com.example.mcroservices_project.web.mappers;

import com.example.mcroservices_project.domain.Customer;
import com.example.mcroservices_project.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDto customerDto);

    CustomerDto customerToCustomerDto(Customer customer);


}
