package com.example.demo.entities;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "excursion_cart_items")
public class ExcursionCartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_item_id")
    private int cartItemId;

    @NotNull(message = "Excursion ID cannot be null")
    @Column(name = "excursion_id")
    private int excursionId;


}