package com.darekzon.shoppinglist.repository;

import java.util.List;

import com.darekzon.shoppinglist.model.Product;
import com.darekzon.shoppinglist.model.ProductsList;

public interface ProductListRepository {
	void create(String email);
	void addProduct(ProductsList pr,Product p);
	void delete(ProductsList pr);
	void deleteProduct(ProductsList pr, Product p);
	List<Product> list();
}