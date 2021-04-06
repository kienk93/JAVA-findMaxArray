public class timGiaTriMaxArray {
    public static void main(String[] args) {
        System.out.println("The application finds the largest value in the array.");
        //khai báo size, mảng
        int size;
        int[] array;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        //vòng lặp gán size<20 cho mảng
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        //khai báo mảng con mới từ size
        array = new int[size];
        //vòng lặp gán giá trị cho từng phần tử trong mảng
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + " :");
            array[i] = scanner.nextInt();
            i++;
        }
        //in mảng
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        // gán max cho phần tử đầu, gán max cho phần tử sau nếu lớn hơn
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        // in ra
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}