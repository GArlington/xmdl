package org.xmdl.taslak.dao;

import java.util.*;
import org.springframework.dao.DataAccessException;
import org.xmdl.ida.lib.test.BaseDaoTestCase;
import org.xmdl.taslak.model.*;
import org.xmdl.taslak.model.search.*;

/**
 *
 * Product DAO Test Case
 *  
 * $Id$
 */
public class ProductDAOTest extends BaseDaoTestCase {

	private ProductDAO productDAO = null;

	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	public void testAddAndRemoveProduct() throws Exception {
		Product product = new Product();

		product.setName("JcTaP7bbMkXAn c");

		Money price = new Money();
		price.setId(1L);
		product.setPrice(price);
		Money price = new Money();
		price.setAmount(null);
		Money price = new Money();
		price.setId(1L);
		product.setPrice(price);
		price.setCurrency(null);
		Money price = new Money();
		price.setId(1L);
		product.setPrice(price);
		product.setPrice(price);

		product.setProductType(ProductType.INTERMEDIATEPRODUCT);

		product = productDAO.save(product);
		flush();

		product = productDAO.get(product.getId());

		assertNotNull(product.getId());
		assertEquals("JcTaP7bbMkXAn c", product.getName());
		assertEquals(ProductType.INTERMEDIATEPRODUCT, product.getProductType());

		log.debug("removing product...");
		productDAO.remove(product.getId());
		flush();

		try {
			productDAO.get(product.getId());
			fail("Product found in database");
		} catch (DataAccessException dae) {
			log.debug("Expected exception: " + dae.getMessage());
			assertNotNull(dae);
		}
	}

	public void testSearch() throws Exception {
		ProductSearch search = new ProductSearch();
		search.setNameMin("JcTaP7bbMkXAn c");
		search.setNameMax("JcTaP7bbMkXAn c");
		search.setProductTypeMin(ProductType.INTERMEDIATEPRODUCT);
		search.setProductTypeMax(ProductType.INTERMEDIATEPRODUCT);
		Collection<Product> products = productDAO.search(search);
		assertTrue(products.size() > 0);
	}

	protected void onSetUpBeforeTransaction() throws Exception {
		super.onSetUpBeforeTransaction();

		Product product = new Product();

		product.setName("JcTaP7bbMkXAn c");

		Money price = new Money();
		price.setId(1L);
		product.setPrice(price);
		Money price = new Money();
		price.setAmount(null);
		Money price = new Money();
		price.setId(1L);
		product.setPrice(price);
		price.setCurrency(null);
		Money price = new Money();
		price.setId(1L);
		product.setPrice(price);
		product.setPrice(price);

		product.setProductType(ProductType.INTERMEDIATEPRODUCT);

		productDAO.save(product);
	}
}
