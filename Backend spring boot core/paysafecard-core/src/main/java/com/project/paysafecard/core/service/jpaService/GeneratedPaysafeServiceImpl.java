package com.project.paysafecard.core.service.jpaService;

import com.project.paysafecard.core.model.entity.GeneratedPaysafe;
import com.project.paysafecard.core.repository.GeneratedPaysafeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneratedPaysafeServiceImpl implements GeneratedPaysafeService {

    @Autowired
    private GeneratedPaysafeRepository generatedPaysafeRepository;

    @Override
    public void save(GeneratedPaysafe generatedPaysafe) {

        generatedPaysafeRepository.save(generatedPaysafe);

    }
}
