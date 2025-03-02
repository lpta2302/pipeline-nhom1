package vn.edu.ueh.bit.pipes;

import java.io.InputStream;
import java.util.List;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import vn.edu.ueh.bit.pipes.simulate.entity.Area;
import vn.edu.ueh.bit.pipes.simulate.entity.Product;
import vn.edu.ueh.bit.pipes.simulate.service.AreaService;
import vn.edu.ueh.bit.pipes.simulate.service.ProductService;

@RequiredArgsConstructor
@Component
public class AppStartup implements ApplicationRunner {
    private final ProductService productService;
    private final AreaService areaService;
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<Product> products = readProductFromFile();
        productService.createAll(products);
        List<Area> areas = readAreaFromFile();
        areaService.createAll(areas);
        System.out.println("Data has been initialized ");
    }

    private List<Product> readProductFromFile() throws Exception {
        InputStream inputStream = new ClassPathResource("products.json").getInputStream();
        return objectMapper.readValue(inputStream, new TypeReference<List<Product>>() {});
    }

    private List<Area> readAreaFromFile() throws Exception {
        InputStream inputStream = new ClassPathResource("areas.json").getInputStream();
        return objectMapper.readValue(inputStream, new TypeReference<List<Area>>() {});
    }


}
