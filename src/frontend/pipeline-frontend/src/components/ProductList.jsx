import React from "react";
import ProductCard from "./ProductCard.jsx";
import "../assets/ProductList.css";
import config from "../../config.json";

const { SERVER_API } = config;

class ProductList extends React.Component {
    constructor() {
        super();
        this.state = {
            products: [],
            isLoading: true,
            currentPage: 1,
            productsPerPage: 8
        };
    }

    getAllProducts = async () => {
        const response = await fetch(`/products`);
        if (response.ok) {
            const products = await response.json();
            this.setState({
                products: products,
                isLoading: false
            });
        }
    };

    componentDidMount() {
        this.getAllProducts();
    }

    handlePageChange = (pageNumber) => {
        this.setState({ currentPage: pageNumber });
    };

    render() {
        const { products, isLoading, currentPage, productsPerPage } = this.state;

        // Logic for displaying products per page
        const indexOfLastProduct = currentPage * productsPerPage;
        const indexOfFirstProduct = indexOfLastProduct - productsPerPage;
        const currentProducts = products.slice(indexOfFirstProduct, indexOfLastProduct);
        const totalPages = Math.ceil(products.length / productsPerPage);

        return isLoading ? (
            <h3>Loading . . .</h3>
        ) : (
            <div className='container products'>
                <h1>Danh sách sản phẩm</h1>
                <div className="product-list">
                    {currentProducts.map((product) => (
                        <div key={product.id}>
                            <ProductCard product={product} />
                        </div>
                    ))}
                </div>
                {/* Pagination Controls */}
                <div className="pagination">
                    {[...Array(totalPages).keys()].map(number => (
                        <button
                            key={number + 1}
                            onClick={() => this.handlePageChange(number + 1)}
                            className={currentPage === number + 1 ? 'active' : ''}
                        >
                            {number + 1}
                        </button>
                    ))}
                </div>
            </div>
        );
    }
}

export default ProductList;