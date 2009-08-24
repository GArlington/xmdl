package org.xmdl.taslak.model;

import javax.persistence.*;
import org.xmdl.ida.lib.model.BaseObject;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.Parameter;
import java.io.Serializable;
import java.text.MessageFormat;
import java.util.*;
import org.xmdl.mesken.model.*;

/**
 * Product entity bean
 */
@Entity(name = "TBL_PRODUCT")
public class Product
		extends
			/*PROTECTED REGION ID(Product.ent.ext) ENABLED START*/BaseObject
/*PROTECTED REGION END*/implements Serializable, Cloneable /*PROTECTED REGION ID(Product.ent.imp) ENABLED START*//*, AnotherInterface *//*PROTECTED REGION END*/{

	/** Unique identifier */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@Column(name = "F_NAME", length = 15)
	private String name;

	@Embedded
	private Money price = new Money();

	@Column(name = "F_PRODUCTTYPE", length = 15, columnDefinition = "integer", nullable = false)
	@Type(type = "org.xmdl.ida.lib.dao.hibernate.GenericEnumUserType", parameters = {
			@Parameter(name = "enumClass", value = "org.xmdl.taslak.model.ProductType"),
			@Parameter(name = "identifierMethod", value = "toInt"),
			@Parameter(name = "valueOfMethod", value = "fromInt")})
	private ProductType productType;

	@OneToMany(cascade = CascadeType.REMOVE, mappedBy = "product")
	private Set<OrderElement> orderElements;

	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "products", targetEntity = Supplier.class)
	private Set<Supplier> suppliers;

	public Product() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Money getPrice() {
		return price;
	}

	public void setPrice(Money price) {
		this.price = price;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public Set<OrderElement> getOrderElements() {
		return orderElements;
	}

	public void setOrderElements(Set<OrderElement> orderElements) {
		this.orderElements = orderElements;
	}

	public Set<Supplier> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(Set<Supplier> suppliers) {
		this.suppliers = suppliers;
	}

	public String toString() {
		return MessageFormat.format("Product[name={0}], [productType={1}], ",
				name, productType);
	}

	public boolean equals(Object o) {
		return o instanceof Product && ((Product) o).getId() == this.getId();
	}

	public int hashCode() {
		int result = 1;
		if (id != null)
			result = 31 * result + id.hashCode();
		if (name != null)
			result = 31 * result + ("" + name).hashCode();
		if (price != null)
			result = 31 * result + price.hashCode();
		if (productType != null)
			result = 31 * result + productType.hashCode();
		return result;
	}

	public Product createClone() {
		try {
			return (Product) clone();
		} catch (CloneNotSupportedException e) {
			Product copy = new Product();
			copy.name = this.name;
			copy.price = this.price;
			copy.productType = this.productType;
			return copy;
		}
	}

	/*PROTECTED REGION ID(Product.ent.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/
}
