package com.ParcialBackEnd.ParcialBackEnd.services;

import com.ParcialBackEnd.ParcialBackEnd.entities.Localidad;
import com.ParcialBackEnd.ParcialBackEnd.repositories.BaseRepository;
import com.ParcialBackEnd.ParcialBackEnd.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {

    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
