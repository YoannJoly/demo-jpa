package fr.diginamic.tp7;

import com.opencsv.CSVReader;
import fr.diginamic.tp7.bll.ProduitManager;
import fr.diginamic.tp7.bo.ScoreNutritionnel;
import fr.diginamic.tp7.entity.Categorie;
import fr.diginamic.tp7.entity.Marque;
import fr.diginamic.tp7.entity.Produit;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegrationOpenFoodFacts {

    private IntegrationOpenFoodFacts CsvReaderExamples;

    public static void main(String[] args) throws Exception {
        // System.out.println(csvReader());
        // System.out.println(oneByOneExample());
        readDataLineByLine("src/main/java/fr/diginamic/tp7/open-food-facts.csv");
        Categorie categorie = new Categorie("Gateau");
        Marque marque = new Marque("Milka");
        ProduitManager.getInstance().addProduit(new Produit(categorie, marque, ScoreNutritionnel.B, new ArrayList<>(), new ArrayList<>(), new ArrayList<>()));

    }

    public static List<List<String>> csvReader() {
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/fr/diginamic/tp7/open-food-facts.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split("^(?:[^|]*\\|){2}([^|]*)");
                records.add(Arrays.asList(values));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return records;

    }

    public static List<String[]> oneByOne(Reader reader) throws Exception {
        List<String[]> list = new ArrayList<>();
        CSVReader csvReader = new CSVReader(reader);
        String[] line;
        while ((line = csvReader.readNext()) != null) {
            list.add(line);
        }
        reader.close();
        csvReader.close();
        return list;
    }

    public static String oneByOneExample() throws Exception {
        Reader reader = Files.newBufferedReader(Paths.get(ClassLoader.getSystemResource("src/main/java/fr/diginamic/tp7/open-food-facts.csv").toURI()));
        return oneByOne(reader).toString();
    }

    public static void readDataLineByLine(String file) {
        try {
            FileReader filereader = new FileReader(file);
            CSVReader csvReader = new CSVReader(filereader);
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                for (String cell : nextRecord) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
