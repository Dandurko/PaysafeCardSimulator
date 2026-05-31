package com.project.paysafecard.core.service.jpa;


import com.project.paysafecard.core.model.entity.PaysafeLog;
import com.project.paysafecard.core.model.entity.User;

import java.util.List;

public interface PaysafeLogService {

    void save(PaysafeLog paysafeLog);

    List<PaysafeLog> findAllByUser(User user);

}
