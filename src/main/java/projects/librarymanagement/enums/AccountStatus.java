package projects.librarymanagement.enums;

public enum AccountStatus {
    ACTIVE("Active", true),
    SUSPENDED("Suspended", false),
    INACTIVE("Inactive", false);

    private final String displayName;
    private final boolean canBorrowBooks;

    AccountStatus(String displayName, boolean canBorrowBooks) {
        this.displayName = displayName;
        this.canBorrowBooks = canBorrowBooks;
    }

    public String getDisplayName() {
        return displayName;
    }

    public boolean canBorrowBooks() {
        return canBorrowBooks;
    }

    public boolean isActive() {
        return this == ACTIVE;
    }
}