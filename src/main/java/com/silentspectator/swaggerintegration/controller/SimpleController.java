package com.silentspectator.swaggerintegration.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class SimpleController {

    @ApiOperation("Returns the Name of Person") // Describes the operation performed by the method. Provided by Swagger2
    @GetMapping("/getName")
    private String getName() {
        return "Hello this is Rahul";
    }
}
