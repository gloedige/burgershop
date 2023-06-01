package de.iav.burgershop.model;

public record Menu(
        String id,
        String name,
        float price,
        String mainDish,
        String sideDish,
        String beverage
)
{
}
