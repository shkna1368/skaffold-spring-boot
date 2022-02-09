package com.shabab.spkbskf.validation;


import com.shabab.spkbskf.Student;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class StudentValidator implements ConstraintValidator<StudentValidation, Student>
{
    public boolean isValid(Student student, ConstraintValidatorContext cxt) {


        if(student.getAge()>25&&student.getNationality()==2){
       return false;


        }

        return true;
    }
}