package org.itmo.java_task.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CreateRequest {
    private String login;
    private String role;
    private String password;
}
