package vn.edu.ueh.bit.pipes.core.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import vn.edu.ueh.bit.pipes.core.entities.Product;
import vn.edu.ueh.bit.pipes.core.repository.ProductRepository;

@Service
@RequiredArgsConstructor
public class ProductService extends BaseService<Product> {
    private final ProductRepository productRepository;

    @Override
    protected JpaRepository<Product, Integer> getRepository() {
        return productRepository;
    }

}
