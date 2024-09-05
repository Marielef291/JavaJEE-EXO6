package org.example.exo_6_api;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/voiture")
public class VoitureResource {
    private final VoitureService voitureService;

    @Inject
    public VoitureResource(VoitureService voitureService) {
        this.voitureService = voitureService;
    }

    // Renvoie la liste de toutes les voitures enregistrées
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Voiture> getVoitures() {
        return voitureService.getAllVoitures();
    }

    // Ajoute une nouvelle voiture et retourne l'objet voiture sauvegardé
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Voiture postVoiture(Voiture voiture) {
        return voitureService.save(voiture);
    }

    // Rechercher une voiture par son ID
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getVoitureById(@PathParam("id") int id) {
        Voiture voiture = voitureService.getVoitureById(id);
        return Response.ok(voiture).build();
    }

    //Supression d'une voiture par son ID
    @DELETE
    @Path("/{id}")
    public int deleteVoiture(@PathParam("id") int id){
        return voitureService.deleteVoitureById(id);
    }


}
