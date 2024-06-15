package me.liga.Equipo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@ToString
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipo;
    private String nombreEquipo;
    private int partidosJugados;
    private int pGanados; 
    private int pPerdidos; 
    private int pEmpatados; 
    private int golesFavor;
    private int golesContra; 
    private int totalPuntos;
}
