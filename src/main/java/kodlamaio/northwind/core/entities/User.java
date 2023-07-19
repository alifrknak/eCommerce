package kodlamaio.northwind.core.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name ="Users")
@AllArgsConstructor
@NoArgsConstructor
public class User {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="Id")
		private int id;
		
		@Email
		@NotBlank
		@NotNull
		@Column(name="Email")
		private String email;
		
		@NotBlank
		@NotNull
		@Column(name="Password")
		private String password;
}


