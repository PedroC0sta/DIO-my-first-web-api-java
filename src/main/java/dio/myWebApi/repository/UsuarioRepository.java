package dio.myWebApi.repository;

import dio.myWebApi.handle.BusinessException;
import dio.myWebApi.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario) {
        if(usuario.getLogin() == null ) throw new BusinessException("O campo Login é obrigatório");
        if(usuario.getId() ==null) {
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        } else {
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

            System.out.println(usuario);
        }
    }
    public void deleteById(Integer id){
        System.out.println("DELETE/id - Recebendo o id: %d para excluir um usuário");

        System.out.println(id);
    }

    public List<Usuario> findAll() {
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("pedro","password"));
        usuarios.add(new Usuario("frank","123456"));
        return usuarios;
    }

    public  Usuario findById(Integer id) {
        System.out.println("FIND/id - Rebendo id: %d para localizar usuário ");
        return new Usuario("pedro","password");
    }

    public  Usuario findByUsername(String username) {
        System.out.println("FIND/username - Rebendo username: %d para localizar usuário ");
        return new Usuario("frank","123456");


    }

}
