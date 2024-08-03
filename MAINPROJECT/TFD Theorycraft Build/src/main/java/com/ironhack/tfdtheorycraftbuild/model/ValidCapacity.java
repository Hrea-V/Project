package com.ironhack.tfdtheorycraftbuild.model;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = CapacityValidator.class)
@Documented
public @interface ValidCapacity {
    String message() default "Current capacity cannot exceed max capacity";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
