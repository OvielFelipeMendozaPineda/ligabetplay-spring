package me.liga.Equipo.application.service;




import java.util.List;

import me.liga.Equipo.domain.Equipo;


public interface IEquipoService {
    public List<Equipo> listarEquipos();
    public Equipo buscarPorId(Integer idEquipo);
    public Equipo guardarEquipo(Equipo equipo);
    public void eliminarEquipo(Equipo equipo);

}
