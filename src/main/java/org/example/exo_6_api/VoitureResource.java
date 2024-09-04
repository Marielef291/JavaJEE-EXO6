package org.example.exo_6_api;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/voiture")
public class VoitureResource {
    private final VoitureService voitureService;

    @Inject
    public VoitureResource(VoitureService voitureService) {
        this.voitureService = voitureService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Voiture getVoiture() {
        Voiture voiture = new Voiture("nissan", "2020", "bleu");
        return voiture;
    }

    //
//    @GET
//    @Path("/save")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Voiture getID() {
////        return voitureService.save( "peugot", "2000", "rouge");
//    }

    //
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Voiture postVoiture(Voiture voiture) {
        return voitureService.save(voiture);
    }


//    @POST
//    @Path("/ajout")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Voiture postVoitureV2(@RequestBody ("marque") String marque,@QueryParam("annee") String anneeFabrication, @QueryParam("couleur") String couleur){
//        return new Voiture(1,marque,anneeFabrication,couleur);
//    }
//
//    @DELETE
//    @Path("{id}") // verbe DELETE  http://localhost:8080/demo_api_rest_war_exploded/api/voiture/XX
//    public int delete(@PathParam("id") int id){
//        return id;
//    }
}
