package com.database;

import java.util.ArrayList;
import java.util.List;

import com.model.Product;

public class ProductDatabase {
List<Product>prodList=new ArrayList<Product>();
    public List<Product> getProduct(){
//	prodList.add(new Product("ProdA","Product A",5,"12/12/2019"));
//	prodList.add(new Product("ProdB","Product B",6,"15/10/2019"));
//	prodList.add(new Product("ProdC","Product C",7,"12/1/2020"));
//	prodList.add(new Product("ProdD","Product D",4,"15/10/2019"));
	return prodList;
}
}