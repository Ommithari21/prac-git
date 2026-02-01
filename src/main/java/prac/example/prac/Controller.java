package prac.example.prac;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ControllerAdvice
class Controller{

    @ExceptionHandler(MethodArgumentNotValidException.class)
public ResponseEntity<Map<String,String>>data(MethodArgumentNotValidException ex)
{
    Map<String,String>errors=new HashMap<>();
    List<FieldError>fiels=ex.getBindingResult().getFieldErrors();

    for( FieldError error:fiels) {
   errors.put(error.getField(), error.getDefaultMessage());
}
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errors);

    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String>da(Exception ex){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("not valid");
    }
}

