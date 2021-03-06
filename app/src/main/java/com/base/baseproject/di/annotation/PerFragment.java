package com.base.baseproject.di.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by iman.
 * iman.neofight@gmail.com
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerFragment {}