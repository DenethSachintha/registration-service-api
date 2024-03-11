package com.sachin.lms.registrationserviceapi.service;

import com.sachin.lms.registrationserviceapi.dto.request.RequestRegistrationDto;

public interface RegistrationService {
    public void registerStudent(RequestRegistrationDto dto);
}