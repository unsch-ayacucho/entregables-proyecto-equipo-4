package pe.edu.unsch.entities;
// Generated 10/06/2019 02:19:57 PM by Hibernate Tools 5.1.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Colour generated by hbm2java
 */
@Entity
@Table(name = "colour", catalog = "eshopbd")
public class Colour implements java.io.Serializable {

	private Integer idcolour;
	private String name;
	private Set<Product> products = new HashSet<Product>(0);

	public Colour() {
	}

	public Colour(String name, Set<Product> products) {
		this.name = name;
		this.products = products;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idcolour", unique = true, nullable = false)
	public Integer getIdcolour() {
		return this.idcolour;
	}

	public void setIdcolour(Integer idcolour) {
		this.idcolour = idcolour;
	}

	@Column(name = "name", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "colour")
	public Set<Product> getProducts() {
		return this.products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

}
