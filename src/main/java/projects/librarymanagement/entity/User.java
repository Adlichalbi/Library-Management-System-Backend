package projects.librarymanagement.entity;

import jakarta.persistence.*;
import projects.librarymanagement.enums.AccountStatus;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Changed to Long (better practice)

    @Column(nullable = false, length = 100)
    private String name;

    @Column(unique = true, nullable = false, length = 150)
    private String email;

    @Column(name = "membership_number", unique = true, nullable = false)
    private String membershipNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "account_status", nullable = false)
    private AccountStatus accountStatus = AccountStatus.ACTIVE;  // Default value

    public User() {}

    public User(String name, String email, String membershipNumber, AccountStatus accountStatus) {
        this.name = name;
        this.email = email;
        this.membershipNumber = membershipNumber;
        this.accountStatus = accountStatus;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMembershipNumber() {
        return membershipNumber;
    }

    public void setMembershipNumber(String membershipNumber) {
        this.membershipNumber = membershipNumber;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    public boolean canBorrowBooks() {
        return accountStatus != null && accountStatus.canBorrowBooks();
    }

    public boolean isActive() {
        return accountStatus != null && accountStatus.isActive();
    }

    public void activate() {
        this.accountStatus = AccountStatus.ACTIVE;
    }

    public void suspend() {
        this.accountStatus = AccountStatus.SUSPENDED;
    }

    public void deactivate() {
        this.accountStatus = AccountStatus.INACTIVE;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", membershipNumber=" + membershipNumber +
                ", accountStatus=" + accountStatus +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id != null && id.equals(user.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}