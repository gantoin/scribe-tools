package fr.gantoin.data.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@NoArgsConstructor
@Setter
@Table(name = "pdf_file")
public class PdfFile extends AbstractEntity {

    private String title;

    private String author;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate publicationDate;

    /**
     * The content of the PDF file is stored as a BLOB in the database.
     */
    @Lob
    @Column(name = "pdf_content")
    private byte[] content;
}
