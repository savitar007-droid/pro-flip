package com.flipr.pro_flip.controller;

import com.flipr.pro_flip.model.Client;
import com.flipr.pro_flip.repository.ClientRepository;
import net.coobird.thumbnailator.Thumbnails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

@RestController
@RequestMapping("/api/clients")
@CrossOrigin(origins = "*")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @PostMapping
    public Client addClient(
            @RequestParam String name,
            @RequestParam String description,
            @RequestParam String designation,
            @RequestParam MultipartFile image
    ) throws Exception {

        String fileName = System.currentTimeMillis() + ".jpg";
        File uploadDir = new File("uploads");
        if (!uploadDir.exists()) uploadDir.mkdir();

        File dest = new File(uploadDir, fileName);

        Thumbnails.of(image.getInputStream())
                .size(200, 200)
                .toFile(dest);

        Client client = new Client();
        client.setName(name);
        client.setDescription(description);
        client.setDesignation(designation);
        client.setImage(fileName);

        return clientRepository.save(client);
    }

    @GetMapping
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}
