package lab3;

public class Student {
    String id, prenume, nume, grupa;

    public Student(String linie) {
        String[] date = linie.split(",");
        this.id = date[0].trim();
        this.prenume = date[1].trim();
        this.nume = date[2].trim();
        this.grupa = date[3].trim();
    }

    @Override
    public String toString() {
        return id + ", " + prenume + ", " + nume + ", " + grupa;
    }
}