package pl.coderslab.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Pole musi być niepuste")
    @Column(name = "first_name_and_last_name")
    private String firstNameAndLastName;

    @NotBlank(message = "Należy wprowadzić poprawny email")
    @Email(message = "Należy wprowadzić poprawny email")
    private String email;

    @Pattern(regexp = "^[\\+]?\\d{9,}$", message = "Numer telefonu musi być w formacie bez spacji i nawiasów i zawierać co najmniej 9 cyfr: +ddddddddd lub ddddddddd")
    private String phone;

    // dodać enum listę funkcji

    @Column(name = "is_entitled_to_make_entry")
    private boolean isEntitledToMakeEntryInSiteRecordBook;

    @Column(name = "construction_license")
    private String constructionLicense;

    @OneToMany(mappedBy = "propertyDeveloper")
    private List<SiteRecordBook> siteRecordBooksWhereGivenPropertyDeveloper = new ArrayList<>();

    @OneToMany(mappedBy = "authorOfEntry")
    private List<Entry> entriesOfUser = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<EntitledInSpecificSiteRecordBook> entitledInSpecificSiteRecordBook = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstNameAndLastName() {
        return firstNameAndLastName;
    }

    public void setFirstNameAndLastName(String firstNameAndLastName) {
        this.firstNameAndLastName = firstNameAndLastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isEntitledToMakeEntryInSiteRecordBook() {
        return isEntitledToMakeEntryInSiteRecordBook;
    }

    public void setEntitledToMakeEntryInSiteRecordBook(boolean entitledToMakeEntryInSiteRecordBook) {
        isEntitledToMakeEntryInSiteRecordBook = entitledToMakeEntryInSiteRecordBook;
    }

    public String getConstructionLicense() {
        return constructionLicense;
    }

    public void setConstructionLicense(String constructionLicense) {
        this.constructionLicense = constructionLicense;
    }

    public List<SiteRecordBook> getSiteRecordBooksWhereGivenPropertyDeveloper() {
        return siteRecordBooksWhereGivenPropertyDeveloper;
    }

    public void setSiteRecordBooksWhereGivenPropertyDeveloper(List<SiteRecordBook> siteRecordBooksWhereGivenPropertyDeveloper) {
        this.siteRecordBooksWhereGivenPropertyDeveloper = siteRecordBooksWhereGivenPropertyDeveloper;
    }

    public List<Entry> getEntriesOfUser() {
        return entriesOfUser;
    }

    public void setEntriesOfUser(List<Entry> entriesOfUser) {
        this.entriesOfUser = entriesOfUser;
    }

    public List<EntitledInSpecificSiteRecordBook> getEntitledInSpecificSiteRecordBook() {
        return entitledInSpecificSiteRecordBook;
    }

    public void setEntitledInSpecificSiteRecordBook(List<EntitledInSpecificSiteRecordBook> entitledInSpecificSiteRecordBook) {
        this.entitledInSpecificSiteRecordBook = entitledInSpecificSiteRecordBook;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstNameAndLastName='" + firstNameAndLastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", isEntitledToMakeEntryInSiteRecordBook=" + isEntitledToMakeEntryInSiteRecordBook +
                ", constructionLicense='" + constructionLicense + '\'' +
                '}';
    }
}
