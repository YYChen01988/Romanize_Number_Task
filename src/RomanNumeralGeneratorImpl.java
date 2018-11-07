import java.util.TreeMap;

public class RomanNumeralGeneratorImpl implements RomanNumeralGenerator{

    private final static TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
    static {

        treeMap.put(1000, "M");
        treeMap.put(900, "CM");
        treeMap.put(500, "D");
        treeMap.put(400, "CD");
        treeMap.put(100, "C");
        treeMap.put(90, "XC");
        treeMap.put(50, "L");
        treeMap.put(40, "XL");
        treeMap.put(10, "X");
        treeMap.put(9, "IX");
        treeMap.put(5, "V");
        treeMap.put(4, "IV");
        treeMap.put(1, "I");

    }

    public String generate(int number) throws UnsupportedNumberException {
        if (number < 1 || number > 3999)
            throw new UnsupportedNumberException("Number is outside of range.");
        String romanNumeral = "";
        while(number >= 1) {
            int closestTargetValue = treeMap.floorKey(number);
            number -= closestTargetValue;
            romanNumeral += treeMap.get(closestTargetValue);
        }
        return romanNumeral;
    }

}
