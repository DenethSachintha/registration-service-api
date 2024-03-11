package com.sachin.lms.registrationserviceapi.repository;

import com.sachin.lms.registrationserviceapi.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
}