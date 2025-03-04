import React from "react";
import ProductCard from "./ProductCard.jsx";
import "../assets/ProductList.css"
import config from "../../config.json"
const {SERVER_API} = config;

class ProductList extends React.Component {
    constructor() {
        super();

        this.state = {
            products:[],
            isLoading: true
        }
    }

    getAllProducts = async () => {
        const response = await fetch(`/products`)

        if (response.ok) {
            const products = await response.json();

            this.setState({
                products: products,
                isLoading: false
            })
        }
    }

    componentDidMount() {
        this.getAllProducts();
    }

    render() {
        const {products, isLoading} = this.state;

        return (
            isLoading ? (
                <h3>Loading . . .</h3>
            ) : (
                <div>
                    <h1>Danh sách sản phẩm</h1>
                    <div className="product-list">
                        {products.map((product) => (
                            <div key={product.id}>
                                <ProductCard product={product}/>
                            </div>
                        ))}
                    </div>
                </div>
            )
        );
    };
}

export default ProductList
