package com.gmontinny.roles.api.controllers;

import com.gmontinny.roles.security.adapters.driving.spring.annotations.MustBeChiefOperatingOfficer;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = ExampleControllerPaths.EXAMPLE_PATH, produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Example")
public class ExampleController {

    @GetMapping
    @Operation(summary = "Exemplo GET endpoint")
    public ResponseEntity<Void> get() {
        return ResponseEntity.ok().build();
    }

    @PostMapping
    @Operation(summary = "Exemplo POST endpoint avaliado apenas para ROLE_CHIEF_OPERATING_OFFICER")
    @MustBeChiefOperatingOfficer
    public ResponseEntity<Void> post() {
        return ResponseEntity.ok().build();
    }
}
