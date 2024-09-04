package org.example.exo_6_api;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class VoitureService {
    List<Voiture> voitures;

    public VoitureService() {
        voitures = new ArrayList<>();
    }

    public Voiture save(Voiture voiture) {
        voitures.add(voiture);
        return voiture;
    }
}
