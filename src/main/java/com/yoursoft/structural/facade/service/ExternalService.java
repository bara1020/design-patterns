package com.yoursoft.structural.facade.service;

import com.yoursoft.structural.facade.domain.ExternalSystem;

public interface ExternalService {

    String getFromEmail();
    void SendEmail(ExternalSystem externalSystem);
}
