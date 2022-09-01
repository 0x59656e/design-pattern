package com.designpattern;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.designpattern.flyweight.Pokemon;
import com.designpattern.flyweight.PokemonFactory;

public class FlyweightTest {
    static final Logger LOGGER = LoggerFactory.getLogger(FlyweightTest.class);

    @Test
    public void objectsShouldSaveMemory() {
        Pokemon pk = PokemonFactory.getPokemon("Lugia", 6);
        Pokemon pk3 = PokemonFactory.getPokemon("Kyogre", 6);
        Pokemon pk2 = PokemonFactory.getPokemon("Lugia", 4);
        LOGGER.info(pk.toString());
        LOGGER.info(pk3.toString());
        LOGGER.info(pk2.toString());
    }
}
