package services;


import model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Pet findByLastName(String lastName);

    Set<Pet> findAll();
}
