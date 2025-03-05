import "bootstrap/dist/css/bootstrap.min.css";
import React from "react";

class BuyProduct extends React.Component {
    handleSubmit = (e) => {
        e.preventDefault();
    };

    render() {
        return (
            <div className="buy-product-container">
                <form onSubmit={this.handleSubmit}>
                    <div className="mb-3">
                        <label>Email:</label>
                        <input
                            type="text"
                            className="form-control"
                            name="email"
                            placeholder="Email..."
                        />
                    </div>

                    <div className="mb-3">
                        <label>Password:</label>
                        <input
                            type="password"
                            className="form-control"
                            name="password"
                            placeholder="Password..."
                        />
                    </div>

                    <div className="d-grid">
                        <button type="submit" className="btn btn-primary">
                            Login
                        </button>
                    </div>
                    <button type="button" className="btn btn-secondary mt-2" onClick={this.props.onClose}>
                        Đóng
                    </button>
                </form>
            </div>
        );
    }
}

export default BuyProduct;
