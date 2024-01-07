public class ElementeComune {
    public static void main(String[] args) {
        String[] a = {"java", "test", "university"};
        String[] b = {"car", "university", "plane"};

        System.out.print("Elemente comune: ");
        for (String elementA : a)
            for (String elementB : b)
                if (elementA.equals(elementB))
                    System.out.print(elementA + " ");
    }
}
