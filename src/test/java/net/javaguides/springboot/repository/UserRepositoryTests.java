//package net.javaguides.springboot.repository;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import net.javaguides.springboot.model.Role;
//import net.javaguides.springboot.model.User;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.test.annotation.Rollback;
//
//import java.util.Collection;
//import java.util.Optional;
//
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = Replace.NONE)
//@Rollback(false)
//public class UserRepositoryTests {
//
//    @Autowired
//    private TestEntityManager entityManager;
//
//    @Autowired
//    private UserRepository userRepo;
//
//    @Autowired
//    private RoleRepository roleRepo;
//
//    // test methods go here...
//
//
//
//    @Test
//    public void testAddRoleToNewUser() {
//        Collection<Role> roleAdmin = roleRepo.findByName("ADMIN");
//
//        User user = new User();
//        user.setEmail("mikes.gates@gmail.com");
//        user.setPassword("mike2020");
//        user.setFirstName("Mike");
//        user.setLastName("Gates");
//        user.setRoles(roleAdmin);
//
//        User savedUser = userRepo.save(user);
//
//        assertThat(savedUser.getRoles().size()).isEqualTo(1);
//    }
//
//}