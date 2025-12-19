package com.flipr.pro_flip.controller;



import com.flipr.pro_flip.model.Project;
import com.flipr.pro_flip.repository.ProjectRepository;
import net.coobird.thumbnailator.Thumbnails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

@RestController
@RequestMapping("/api/projects")
@CrossOrigin
public class ProjectController {

    @Autowired
    private ProjectRepository repo;

    @PostMapping
    public Project addProject(
            @RequestParam String name,
            @RequestParam String description,
            @RequestParam MultipartFile image
    ) throws Exception {

        String fileName = System.currentTimeMillis() + ".jpg";
        File dest = new File("uploads/" + fileName);

        Thumbnails.of(image.getInputStream())
                .size(450, 350)
                .toFile(dest);

        Project p = new Project();
        p.setName(name);
        p.setDescription(description);
        p.setImage(fileName);

        return repo.save(p);
    }

    @GetMapping
    public List<Project> getAll() {
        return repo.findAll();
    }
}

