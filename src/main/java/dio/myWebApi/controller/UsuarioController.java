package dio.myWebApi.controller;

import dio.myWebApi.model.Usuario;
import dio.myWebApi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;

    @GetMapping()
    public List<Usuario> getUsers(){
            return repository.findAll();
    };

    @GetMapping("/{username}")
    public Usuario getUsers(@PathVariable("username") String username){
        return repository.findByUsername(username);
    };
    @DeleteMapping("/{id}")
    public void delete(Integer id){
        repository.deleteById(id);
    }
    @PostMapping()
    public void postUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
}
