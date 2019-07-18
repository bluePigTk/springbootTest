package com.tk.exam.service.impl;
import com.tk.exam.mapper.FilmMapper;
import com.tk.exam.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FilmServiceImpl {
    @Autowired
    FilmMapper filmMapper;
    @Transactional
    public void saveFilm(Film film){
    filmMapper.insertFilm(film);
    }
}
