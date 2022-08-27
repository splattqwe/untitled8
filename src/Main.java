public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
// задание 1
//    var salaries = generateRandomArray();
//    int sum=0;
//        for (var salary : salaries) {
//            sum += salary;}
//            System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
// задиние 2
//        var salaries = generateRandomArray();
//        int max = salaries[0];
//        int min = salaries[0];
//
//        for ( var  salary : salaries){
//         if( max> salary){
//             max = salary;}}
//
//         for (var salary: salaries){
//             if (min < salary) {
//                 min = salary;
//             }
//         }
//            System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей",max,min );
//  задание 3
        var salaries = generateRandomArray();
        int sum=0;
        for (var salary : salaries) {
            sum += salary;}
        double result = sum / salaries.length;
        System.out.println("Средняя сумма трат за месяц составила " + result +  " рублей");
//      задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0 ; i--) {
            System.out.print(reverseFullName[i]);


        }
    }


        }

            


