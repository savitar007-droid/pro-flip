package com.flipr.pro_flip.repository;

import com.flipr.pro_flip.model.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<Client, String> {
}
