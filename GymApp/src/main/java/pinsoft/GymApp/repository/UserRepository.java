package pinsoft.GymApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pinsoft.GymApp.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {

    void deleteById(int id);
}
