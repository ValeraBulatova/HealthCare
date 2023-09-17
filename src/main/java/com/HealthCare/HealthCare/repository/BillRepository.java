package com.HealthCare.HealthCare.repository;

import com.HealthCare.HealthCare.model.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, String> {
}
