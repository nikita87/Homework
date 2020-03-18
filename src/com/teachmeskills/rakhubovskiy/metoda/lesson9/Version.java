package com.teachmeskills.rakhubovskiy.metoda.lesson9;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Version {
    String versionOfClass();
    String codeNameVersion() default "Nougat";
}
