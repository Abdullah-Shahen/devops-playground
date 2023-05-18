package com.devops.playground.service;


import com.devops.playground.model.Pet;
import com.devops.playground.reposiotry.PetRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
@AllArgsConstructor
public class PetService {

    private PetRepository petRepository;

    public Pet getPetByID(Long id) {
        return petRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Pet with the provided ID not found!"));
    }

    public Pet createPet(Pet pet) {
        if (pet != null) {
            // The ID will be assigned by the DB
            pet.setId(null);

            if (!StringUtils.hasText(pet.getName())) {
                throw  new IllegalArgumentException("A Pet must have a nmae in order to be stored in the system.");
            }

            return petRepository.save(pet);
        } else {
            throw new NullPointerException("Null or Empty Pet object provided");
        }
    }

    public void deletePetByID(Long id) {
        var petToDelete = getPetByID(id);
        petRepository.deleteById(petToDelete.getId());
    }
}
