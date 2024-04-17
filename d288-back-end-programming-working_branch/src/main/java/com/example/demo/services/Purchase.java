package com.example.demo.services;

import com.example.demo.entities.Cart;
import com.example.demo.entities.CartItem;
import com.example.demo.entities.Customer;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Purchase {
    @NotNull(message = "Customer cannot be null")
    private Customer customer;
    private Cart cart;
    private Set<CartItem> cartItems;
}
