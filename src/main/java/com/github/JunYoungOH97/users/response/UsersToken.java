package com.github.JunYoungOH97.users.response;

import lombok.*;

@Getter @Setter @Builder
@NoArgsConstructor @AllArgsConstructor
public class UsersToken {
    private String grantType;
    private String accessToken;
    private Long accessTokenExpiresIn;
}
