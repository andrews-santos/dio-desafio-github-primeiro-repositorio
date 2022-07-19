package dio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import dio1.Repository.UserRepository;
import dio1.model.User;


@Component /*informando que a classe passa a ser um componente */
/*implementar o method run */
public class StartApp implements CommandLineRunner {    
@Autowired /*@Autowired para haver a injeção de controle de dependência*/    
private UserRepository repository;
    @Override  
    public void run(String... args) throws Exception { 
        User user = new User();
        user.setName("andrews");
        user.setUsernme("adws");
        user.setPassword("123456");
        
        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u); /*imprime a lista de usuários */
        }

        
    }

    
}