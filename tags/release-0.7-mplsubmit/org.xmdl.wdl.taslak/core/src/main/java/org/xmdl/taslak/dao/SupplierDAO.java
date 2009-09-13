package org.xmdl.taslak.dao;

import java.util.*;
import org.xmdl.ida.lib.dao.GenericDao;
import org.xmdl.taslak.model.*;
import org.xmdl.taslak.model.search.*;

/**
 * Supplier DAO interface
 */
public interface SupplierDAO extends GenericDao<Supplier, Long> {

	Collection<Supplier> search(SupplierSearch searchBean);

}
