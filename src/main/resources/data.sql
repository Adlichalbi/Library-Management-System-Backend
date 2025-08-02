-- Insert sample books data
INSERT INTO books (title, author, isbn, genre, total_copies, available_copies) VALUES
    ('The Great Gatsby', 'F. Scott Fitzgerald', '978-0743273565', 'Fiction', 3, 3);

INSERT INTO books (title, author, isbn, genre, total_copies, available_copies) VALUES
    ('To Kill a Mockingbird', 'Harper Lee', '978-0061120084', 'Fiction', 2, 1);

INSERT INTO books (title, author, isbn, genre, total_copies, available_copies) VALUES
    ('1984', 'George Orwell', '978-0451524935', 'Dystopian', 4, 4);

INSERT INTO books (title, author, isbn, genre, total_copies, available_copies) VALUES
    ('Pride and Prejudice', 'Jane Austen', '978-0141439518', 'Romance', 2, 2);

INSERT INTO books (title, author, isbn, genre, total_copies, available_copies) VALUES
    ('The Catcher in the Rye', 'J.D. Salinger', '978-0316769174', 'Fiction', 3, 0);

INSERT INTO books (title, author, isbn, genre, total_copies, available_copies) VALUES
    ('Lord of the Flies', 'William Golding', '978-0571056866', 'Fiction', 2, 2);

INSERT INTO books (title, author, isbn, genre, total_copies, available_copies) VALUES
    ('Animal Farm', 'George Orwell', '978-0451526342', 'Political Satire', 4, 3);

INSERT INTO books (title, author, isbn, genre, total_copies, available_copies) VALUES
    ('Brave New World', 'Aldous Huxley', '978-0060850524', 'Science Fiction', 3, 2);

INSERT INTO books (title, author, isbn, genre, total_copies, available_copies) VALUES
    ('The Hobbit', 'J.R.R. Tolkien', '978-0547928227', 'Fantasy', 5, 4);

INSERT INTO books (title, author, isbn, genre, total_copies, available_copies) VALUES
    ('Fahrenheit 451', 'Ray Bradbury', '978-1451673319', 'Science Fiction', 2, 1);

INSERT INTO books (title, author, isbn, genre, total_copies, available_copies) VALUES
    ('Of Mice and Men', 'John Steinbeck', '978-0140177398', 'Fiction', 3, 3);

INSERT INTO books (title, author, isbn, genre, total_copies, available_copies) VALUES
    ('The Lord of the Rings', 'J.R.R. Tolkien', '978-0544003415', 'Fantasy', 4, 2);

INSERT INTO books (title, author, isbn, genre, total_copies, available_copies) VALUES
    ('Harry Potter and the Sorcerer Stone', 'J.K. Rowling', '978-0439708180', 'Fantasy', 6, 5);

INSERT INTO books (title, author, isbn, genre, total_copies, available_copies) VALUES
    ('The Chronicles of Narnia', 'C.S. Lewis', '978-0066238501', 'Fantasy', 3, 1);

INSERT INTO books (title, author, isbn, genre, total_copies, available_copies) VALUES
    ('Dune', 'Frank Herbert', '978-0441172719', 'Science Fiction', 2, 2);



-- Insert sample users data
INSERT INTO users (name, email, membership_number, account_status) VALUES
    ('John Doe', 'john.doe@email.com', '1001', 'ACTIVE');

INSERT INTO users (name, email, membership_number, account_status) VALUES
    ('Jane Smith', 'jane.smith@email.com', '1002', 'ACTIVE');

INSERT INTO users (name, email, membership_number, account_status) VALUES
    ('Mike Johnson', 'mike.johnson@email.com', '1003', 'ACTIVE');

INSERT INTO users (name, email, membership_number, account_status) VALUES
    ('Sarah Wilson', 'sarah.wilson@email.com', '1004', 'SUSPENDED');

INSERT INTO users (name, email, membership_number, account_status) VALUES
    ('David Brown', 'david.brown@email.com', '1005', 'ACTIVE');

INSERT INTO users (name, email, membership_number, account_status) VALUES
    ('Emily Davis', 'emily.davis@email.com', '1006', 'INACTIVE');