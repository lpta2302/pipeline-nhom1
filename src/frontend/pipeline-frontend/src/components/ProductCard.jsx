import React from "react";
import "../assets/ProductCard.css";

function ProductCard({ product }) {
    return (
        <div className="product-card">
            <h2 className="product-name">{product.name}</h2>
            <p className="product-price">Giá: ${product.price}</p>
            <p className="product-stock">Tồn kho: {product.stock}</p>
            <button className="buy-button">Mua ngay</button>
        </div>
    );
}

export default ProductCard;
