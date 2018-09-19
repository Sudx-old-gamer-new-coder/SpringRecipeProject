package com.sudx.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
public class Notes {

    // == Fields ==

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @EqualsAndHashCode.Exclude
    private Recipe recipe;

    @Lob  //Binary Large Object
    private String recipeNotes;

}
