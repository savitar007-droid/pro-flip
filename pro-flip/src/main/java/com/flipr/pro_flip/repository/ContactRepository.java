package com.flipr.pro_flip.repository;

import com.flipr.pro_flip.model.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactRepository extends MongoRepository<Contact, String> {
}
