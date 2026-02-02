package aliceGlow.example.aliceGlow.dto.user;

import aliceGlow.example.aliceGlow.domain.Perfil;
import aliceGlow.example.aliceGlow.domain.User;

import java.time.LocalDateTime;
import java.util.Set;

public record UserDTO(
        Long id,
        String name,
        String email,
        Set<Perfil> perfils
) {

    public static UserDTO toDTO(User user) {
        return new UserDTO(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getPerfils()
        );
    }
}
