public class len {
    public int solveProblem(String s) {
        // обрезаем пробелы в начале и конце
        int p = s.length() - 1;
        while (p >= 0 && s.charAt(p) == ' ') {
            p--;
        }

        // вычисляем длину последнего слова
        int length = 0;
        while (p >= 0 && s.charAt(p) != ' ') {
            p--;
            length++;
        }
        return length;

    }
}
