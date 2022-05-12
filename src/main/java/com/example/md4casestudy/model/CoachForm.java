package com.example.md4casestudy.model;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class CoachForm {
    private Long id;
    private String name;
    private String DoB;
    private Nationality nationality;
    private MultipartFile cv;
}
