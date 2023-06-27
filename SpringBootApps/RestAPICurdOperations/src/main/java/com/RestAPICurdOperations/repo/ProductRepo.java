package com.RestAPICurdOperations.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RestAPICurdOperations.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
	
	/*
	 * JPA Repositry consist of following readymade methods
	 * Save() - for saving new records
	 * findAll() - to show all records
	 * findById()- to find row based on primary key
	 * saveAndFlush()- to modify exist records
	 * DeleteById()- to delete a row based on primary key
	 */
	
}
