package com.ganesh.courier;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;
public interface ConsignmentRepo extends JpaRepository<Consignment, Long> {
  List<Consignment> findAllByOrderByLrNoDesc();
  Optional<Consignment> findTopByOrderByLrNoDesc();
  boolean existsByLrNo(Long lrNo);
}
