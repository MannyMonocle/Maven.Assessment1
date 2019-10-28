package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */

    private String name;
    private ArrayList<Pet> pets;

    public PetOwner(String name, Pet... pets) {
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        this.pets.add(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        this.pets.remove(pet);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return this.pets.indexOf(pet) >= 0;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        int ans = 1000000;
        for(int i = 0; i < this.pets.size(); i++){
            Pet currentPet = this.pets.get(i);
            if (currentPet.getAge() < ans){ans = currentPet.getAge();}
        }

        return ans;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int ans = 0;
        for(int i = 0; i < this.pets.size(); i++){
            Pet currentPet = this.pets.get(i);
            if (currentPet.getAge() > ans){ans = currentPet.getAge();}
        }

        return ans;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        int age = 0;

        for(int i = 0; i < this.pets.size(); i++){
            Pet currentPet = this.pets.get(i);
            age += currentPet.getAge();
        }

        float ans = age/this.pets.size();

        return ans;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return this.pets.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        Pet[] array = new Pet[this.pets.size()];
        return this.pets.toArray(array);
    }
}
