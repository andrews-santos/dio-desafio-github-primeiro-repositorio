package dio1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios") /*caso não esista o sistema criará a tabela usuários */
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) /*para gerar o id automaticamente */
    @Column(name = "usuarios_id") /*atribuindo um nome para a coluna id */
    private Integer id;
    @Column(length = 50, nullable = false) /*Definindo o tamanho da coluna e que não haverá valor nulo */
    private String name;
    @Column(length = 20, nullable = false)
    private String usernme;
    @Column(length = 100, nullable = false)
    private String password;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUsernme() {
        return usernme;
    }
    public void setUsernme(String usernme) {
        this.usernme = usernme;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", password=" + password + ", usernme=" + usernme + "]";
    }
    
}
