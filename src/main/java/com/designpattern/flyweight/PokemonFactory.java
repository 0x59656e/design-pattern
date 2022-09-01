package com.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PokemonFactory {
    private static final Map<Integer, Pokemon> ivpokemap = new HashMap<>();

    public static Pokemon getPokemon(String name, Integer iv) {
        Pokemon pk = ivpokemap.get(iv);
        if (!ivpokemap.containsKey(iv)) {
            pk = new Pokemon(name, iv);
            ivpokemap.put(iv, pk);
        }
        return pk;
    }
}
