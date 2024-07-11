package com.export.export_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.export.export_demo.model.Exporter;
import java.util.Optional;

public interface ExporterRepository extends JpaRepository<Exporter, String> {

    Optional<Exporter> findByIdentification(String identification);
}
