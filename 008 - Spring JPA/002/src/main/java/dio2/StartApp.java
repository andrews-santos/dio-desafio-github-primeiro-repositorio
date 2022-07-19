package dio2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import dio2.Repository.UserRepository;
import dio2.model.User;
import java.util.List;


@Component /*informando que a classe passa a ser um componente */
/*implementar o method run */
public class StartApp implements CommandLineRunner {    
@Autowired /*@Autowired para haver a injeção de controle de dependência*/    
private UserRepository repository;
    @Override  
    public void run(String... args) throws Exception { 

        //List<User> users = repository.findByNameContaining("usuario");
        //List<User> users = repository.findByUsername("usr");
        List<User> users = repository.findByName("andrews");

        for(User u: users){
            System.out.println(u);
        }
    }

    private void insertUser(){

        User user = new User();
        user.setName("usuario3");
        user.setUsernme("usr3");
        user.setPassword("123456");
        
        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u); /*imprime a lista de usuários */
        }

    }
}



    
