package com.codewithmosh.store.dtos;

public class UserDto {
    private Long id;
    private String name;
    private String email;

    // required by MapStruct generated code (no-arg)
    public UserDto() {}

    // convenience all-args constructor (MapStruct may use this if configured)
    public UserDto(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // getters + setters (MapStruct uses setters if present)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}