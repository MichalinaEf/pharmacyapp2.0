package com.michalinaef.pharmacyapp.dto;

public class MedicamentDTO {

//    private Long id;
//    private final String atcCode; //ATC Code
    private String name; //name
//    private String commonName; //commonName
//    private String pharmaceuticalForm; //pharmaceuticalForm
//    private String strength; //strength
//    private String activeSubstance; //activeSubstance
    private String producer;

    public MedicamentDTO(String name, String producer) {
        this.name = name;
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
