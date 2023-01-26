package ro.sda.product_app.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ro.sda.product_app.dto.Product;
import ro.sda.product_app.exception.model.custom_exceptions.AlreadyExistentException;
import ro.sda.product_app.exception.model.custom_exceptions.NotFoundException;
import ro.sda.product_app.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(Product p) {
        Optional<Product> optionalProduct = productRepository.findByName(p.getName());
        if (optionalProduct.isPresent()) {
            throw new AlreadyExistentException();
        }
        productRepository.save(p);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }


    public List<Product> findProductsWithPriceGreaterThan(int price) {

        return productRepository.findAllByPriceGreaterThan(price);
    }

    /*public Product findById(int id) {
        Optional<Product> optionalProduct = productRepository.findById(id);

        if (optionalProduct.isPresent()) {
            return optionalProduct.get();
        } else {
            throw new NotFoundException();
        }
    }*/

    public Product findById(int id){
        return productRepository.findById(id).orElseThrow(() ->  new NotFoundException());
    }
}
