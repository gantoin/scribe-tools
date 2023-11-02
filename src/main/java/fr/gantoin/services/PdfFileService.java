package fr.gantoin.services;

import fr.gantoin.data.model.PdfFile;
import fr.gantoin.data.repositories.PdfFileRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PdfFileService {

    private final PdfFileRepository repository;

    public PdfFileService(PdfFileRepository repository) {
        this.repository = repository;
    }

    public Optional<PdfFile> get(Long id) {
        return repository.findById(id);
    }

    public PdfFile update(PdfFile entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Page<PdfFile> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<PdfFile> list(Pageable pageable, Specification<PdfFile> filter) {
        return repository.findAll(filter, pageable);
    }

    public int count() {
        return (int) repository.count();
    }

}
