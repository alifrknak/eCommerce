package kodlamaio.northwind.entities.concretes;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Products")
public class Product{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ProductID")
	private int id; 
	
	//@Column(name="CategoryID")
	//private int categoryId;
	
	@Column(name="ProductName")
	private String productName;
	
	@Column(name="UnitPrice")
	private  double unitPrice;
	
	@Column(name="UnitsInStock")
	private short unitsInStock;
	
	@Column(name="QuantityPerUnit")
	private  String quantityPerUnit;
	
	@ManyToOne
	@JoinColumn(name="categoryId")
	private Category category;
	
}
