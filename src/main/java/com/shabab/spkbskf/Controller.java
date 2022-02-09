package com.shabab.spkbskf;

import com.shabab.spkbskf.validation.ColorValidation;
import com.shabab.spkbskf.validation.StudentValidation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Validated
public class Controller {


    @GetMapping(value = "/hi")

    public String getAll(){
        return "hi from spring boot and kubernetes and skaffold";

    }


    @GetMapping(value = "/product")

    public String getAllItem(){

        return "get All product";

    }

     @GetMapping(value = "/color/{color}")
    public String getColor(@ColorValidation @PathVariable String color){
        return color;
    }



     @PostMapping(value = "/student")
    public String getStudent(@Valid @StudentValidation @RequestBody Student student){

        return student.toString();

    }

       @PostMapping(value = "/student2")
    public String getStudent2(@Valid  @RequestBody Student student){

        return student.toString();

    }







}
