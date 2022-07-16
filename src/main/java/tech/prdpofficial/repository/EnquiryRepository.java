package tech.prdpofficial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.prdpofficial.entity.EnquiryEntity;

public interface EnquiryRepository extends JpaRepository<EnquiryEntity, Integer> {

}
