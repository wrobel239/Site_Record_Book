package pl.coderslab.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // enum zrobić jak w sklepie
    private String country;

    @NotBlank(message = "Pole musi być niepuste")
    @Column(name = "street_address")
    private String streetAddress;

    @NotBlank(message = "Pole musi być niepuste")
    private String town;

    @NotBlank(message = "Pole musi być niepuste")
    private String voivodeship;

    @Pattern(regexp = "^\\d{2}-\\d{3}$", message = "Kod pocztowy musi być w formacie: dd-ddd")
    private String postcode;

    @OneToMany(mappedBy = "addressOfPropertyDeveloper")
    private List<SiteRecordBook> siteRecordBooksWhereGivenPropertyDeveloper = new ArrayList<>();

    @OneToMany(mappedBy = "addressOfConstructionProject")
    private List<SiteRecordBook> siteRecordBooksWhereGivenConstructionProject = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getVoivodeship() {
        return voivodeship;
    }

    public void setVoivodeship(String voivodeship) {
        this.voivodeship = voivodeship;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public List<SiteRecordBook> getSiteRecordBooksWhereGivenPropertyDeveloper() {
        return siteRecordBooksWhereGivenPropertyDeveloper;
    }

    public void setSiteRecordBooksWhereGivenPropertyDeveloper(List<SiteRecordBook> siteRecordBooksWhereGivenPropertyDeveloper) {
        this.siteRecordBooksWhereGivenPropertyDeveloper = siteRecordBooksWhereGivenPropertyDeveloper;
    }

    public List<SiteRecordBook> getSiteRecordBooksWhereGivenConstructionProject() {
        return siteRecordBooksWhereGivenConstructionProject;
    }

    public void setSiteRecordBooksWhereGivenConstructionProject(List<SiteRecordBook> siteRecordBooksWhereGivenConstructionProject) {
        this.siteRecordBooksWhereGivenConstructionProject = siteRecordBooksWhereGivenConstructionProject;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", town='" + town + '\'' +
                ", voivodeship='" + voivodeship + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}
