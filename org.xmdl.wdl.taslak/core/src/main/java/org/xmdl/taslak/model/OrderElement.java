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
 * OrderElement entity bean
 */
@Entity(name = "TBL_ORDERELEMENT")
public class OrderElement
		extends
			/*PROTECTED REGION ID(OrderElement.ent.ext) ENABLED START*/BaseObject
/*PROTECTED REGION END*/implements Serializable, Cloneable /*PROTECTED REGION ID(OrderElement.ent.imp) ENABLED START*//*, AnotherInterface *//*PROTECTED REGION END*/{

	/** Unique identifier */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@Column(name = "F_QUANTITY", length = 15)
	private Long quantity;

	@ManyToOne()
	@JoinColumn(name = "F_ORDER", nullable = true)
	private Order order;

	@ManyToOne()
	@JoinColumn(name = "F_PRODUCT", nullable = false)
	private Product product;

	public OrderElement() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String toString() {
		return MessageFormat.format("OrderElement[quantity={0}], ", quantity);
	}

	public boolean equals(Object o) {
		return o instanceof OrderElement
				&& ((OrderElement) o).getId() == this.getId();
	}

	public int hashCode() {
		int result = 1;
		if (id != null)
			result = 31 * result + id.hashCode();
		if (quantity != null)
			result = 31 * result + ("" + quantity).hashCode();
		return result;
	}

	public OrderElement createClone() {
		try {
			return (OrderElement) clone();
		} catch (CloneNotSupportedException e) {
			OrderElement copy = new OrderElement();
			copy.quantity = this.quantity;
			return copy;
		}
	}

	/*PROTECTED REGION ID(OrderElement.ent.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/
}