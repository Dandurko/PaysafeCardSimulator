package com.project.paysafecard.core.service.jpaService;

import com.project.paysafecard.core.model.entity.PaysafeLog;
import com.project.paysafecard.core.model.entity.User;
import com.project.paysafecard.core.repository.PaysafeLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaysafeLogServiceImpl implements PaysafeLogService {

    @Autowired
    private PaysafeLogRepository paysafeLogRepository;

    @Override
    public void save(PaysafeLog paysafeLog) {
        paysafeLogRepository.save(paysafeLog);
    }

    @Override
    public List<PaysafeLog> findAllByUser(User user) {
        return paysafeLogRepository.findAllByUser(user);
    }
}
