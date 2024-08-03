package com.ironhack.tfdtheorycraftbuild.model;
import com.ironhack.tfdtheorycraftbuild.model.Build;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CapacityValidator implements ConstraintValidator<ValidCapacity, Build> {

    @Override
    public boolean isValid(Build build, ConstraintValidatorContext context) {
        if (build.getMaxCapacity() != null && build.getCurrentCapacity() != null) {
            return build.getCurrentCapacity() <= build.getMaxCapacity();
        }
        return true;
    }
}

