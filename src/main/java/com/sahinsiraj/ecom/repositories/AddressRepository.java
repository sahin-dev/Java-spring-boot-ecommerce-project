package com.sahinsiraj.ecom.repositories;

import com.sahinsiraj.ecom.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
