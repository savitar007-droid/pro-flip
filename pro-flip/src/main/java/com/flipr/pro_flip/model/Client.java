package com.flipr.pro_flip.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "clients")
public class Client {
    @Id
    private String id;
    private String name;
    private String description;
    private String designation;
    private String image;
}

