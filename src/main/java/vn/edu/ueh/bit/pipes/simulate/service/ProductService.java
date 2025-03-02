package vn.edu.ueh.bit.pipes.simulate.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import vn.edu.ueh.bit.pipes.simulate.entity.Product;
import vn.edu.ueh.bit.pipes.simulate.repository.ProductRepository;

@Service
@RequiredArgsConstructor
public class ProductService extends BaseService<Product> {
    private final ProductRepository productRepository;

    @Override
    protected JpaRepository<Product, Integer> getRepository() {
        return productRepository;
    }

}
