package tacos.web;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import tacos.Ingredient;
import tacos.Ingredient.Type;

import java.util.HashMap;
import java.util.Map;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    private Map<String, Ingredient> ingredientMap = new HashMap<>();

    public IngredientByIdConverter() {
        ingredientMap.put("FLTO", new Ingredient("FLTO", "Flour Tortilla", Type.WRAP));
        ingredientMap.put("COTO", new Ingredient("COTO", "Corn Tortilla", Type.WRAP));
        ingredientMap.put("FLTO", new Ingredient("GRBF", "Ground Beef", Type.PROTEIN));
        ingredientMap.put("FLTO", new Ingredient("CARN", "Carnitas", Type.PROTEIN));
        ingredientMap.put("FLTO", new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES));
        ingredientMap.put("FLTO", new Ingredient("LETC", "Lettuce", Type.VEGGIES));
        ingredientMap.put("FLTO", new Ingredient("CHED", "Cheddar", Type.CHEESE));
        ingredientMap.put("FLTO", new Ingredient("JACK", "Monterrey Jack", Type.CHEESE));
        ingredientMap.put("FLTO", new Ingredient("SLSA", "Salsa", Type.SAUCE));
        ingredientMap.put("FLTO", new Ingredient("SRCR", "Sour Cream", Type.SAUCE));
    }

    @Override
    public Ingredient convert(String id) {
        return ingredientMap.get(id);
    }
}
