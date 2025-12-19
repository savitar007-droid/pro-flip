package com.flipr.pro_flip.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "contacts")
public class Contact {
    @Id
    private String id;
    private String fullName;
    private String email;
    private String mobile;
    private String city;
}

