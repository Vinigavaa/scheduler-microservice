package com.microsservice.apims.repository;

import com.microsservice.apims.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
