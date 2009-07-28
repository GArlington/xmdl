
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
 *
 * Money entity bean
 *  
 * $Id$
 *
 */ 
@Embeddable
public class Money extends BaseObject implements Serializable, Cloneable {

	
	
	@Column(name = "F_AMOUNT", length = 15)
	


	
    private Double amount ;
	
	
    @ManyToOne()
	@JoinColumn(name = ("F_CURRENCY"), nullable = false)
	
    private Currency currency ;
	

    public Money() {
    }

	
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

	
    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

	

    public String toString() {
    	return MessageFormat.format("Money[amount={1}], ", amount );
    }

    public boolean equals(Object o) {
        return (o != null && o instanceof Money);
    }

    public int hashCode() {
        int result = 1;
    
        
            
        if (amount != null) result = 31 * result + ("" + amount).hashCode();
            
        
    
        
    
        return result;
    }

     public Money createClone() {
         try {
             return (Money) clone();
        } catch (CloneNotSupportedException e) {
            Money copy = new Money();
    
        
            copy.amount = this.amount;
        
    
        
    
            return copy;
        }
     }
}
  