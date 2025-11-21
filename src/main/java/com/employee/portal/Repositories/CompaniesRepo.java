package com.employee.portal.Repositories;

import com.employee.portal.Entities.Companies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompaniesRepo extends JpaRepository<Companies, Long> {
}
