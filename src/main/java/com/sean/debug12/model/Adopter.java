package com.sean.debug12.model;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "adopter")

// owning set
public class Adopter {
    public Adopter(){};

    public Adopter(Integer id, String name, String email, String location, String description, Timestamp adopt_date){
        this.id = id;
        this.name = name;
        this.email = email;
        this.location = location;
        this.description = description;
        this.adopt_date = adopt_date;
//        this.pet_id = pet_id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column (name = "tel")
    private String tel;
    @Column(name = "email")
    private String email;
    @Column(name = "location")
    private String location;
    @Column(name = "description")
    private String description;
    @Column(name = "adopt_date")
    private Timestamp adopt_date;
//    @Column(name = "pet_id")
//    private Integer pet_id;

//    @OneToOne
//    @JoinColumn(name = "pet_id")
//    private Pet petForMapping;


    //annotation where is the foreign key
//    @OneToMany(mappedBy = )
//    private Pet pet;
//
//    @OneToMany(mappedBy = "adopter", cascadeType.ALL, fetch = FetchType.LAZY)
//    private Set<Pet> accounts = new HashSet();


    // set
    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setEmial(String email) {
        this.email = email;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAdopt_date(Timestamp adopt_date) {this.adopt_date = adopt_date;}

//    public void setPet_id(Integer pet_id) {
//        this.pet_id = pet_id;
//    }
    // get


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getEmail() {
        return email;
    }

    public String getLocation() {
        return location;
    }

    public Timestamp getAdopt_date() { return adopt_date; }

//    public Integer getPet_id() {
//        return pet_id;
//    }

    public String getTel() {
        return tel;
    }
}
