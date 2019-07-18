package com.tk.exam.mapper;

import com.tk.exam.model.Film;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
@Component
@Mapper
public interface FilmMapper {
    void insertFilm(Film film);
}
