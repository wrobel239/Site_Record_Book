package pl.coderslab.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// sprawdzić na koniec, czy wszystkie elementy rozpiski projektu zrobione we wszystkich entity
@Entity
public class Entry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dateOfEntry;

    @NotBlank(message = "Pole musi być niepuste")
    private String contentOfEntry;

    @NotBlank(message = "Pole musi być niepuste")
    private String updatedContentOfEntry;

    private LocalDateTime dateOfUpdateOfEntry;

    @ManyToOne
    @JoinColumn(name = "author_of_entry_id")
    private User authorOfEntry;

    @ManyToMany
    @JoinTable(name = "entry_entitled",
    joinColumns = @JoinColumn(name = "entry_id"),
    inverseJoinColumns = @JoinColumn(name = "entitled_id"))
    private List<EntitledInSpecificSiteRecordBook> confirmation = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateOfEntry() {
        return dateOfEntry;
    }

    public void setDateOfEntry(LocalDateTime dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
    }

    public String getContentOfEntry() {
        return contentOfEntry;
    }

    public void setContentOfEntry(String contentOfEntry) {
        this.contentOfEntry = contentOfEntry;
    }

    public String getUpdatedContentOfEntry() {
        return updatedContentOfEntry;
    }

    public void setUpdatedContentOfEntry(String updatedContentOfEntry) {
        this.updatedContentOfEntry = updatedContentOfEntry;
    }

    public LocalDateTime getDateOfUpdateOfEntry() {
        return dateOfUpdateOfEntry;
    }

    public void setDateOfUpdateOfEntry(LocalDateTime dateOfUpdateOfEntry) {
        this.dateOfUpdateOfEntry = dateOfUpdateOfEntry;
    }

    public User getAuthorOfEntry() {
        return authorOfEntry;
    }

    public void setAuthorOfEntry(User authorOfEntry) {
        this.authorOfEntry = authorOfEntry;
    }

    public List<EntitledInSpecificSiteRecordBook> getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(List<EntitledInSpecificSiteRecordBook> confirmation) {
        this.confirmation = confirmation;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "id=" + id +
                ", dateOfEntry=" + dateOfEntry +
                ", contentOfEntry='" + contentOfEntry + '\'' +
                ", updatedContentOfEntry='" + updatedContentOfEntry + '\'' +
                ", dateOfUpdateOfEntry=" + dateOfUpdateOfEntry +
                '}';
    }
}
