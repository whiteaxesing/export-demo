package com.export.export_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.export.export_demo.model.Exporter;
import com.export.export_demo.service.ExporterService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/exporters")
public class ExporterController {

    @Autowired
    private ExporterService service;

    @PostMapping
    public Exporter createExporter(@RequestBody Exporter exporter) {
        return service.createExporter(exporter);
    }

    @PutMapping("/{id}/activate")
    public ResponseEntity<Exporter> activateExporter(@PathVariable String id) {
        Exporter activatedExporter = service.activateExporterById(id);
        return ResponseEntity.ok(activatedExporter);
    }

    @PutMapping("/{id}/deactivate")
    public ResponseEntity<Exporter> deactivateExporter(@PathVariable String id) {
        Exporter deactivatedExporter = service.deactivateExporterById(id);
        return ResponseEntity.ok(deactivatedExporter);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Exporter> getExporterById(@PathVariable String id) {
        Optional<Exporter> exporter = service.getExporterByIdentification(id);
        return exporter.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Exporter> getAllExporters() {
        return service.getAllExporters();
    }
}
