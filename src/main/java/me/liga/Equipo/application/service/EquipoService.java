package me.liga.Equipo.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import me.liga.Equipo.domain.Equipo;
import me.liga.Equipo.infrastructure.adapter.out.repository.EquipoRepository;

@Service
public class EquipoService implements IEquipoService{

    @Autowired
    private EquipoRepository equipoRepository;

    @Override
    public Equipo buscarPorId(Integer idEquipo) {
        Equipo equipo = equipoRepository.findById(idEquipo).orElse(null);
        return equipo;
    }

    @Override
    public void eliminarEquipo(Equipo equipo) {
        equipoRepository.delete(equipo);
        
    }

    @Override
    public Equipo guardarEquipo(Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    @Override
    public List<Equipo> listarEquipos() {
        return equipoRepository.findAll();
    }
    
}
