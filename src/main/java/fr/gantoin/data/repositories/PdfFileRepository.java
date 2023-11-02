package fr.gantoin.data.repositories;


import fr.gantoin.data.model.PdfFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PdfFileRepository
        extends
        JpaRepository<PdfFile, Long>,
        JpaSpecificationExecutor<PdfFile> {

}
