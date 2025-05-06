package Workshop.src.Questão2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Object> animalTree = new HashMap<>();

        animalTree.put("vertebrado",Map.of(
                "ave", Map.of(
                        "carnívoro", "aguia",
                        "onívoro", "pomba"
                ),
                        "mamífero", Map.of(
                                "onívoro","homem",
                                "herbívoro","vaca"
                        )
        ));

        animalTree.put("invertebrado",Map.of(
            "inseto", Map.of(
                    "hematofago", "pulga",
                        "herbívoro", "lagarta"
                        ),
                "anelideo", Map.of(
                        "hematofago", "sanguessuga",
                        "onívoro", "minhoca"
                )

        ));

        System.out.println("Digite o tipo do animal");
        String tipo = scanner.nextLine();
        System.out.println("Digite o subtipo do animal");
        String subtipo = scanner.nextLine();
        System.out.println("Digite o tipo de alimentação do animal");
        String alimentacao = scanner.nextLine();

        try {
            // Corrigido: casting adequado
            Map<String, Map<String, String>> tipoMap = (Map<String, Map<String, String>>) animalTree.get(tipo);
            Map<String, String> subtipoMap = tipoMap.get(subtipo);
            String resultado = subtipoMap.get(alimentacao);
            System.out.println(resultado);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
