package org.example.exo_6_api;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class VoitureService {
    private List<Voiture> voitures;
    private static int nextId = 1;

    public VoitureService() {
        voitures = new ArrayList<>();
    }

    public Voiture save(Voiture voiture) {
        voiture.setId(nextId++);
        voitures.add(voiture);
        return voiture;
    }

    public List<Voiture> getAllVoitures() {
        return voitures;
    }

    public Voiture getVoitureById(int id) {
        return voitures.stream().filter(voiture -> voiture.getId() == id).findFirst()
                .orElse(null); // Retourne null si aucune voiture n'est trouvée
    }

    public int deleteVoitureById(int id) {
        voitures.stream().filter(voiture -> voiture.getId() == id).findFirst()
                .orElse(null);
        return id;
    }
}
