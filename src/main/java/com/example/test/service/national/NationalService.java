package com.example.test.service.national;

import com.example.test.model.National;
import com.example.test.repository.INationalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NationalService implements INationalService {
    @Autowired
    private INationalRepository nationalRepository;

    @Override
    public Iterable<National> findAll() {
        return nationalRepository.findAll();
    }

    @Override
    public Optional<National> findById(Long id) {
        return nationalRepository.findById(id);
    }

    @Override
    public void save(National national) {
        nationalRepository.save(national);
    }

    @Override
    public void remove(Long id) {
        nationalRepository.deleteById(id);
    }
}