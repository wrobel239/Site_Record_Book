package pl.coderslab.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
@Table(name = "building_licence")
public class BuildingLicence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Pole musi być niepuste")
    private String numberOfDecision;

    private LocalDateTime dateOfDecision;

    @NotBlank(message = "Pole musi być niepuste")
    private String issuedBy;

    @OneToOne(mappedBy = "buildingLicence")
    private SiteRecordBook siteRecordBook;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumberOfDecision() {
        return numberOfDecision;
    }

    public void setNumberOfDecision(String numberOfDecision) {
        this.numberOfDecision = numberOfDecision;
    }

    public LocalDateTime getDateOfDecision() {
        return dateOfDecision;
    }

    public void setDateOfDecision(LocalDateTime dateOfDecision) {
        this.dateOfDecision = dateOfDecision;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    public SiteRecordBook getSiteRecordBook() {
        return siteRecordBook;
    }

    public void setSiteRecordBook(SiteRecordBook siteRecordBook) {
        this.siteRecordBook = siteRecordBook;
    }

    @Override
    public String toString() {
        return "BuildingLicence{" +
                "id=" + id +
                ", numberOfDecision='" + numberOfDecision + '\'' +
                ", dateOfDecision=" + dateOfDecision +
                ", issuedBy='" + issuedBy + '\'' +
                '}';
    }
}
