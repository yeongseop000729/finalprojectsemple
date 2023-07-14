package com.javalab.board.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.javalab.board.dto.ProductDTO;
import com.javalab.board.entity.Product;

public interface ProductService {
	List<Product> getAllProducts();
	
	List<Product> mainAllProducts();	// 메인페이지 상품리스트 

	Product getProductById(int productId);

	Product saveProduct(Product product, List<MultipartFile> file) throws Exception;

	void deleteProduct(int productId);

	void updateProduct(int productId, Product product);

	public ProductDTO getProductDetail(Integer productNo);

	default ProductDTO entityToDto(Product entity) {
//      String productUpdated = entity.getProductUpdated().toString();

		ProductDTO dto = ProductDTO.builder().productNo(entity.getProductNo()).productName(entity.getProductName())
				.productDescription(entity.getProductDescription()).productPrice(entity.getProductPrice())
//            .productQty(entity.getProductQty())
//            .productUpdated(productUpdated)
				.productImage1(entity.getProductImage1()).productImage2(entity.getProductImage2())
				.productImage3(entity.getProductImage3())
//            .admin(entity.getAdmin())
				.category(entity.getCategory()).basketProducts(entity.getBasketProducts())
				.orderProducts(entity.getOrderProducts()).build();

		return dto;
	}
}