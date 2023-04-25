try {
    int[] intArray = new int[9];
    int d = 1;
    
    if (intArray.length >= 9) {
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } else {
        System.out.println("Array is too small!");
    }
} catch (ArithmeticException e) {
    System.out.println("Catching ArithmeticException: " + e);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Catching ArrayIndexOutOfBoundsException: " + e);
}
