package lab3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problema2 {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/lab3/studenti_in.txt"));
            List<Student> studenti = new ArrayList<>();

            for (String line : lines) {
                if (!line.trim().isEmpty()) {
                    studenti.add(new Student(line));
                }
            }

            Collections.sort(studenti, (s1, s2) -> s1.nume.compareToIgnoreCase(s2.nume));

            List<String> outputLines = new ArrayList<>();
            for (Student s : studenti) {
                System.out.println(s);
                outputLines.add(s.toString());
            }

            Files.write(Paths.get("src/lab3/studenti_out.txt"), outputLines);
            System.out.println("\n=> Sortare finalizata in studenti_out.txt");

        } catch (IOException e) {
            System.out.println("Eroare: " + e.getMessage());
        }
    }
}