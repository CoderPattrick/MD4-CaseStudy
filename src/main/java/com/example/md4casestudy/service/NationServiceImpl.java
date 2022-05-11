package com.example.md4casestudy.service;

import com.example.md4casestudy.model.Nationality;
import com.example.md4casestudy.repo.NationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

//dùng để giúp controller nhận diện được ID của National từ dữ liệu text nhập vào
@Service
public class NationServiceImpl implements NationService{
    @Autowired
    private NationRepo nationRepo;

    @Override
    public Iterable<Nationality> findAll() {
        return nationRepo.findAll();
    }

    @Override
    public Optional<Nationality> findById(Long id) {
        return nationRepo.findById(id);
    }

    @Override
    public void save(Nationality nationality) {
//không cần
    }

    @Override
    public void deleteById(Long id) {
//không cần
    }
}
