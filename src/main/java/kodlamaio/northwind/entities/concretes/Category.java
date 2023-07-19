package kodlamaio.northwind.entities.concretes;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="Categories")
public class Category {
	@Id
	@Column(name="CategoryId")
	private int categoryId;
	@Column(name = "CategoryName")
	private String categoryName;
	
	@OneToMany(mappedBy = "category")
	private List<Product> products;
}	
