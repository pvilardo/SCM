package com.pvilardo.scm.model;

import javax.persistence.Entity;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.index.Indexed;

@Entity( name="USER" )
public class User {
	private ObjectId id;
    @Indexed(unique=true)
    private String username;
    private String password;
    private String role;
 
    protected User() {}
 
    public User( String username, String password, String role )
    {
        this.username = username;
        this.password = password;
        this.role = role;
    }
 
    public ObjectId getId() { return id; }
    public String getUsername() { return username; }
    public String getSHA1Password() { return password; }
    public String getRole() { return role; }
}
