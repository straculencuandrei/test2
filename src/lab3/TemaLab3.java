package lab3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TemaLab3 {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/lab3/studenti_in.txt"));
            List<Student> studenti = new ArrayList<>();

            for (String line : lines) {
                if (!line.trim().isEmpty()) {
                    studenti.add(new Student(line));
                }
            }

            Collections.sort(studenti, (s1, s2) -> {
                int comparaGrupa = s1.grupa.compareTo(s2.grupa);
                if (comparaGrupa == 0) {
                    return s1.nume.compareTo(s2.nume);
                }
                return comparaGrupa;
            });

            List<String> outputLines = new ArrayList<>();
            for (Student s : studenti) {
                outputLines.add(s.toString());
            }

            Files.write(Paths.get("src/lab3/studenti_out_sorted.txt"), outputLines);
            System.out.println("=> Studentii sortati au fost salvati in studenti_out_sorted.txt");

        } catch (IOException e) {
            System.out.println("Eroare: " + e.getMessage());
        }
    }
}