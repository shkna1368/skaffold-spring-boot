package com.shabab.spkbskf.validation;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class NationalityValidator implements ConstraintValidator<NationalityValidation, Integer>
{
    public boolean isValid(Integer nationality, ConstraintValidatorContext cxt) {

        return nationality>0;
    }
}