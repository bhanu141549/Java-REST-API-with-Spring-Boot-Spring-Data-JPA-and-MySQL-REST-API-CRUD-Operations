package com.springbootrestapi.restapi.repository;

import com.springbootrestapi.restapi.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {

}
