package com.gmontinny.roles.security.adapters.driving.spring.annotations;

import org.springframework.security.access.prepost.PreAuthorize;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@PreAuthorize(value = "hasRole(T(com.gmontinny.roles.security.domain.model.UserRole)" +
        ".CHIEF_OPERATING_OFFICER.toString())")
public @interface MustBeChiefOperatingOfficer {
}
