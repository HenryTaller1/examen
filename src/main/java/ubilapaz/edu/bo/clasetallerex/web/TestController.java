package ubilapaz.edu.bo.clasetallerex.web;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ubilapaz.edu.bo.clasetallerex.dto.UsuarioDto;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/test")
    public ResponseEntity<UsuarioDto> test(){
    String nombre="";
    UsuarioDto usuarioDto = new UsuarioDto("henry","12345",31);
        return new ResponseEntity<UsuarioDto>(usuarioDto, HttpStatus.OK);
    }
    @PostMapping("/test")
    public ResponseEntity<String> test2() {
        return new ResponseEntity<String>("Hola Mundo (POST)", HttpStatus.OK);
    }
    @PostMapping("/test2")
    public ResponseEntity<String> test2(@RequestBody UsuarioDto usuarioDto) {
        return new ResponseEntity<String>("hola "+usuarioDto.usuario+"tu password es "+usuarioDto.password, HttpStatus.OK);
    }
    @PutMapping("/test/{id}")
    public ResponseEntity<Integer> testPut(@PathVariable int id) {
        return new ResponseEntity<Integer>(id*2, HttpStatus.OK);
    }
}
