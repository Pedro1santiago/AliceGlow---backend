package aliceGlow.example.aliceGlow.dto;

import aliceGlow.example.aliceGlow.domain.Perfil;

public record PerfilDTO(Long id, String name) {

    public static PerfilDTO PerfilDTO(Perfil perfil){
        return new PerfilDTO(perfil.getId(), perfil.getName());
    }

    public Perfil fromDTO(){
        Perfil perfil = new Perfil();
        perfil.setId(this.id);
        perfil.setName(this.name);
        return perfil;
    }
}
