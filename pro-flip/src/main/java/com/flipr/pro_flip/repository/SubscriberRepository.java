package com.flipr.pro_flip.repository;

import com.flipr.pro_flip.model.Subscriber;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SubscriberRepository extends MongoRepository<Subscriber, String> {
}
