package me.liga.Equipo.infrastructure.adapter.in;


import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.liga.Equipo.application.service.IEquipoService;
import me.liga.Equipo.domain.Equipo;

@RestController // Envia json al front
// http//localhost:8080/liga-app/
@RequestMapping("liga-app")
@CrossOrigin(value = "http//localhost:3000") // indica que los puerto de la app en front y back estan en diferentes puertos
public class EquipoController {
    private static final Logger logger = LoggerFactory.getLogger(EquipoController.class); // Esta variable permite enviar info a la consola

    @Autowired
    private IEquipoService equipoService;
    // http://localhost:8080/liga-app/equipos
    @GetMapping("/equipo")
    public List <Equipo> obtenerEquipos() {
        List<Equipo> equipos = equipoService.listarEquipos();
        equipos.forEach(equipo -> logger.info(equipo.toString()));
        return equipos;
    }
}
