package com.min.edu.model;

import java.util.List;

import com.min.edu.vo.ProductVo;

public interface ProductIDUDao {
	
	public int productRegistration(ProductVo vo);
	public List<ProductVo> showProductList();

}
