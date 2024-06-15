package me.liga.Equipo.infrastructure.adapter.out.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.liga.Equipo.domain.Equipo;

public interface EquipoRepository extends JpaRepository<Equipo, Integer> {

    
}
