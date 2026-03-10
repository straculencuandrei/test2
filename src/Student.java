public class Student {
    private int numarMatricol;
    private String nume;
    private String prenume;
    private String formatieDeStudiu;
    public Student(int numarMatricol, String nume, String prenume, String formatieDeStudiu) {
        this.numarMatricol = numarMatricol;
        this.nume = nume;
        this.prenume = prenume;
        this.formatieDeStudiu = formatieDeStudiu;
    }
    @Override
    public String toString() {
        return nume + " " + prenume + '\n' + "Numar matricol" + " : " + numarMatricol + '\n' + formatieDeStudiu;
    }
}
