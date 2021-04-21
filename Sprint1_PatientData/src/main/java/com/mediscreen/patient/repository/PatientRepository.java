package com.mediscreen.patient.repository;

import com.mediscreen.patient.entity.Patient;
import java.time.LocalDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
  boolean existsPatientByFamilyNameAndGivenNameAndDateOfBirth(String family, String given,
                                                              LocalDate dob);

  Patient findPatientByFamilyNameAndGivenName(String family, String given);

  boolean existsPatientById(Long id);
}
