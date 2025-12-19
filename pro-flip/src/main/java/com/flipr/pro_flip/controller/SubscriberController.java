package com.flipr.pro_flip.controller;

import com.flipr.pro_flip.model.Subscriber;
import com.flipr.pro_flip.repository.SubscriberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subscribe")
@CrossOrigin(origins = "*")
public class SubscriberController {

    @Autowired
    private SubscriberRepository subscriberRepository;

    @PostMapping
    public Subscriber subscribe(@RequestBody Subscriber subscriber) {
        return subscriberRepository.save(subscriber);
    }

    @GetMapping
    public List<Subscriber> getAllSubscribers() {
        return subscriberRepository.findAll();
    }
}
