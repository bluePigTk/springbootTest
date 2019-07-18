package com.tk.exam.Aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class FilmInsertAspect {
    @Pointcut("execution(public * com.tk.exam..service.impl.saveFilm(..))")
    public void cutSaveFilm(){}
    @Before("cutSaveFilm()")
    public void beafore(){
        //publishSpring的事件BeforeInsertFilmEvent
    }
    @After("cutSaveFilm()")
    public void after(){
        //publishSpring的事件AfterInsertFilmEvent
    }

}

