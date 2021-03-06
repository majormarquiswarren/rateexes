package rateexes.webapi.Data.Entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import rateexes.webapi.Data.Enums.Gender;

@Entity
@Table(name =  "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String username;
	private String passwordHash;
	private String salt;
	private String email;
	private LocalDate dateOfBirh;
	private Gender gender;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
