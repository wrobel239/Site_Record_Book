package pl.coderslab.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class EntitledInSpecificSiteRecordBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // dodać enum listę funkcji

    @ManyToOne
    @JoinColumn(name = "site_record_book_id")
    private SiteRecordBook siteRecordBook;

    @ManyToOne
    private User user;

    @ManyToMany(mappedBy = "confirmation")
    private List<Entry> confirmationOfEntries = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SiteRecordBook getSiteRecordBook() {
        return siteRecordBook;
    }

    public void setSiteRecordBook(SiteRecordBook siteRecordBook) {
        this.siteRecordBook = siteRecordBook;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Entry> getConfirmationOfEntries() {
        return confirmationOfEntries;
    }

    public void setConfirmationOfEntries(List<Entry> confirmationOfEntries) {
        this.confirmationOfEntries = confirmationOfEntries;
    }

    @Override
    public String toString() {
        return "EntitledInSpecificSiteRecordBook{" +
                "id=" + id +
                '}';
    }
}
