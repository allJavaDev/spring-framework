package com.alljavadev.repository;

import com.alljavadev.model.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MerchantRepository extends JpaRepository<Merchant, Long> {
}
