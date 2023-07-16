package com.example.Cocktails.service;

import com.example.Cocktails.api.model.Cock;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class CockService {

    private List<Cock> cockList;

    public CockService() {
        cockList = new ArrayList<>();

        Cock cock1 = new Cock(1, "Zombie", "Dark rum 45ml, Extra strong rum 30ml, Cinnamon syrup 30ml, Grapefruit juice 45ml, Lime juice 30ml, Grapefruit 60g, Mint 1g, Crushed ice 200g, Ice cubes 1g",
                "Fill the tiki glass to the top with crushed ice Pour into the shaker lime juice 30 ml, grapefruit juice 45 ml, cinnamon syrup 30 ml, dark rum 45 ml and " +
                        "extra strong rum 30 ml Fill the shaker shake Pour through a strainer into a tiki glass");

        Cock cock2 = new Cock(2, "Now You See Me", "Raspberry syrup 20ml, Lemon juice 30ml, Sprite 150ml, Lemon 40g, Lime 10g, Raspberries 15g, Mint 1g, Ice cubes 180g",
                "Put 3 raspberries in a highball and crush them with a muddler\n" +
                        "Add a lemon wedge and fill the highball with ice cubes to the top\n" +
                        "Pour 30 ml of lemon juice and 20 ml of raspberry syrup\n" +
                        "Add sprite to the top and gently stir with a cocktail spoon");

        cockList.addAll(Arrays.asList(cock1, cock2));
    }

    public Optional<Cock> getCock(Integer id) {
        Optional optional = Optional.empty();
        for (Cock cock:cockList) {
            if (id == cock.getId()){
                optional = Optional.of(cock);
                return optional;
            }
        }
        return optional;
    }
}
