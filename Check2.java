//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Check2 {


    public static boolean Check(String a, String b) throws Exception {
        boolean check = true;
        String[] arr1 = a.split("");
        Integer[] arrInt = new Integer[arr1.length];
        String[] arr2 = a.split("");
        Integer[] arr2Int = new Integer[arr1.length];

        int i;
        for(i = 0; i < arr1.length; ++i) {
            arrInt[i] = (Integer)romanConvert2.mapNum.get(arr1[i]);
            if (arrInt[i] == null) {
                check = false;
            }
        }

        for(i = 0; i < arr2.length; ++i) {
            arr2Int[i] = (Integer)romanConvert2.mapNum.get(arr1[i]);
            if (arr2Int[i] == null) {
                check = false;
            }
        }

        if (!arr1[0].equals("-") && !arr2[0].equals("-")) {
            return check;
        } else {
            throw new Exception("т.к. в римской системе нет отрицательных чисел");
        }
    }

    public static boolean Check2(String a, String b) {
        try {
            Integer.parseInt(a);
            Integer.parseInt(b);
            return true;
        } catch (NumberFormatException var3) {
            return false;
        }
    }
}
