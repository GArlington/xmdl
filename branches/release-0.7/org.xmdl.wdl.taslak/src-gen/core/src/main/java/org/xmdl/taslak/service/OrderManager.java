package org.xmdl.taslak.service;

import java.util.Collection;
import org.xmdl.ida.lib.service.GenericManager;
import org.xmdl.taslak.model.*;
import org.xmdl.taslak.model.search.*;

/**
 *
 * Order Service interface
 *  
 * $Id$
 */
public interface OrderManager extends GenericManager<Order, Long> {

	Collection<Order> search(OrderSearch orderSearch);

}