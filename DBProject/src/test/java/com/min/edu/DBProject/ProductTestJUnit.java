package com.min.edu.DBProject;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

import com.min.edu.model.ProductIDUDao;
import com.min.edu.model.ProductIDUDaoImpl;
import com.min.edu.vo.ProductVo;

public class ProductTestJUnit {

	@Test
	public void productRegistration() {
		Scanner scan = new Scanner(System.in);
		ProductIDUDao dao = new ProductIDUDaoImpl();
		ProductVo vo = new ProductVo();
		
		System.out.println("상품이름을 입력해주세요");
		vo.setProduct_name(scan.nextLine());
		System.out.println("상품가격을 입력해주세요");
		vo.setProduct_price(scan.nextInt());
		System.out.println("상품갯수를 입력해주세요");
		vo.setProduct_inventory(scan.nextInt());
		scan.nextLine();
		System.out.println("상품 상세설명을 입력해주세요");
		vo.setProduct_detail(scan.nextLine());
		int row = dao.productRegistration(vo);
		System.out.println("상품이 등록되었습니다");
		assertEquals(row, 1);
	}

//	@Test
	public void showProduct() {
		//리스트를 보여주는 것을 다듬어야함 
		ProductIDUDao dao = new ProductIDUDaoImpl();
		ProductVo vo = new ProductVo();
		List<ProductVo> lists = dao.showProductList();
		
		Iterator<ProductVo> iter = lists.iterator();
		System.out.printf("\t상품이름\t상품가격\t");
		for (ProductVo productVo : lists) {
			System.out.println("상품이름:"+productVo.getProduct_name());
			System.out.println("상품가격:"+productVo.getProduct_price());
			System.out.println("상품상세설명"+productVo.getProduct_detail());
			System.out.println("품절여부:"+productVo.getProduct_sold());
			System.out.println("재고량:"+productVo.getProduct_inventory());	
		}
	}
}
