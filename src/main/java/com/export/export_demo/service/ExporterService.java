package com.export.export_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.export.export_demo.model.Exporter;
import com.export.export_demo.repository.ExporterRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ExporterService {

    @Autowired
    private ExporterRepository repository;

    public Exporter createExporter(Exporter exporter) {
        return repository.save(exporter);
    }

    public Optional<Exporter> getExporterByIdentification(String id) {
        return repository.findByIdentification(id);
    }

    public List<Exporter> getAllExporters() {
        return repository.findAll();
    }

    public Exporter activateExporterById(String id) {
        Optional<Exporter> optionalExporter = repository.findByIdentification(id);
        if (optionalExporter.isPresent()) {
            Exporter exporter = optionalExporter.get();
            exporter.setStatus("T");
            return repository.save(exporter);
        }
        return null;
    }

    public Exporter deactivateExporterById(String id) {
        Optional<Exporter> optionalExporter = repository.findByIdentification(id);
        if (optionalExporter.isPresent()) {
            Exporter exporter = optionalExporter.get();
            exporter.setStatus("F");
            return repository.save(exporter);
        }
        return null;
    }
}
