package ubilapaz.edu.bo.clasetallerex.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ubilapaz.edu.bo.clasetallerex.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
