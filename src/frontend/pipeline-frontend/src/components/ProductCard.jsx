import React, { useState } from "react";
import "../assets/ProductCard.css";
import BuyProduct from "./BuyProduct.jsx";

function ProductCard({ product }) {
    const [isBuying, setIsBuying] = useState(false);

    return (
        <div className={`product-card ${isBuying ? "buy-action" : ""}`}>
            {
            isBuying ? (
                <div>
                    <div>
                        <BuyProduct onClose={() => setIsBuying(false)} />
                    </div>
                </div>
            ) : (
                <div>
                    <h2 className="product-name">{product.name}</h2>
                    <p className="product-price">Giá: ${product.price}</p>
                    <p className="product-stock">Tồn kho: {product.stock}</p>
                    <button className="buy-button" onClick={() => setIsBuying(true)}>
                        Mua ngay
                    </button>
                </div>
            )
            }
        </div>
    );
}

export default ProductCard;
