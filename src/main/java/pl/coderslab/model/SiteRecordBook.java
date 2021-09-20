package pl.coderslab.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
@Table(name = "site_record_book")
public class SiteRecordBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Pole musi być niepuste")
    private String numberOfSiteRecordBook;

    private LocalDateTime dateOfIssued;

    @NotBlank(message = "Pole musi być niepuste")
    private String typeAndNameOfConstruction;

    @NotBlank(message = "Pole musi być niepuste")
    private String buildingPlot;

    @OneToOne
    @JoinColumn(name = "building_licence_id")
    private BuildingLicence buildingLicence;

    @ManyToOne
    @JoinColumn(name = "address_of_property_developer_id")
    private Address addressOfPropertyDeveloper;

    @ManyToOne
    @JoinColumn(name = "address_of_construction_project_id")
    private Address addressOfConstructionProject;

    @ManyToOne
    @JoinColumn(name = "property_developer_id")
    private User propertyDeveloper;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumberOfSiteRecordBook() {
        return numberOfSiteRecordBook;
    }

    public void setNumberOfSiteRecordBook(String numberOfSiteRecordBook) {
        this.numberOfSiteRecordBook = numberOfSiteRecordBook;
    }

    public LocalDateTime getDateOfIssued() {
        return dateOfIssued;
    }

    public void setDateOfIssued(LocalDateTime dateOfIssued) {
        this.dateOfIssued = dateOfIssued;
    }

    public String getTypeAndNameOfConstruction() {
        return typeAndNameOfConstruction;
    }

    public void setTypeAndNameOfConstruction(String typeAndNameOfConstruction) {
        this.typeAndNameOfConstruction = typeAndNameOfConstruction;
    }

    public String getBuildingPlot() {
        return buildingPlot;
    }

    public void setBuildingPlot(String buildingPlot) {
        this.buildingPlot = buildingPlot;
    }

    public BuildingLicence getBuildingLicence() {
        return buildingLicence;
    }

    public void setBuildingLicence(BuildingLicence buildingLicence) {
        this.buildingLicence = buildingLicence;
    }

    public Address getAddressOfPropertyDeveloper() {
        return addressOfPropertyDeveloper;
    }

    public void setAddressOfPropertyDeveloper(Address addressOfPropertyDeveloper) {
        this.addressOfPropertyDeveloper = addressOfPropertyDeveloper;
    }

    public Address getAddressOfConstructionProject() {
        return addressOfConstructionProject;
    }

    public void setAddressOfConstructionProject(Address addressOfConstructionProject) {
        this.addressOfConstructionProject = addressOfConstructionProject;
    }

    public User getPropertyDeveloper() {
        return propertyDeveloper;
    }

    public void setPropertyDeveloper(User propertyDeveloper) {
        this.propertyDeveloper = propertyDeveloper;
    }

    @Override
    public String toString() {
        return "SiteRecordBook{" +
                "id=" + id +
                ", numberOfSiteRecordBook='" + numberOfSiteRecordBook + '\'' +
                ", dateOfIssued=" + dateOfIssued +
                ", typeAndNameOfConstruction='" + typeAndNameOfConstruction + '\'' +
                ", buildingPlot='" + buildingPlot + '\'' +
                '}';
    }
}
