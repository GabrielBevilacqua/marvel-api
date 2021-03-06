package com.gabriel.scavassa.marvelapi.domain.comic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "text_objects")
public class TextObjects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "text_objects_id")
    private Integer id;
    private String type;
    private String lenguage;
    private String text;

}
