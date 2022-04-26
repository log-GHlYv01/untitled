public class Main {
    public static void main(String[] args) {
        // задание 1
        // int clientOS = 0;
        // if (clientOS == 0) {
        //      System.out.println("Install the iOS version of the app by following the link");
        //  } else {
        //       System.out.println("Install the Android version of the app by following the link");
        //   }
        //задание 2

        int clientOS = 1;
        int clientDeviceYear = 2022;
        if (clientOS == 0 && clientDeviceYear >= 2020 || clientDeviceYear < 2015) {
            System.out.println("Install the ois version of the app by following the link");
        } else if (clientOS == 1 && clientDeviceYear >= 2020 || clientDeviceYear < 2015) {
            System.out.println("Install the lite version of the Android app by following the link");
        }

        // 3 задание

        int year = 2022;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Yos");
        } else {
            System.out.println("No");
        }
        // 4 задание
        int deliveryDistance = 20;
        if (deliveryDistance <= 20) {
            System.out.println("delivery will take" + 1);
        } else
        if (deliveryDistance >= 20 && deliveryDistance <= 60) ;
        {
            System.out.println("delivery will take" + 2);
        } else
        if (deliveryDistance >= 60 && deliveryDistance <= 100) ;
        {
            System.out.println("delivery will take" + 3);
        }
        // 4 задание

        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("wintar");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("autumn");
                break;

        }
    }
}