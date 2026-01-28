package aliceGlow.example.aliceGlow.dto;

import aliceGlow.example.aliceGlow.domain.Perfil;
import aliceGlow.example.aliceGlow.domain.User;

import java.time.LocalDateTime;
import java.util.Set;

public record UserDTO(Long id, String name, String email, String password, Set<Perfil>perfils, LocalDateTime createAt) {

    public static UserDTO toDTO(User user){
        return new UserDTO(user.getId(), user.getName(), user.getEmail(), user.getPassword(), user.getPerfils(), user.getCreatedAt());
    }

    public User fromDTO(){
        User user  = new User();
        user.setId(this.id);
        user.setName(this.name);
        user.setEmail(this.name);
        user.setPassword(this.password);
        user.setPerfils(this.perfils);
        user.setCreatedAt(this.createAt);

        return user;
    }
}
