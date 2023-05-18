package com.devops.playground.controller;

import com.devops.playground.model.Pet;
import com.devops.playground.service.PetService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/api/v1/pets")
@AllArgsConstructor
public class PetApi {

    private PetService petService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(path = "/{id}")
    public Pet getPetByID(@RequestParam Long id) {
        return petService.getPetByID(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Pet createPet(@RequestBody Pet pet) {
        return petService.createPet(pet);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "/{id}")
    public void deletePetByID(@RequestParam Long id) {
        petService.deletePetByID(id);
    }
}
