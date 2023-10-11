package com.ParcialBackEnd.ParcialBackEnd.services;

import com.ParcialBackEnd.ParcialBackEnd.entities.Autor;
import com.ParcialBackEnd.ParcialBackEnd.repositories.AutorRepository;
import com.ParcialBackEnd.ParcialBackEnd.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService{

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
