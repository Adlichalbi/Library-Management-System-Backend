package projects.librarymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projects.librarymanagement.entity.User;
import projects.librarymanagement.enums.AccountStatus;

import java.util.List;
import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
    Optional<User> findByMembershipNumber(String membershipNumber);
    List<User> findByAccountStatus(AccountStatus accountStatus);


}
