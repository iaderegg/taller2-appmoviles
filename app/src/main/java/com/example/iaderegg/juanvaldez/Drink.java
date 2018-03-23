package com.example.iaderegg.juanvaldez;

/**
 * Created by iaderegg on 13/03/18.
 */

public class Drink {
    private String name, description;
    private int imageId;

    public static final Drink[] drinks;

    static {
        drinks = new Drink[]{new Drink("Late", "Deliciosa bebida de leche caliente con expreso de grano recién molido.", R.drawable.cafe2),
                new Drink("Capuccino", "Expreso de grano recién molido con espuma de crema de leche y especias a su gusto", R.drawable.cafe1),
                new Drink("Filtrado", "Expreso de grano recién molido,", R.drawable.cafe3)};
    }

    public Drink(String name, String description, int imageId){
        this.name = name;
        this.description = description;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageId() {
        return imageId;
    }

    public String toString(){
        return name;
    }
}
