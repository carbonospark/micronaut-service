package com.carbonospark.micronaut.api;

import com.carbonospark.micronaut.data.model.Address;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Put;
import io.micronaut.validation.Validated;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@Validated
@Controller("/api")
public class MicronautApi {

    @Get(uri="/search")
    @ApiResponse(description = "Provides a simple OK back to the user")
    public HttpStatus index() {
        return HttpStatus.OK;
    }
    
    @Put(uri="/address")
    @ApiResponse(description = "Provides a simple OK back to the user", responseCode = "200")    
    public HttpStatus putExample(@Parameter Address address) {
        return HttpStatus.OK;
    }


}