package de.iav.burgershop.model;

public record Menu(
        String id,
        String name,
        String price,
        String mainDish,
        String sideDish,
        String beverage
)
{
}
