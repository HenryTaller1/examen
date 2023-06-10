package ubilapaz.edu.bo.clasetallerex.web;

import org.hibernate.boot.jaxb.mapping.spi.EntityOrMappedSuperclass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ubilapaz.edu.bo.clasetallerex.domain.User;
import ubilapaz.edu.bo.clasetallerex.dto.UserDto;
import ubilapaz.edu.bo.clasetallerex.persistence.UserRepository;

import java.time.LocalDateTime;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PutMapping("/editar/{id}")
    public ResponseEntity<String> registrar(@RequestBody UserDto userDto) {

        User user=new User();
        user.setNombre(userDto.nombre);
        user.setUsername(userDto.username);
        user.setUsername(userDto.password);
        user.setFechaRegistro(LocalDateTime.now());

        userRepository.save(user);
        return new ResponseEntity<String>("Registro Existoso", HttpStatus.OK);
    }
}
