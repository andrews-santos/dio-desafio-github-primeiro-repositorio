package dio1.Repository;

import dio1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

//public interface UserRepository extends JpaRepository<User, Integer>

public interface UserRepository extends JpaRepository<User, Integer>{

    
} 