package ru.mirea.pkmn.strubalin;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonNode;
import ru.mirea.pkmn.Card;
import ru.mirea.pkmn.strubalin.web.http.PkmnHttpClient;

import java.util.stream.Collectors;

public class PokemonApplication {
    static String filename = "my_card.txt";
    public static void main(String[] args) throws Exception {

        CardImport cardimport = new CardImport();
        Card card = new Card();
        card = cardimport.importCard(filename);
        CardExport.Export(card);
        System.out.println(card.toString());

        PkmnHttpClient pkmnHttpClient = new PkmnHttpClient();

        JsonNode card1 = pkmnHttpClient.getPokemonCard("Noibat", "132");
        System.out.println(card1.toPrettyString());
        System.out.println(card1.findValues("attacks")
                .stream()
                .map(JsonNode::toPrettyString)
                .collect(Collectors.toSet()));
        Card cardik = CardImport.deserializeCard(card.getName());
        System.out.printf(cardik.toString());
    }
}