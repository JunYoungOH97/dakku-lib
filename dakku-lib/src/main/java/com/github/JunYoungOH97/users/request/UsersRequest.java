package com.github.JunYoungOH97.users.request;

import lombok.*;

/**
 * (설명)
 * Created by jun-young.oh@kt.com
 * Date : 2023/02/02
 */
@Getter @Setter @Builder
@NoArgsConstructor @AllArgsConstructor
public class UsersRequest {
    private String email;
    private String password;
}
