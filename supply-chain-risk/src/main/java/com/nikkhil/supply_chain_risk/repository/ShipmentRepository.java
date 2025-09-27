package com.nikkhil.supply_chain_risk.repository;

import com.nikkhil.supply_chain_risk.model.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Long> {

}