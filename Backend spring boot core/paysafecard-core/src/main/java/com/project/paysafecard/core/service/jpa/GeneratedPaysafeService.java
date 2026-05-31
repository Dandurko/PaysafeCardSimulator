package com.project.paysafecard.core.service.jpa;

import com.project.paysafecard.core.model.entity.GeneratedPaysafe;
import org.springframework.stereotype.Service;

@Service
public interface GeneratedPaysafeService {

    void save(GeneratedPaysafe generatedPaysafe);
}
