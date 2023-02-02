package com.github.JunYoungOH97.users.request;

import lombok.*;

@Getter @Setter @Builder
@NoArgsConstructor @AllArgsConstructor
public class UsersSignupRequest {
    private String email;
    private String password;
}
