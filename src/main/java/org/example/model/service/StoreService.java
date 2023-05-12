package org.example.model.service;

import org.example.model.Cart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {
    private final Cart cart;
    public  StoreService(Cart cart) {
        this.cart = cart;
    }
    public void addAll(List<Integer> values) {
        cart.addAll(values);
    }
    public List<Integer> getAll() {
        return cart.getAll();
    }
}
