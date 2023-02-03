public class Main {
    public static void main(String[] args) {
        {System.out.println("Задача 1-2");}
        int  ClientOs = 0;
        int DeviceYear = 2016;
        if (ClientOs == 0 && DeviceYear <= 2015)
        {System.out.println("Установите версию приложения для iOS по ссылке");}
        else if (ClientOs == 0 && DeviceYear >= 2015)
        {System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
        else if (ClientOs == 1 && DeviceYear <= 2015)
        {System.out.println("Установите версию приложения для Андроид по ссылке");}
        else if (ClientOs == 1 && DeviceYear >= 2015)
        {System.out.println("Установите облегченную версию приложения для Android по ссылке");}
        else
        {System.out.println("Версия не поддерживается");}

        {System.out.println("Задача 3");}



        {System.out.println("Задача 4");}
        int  DeliveryDistance = 95;
        int DeliveryDay = 1;
        if (DeliveryDistance> 0 && DeliveryDistance<= 20)
        {System.out.println("Доставка будет составлять" + DeliveryDay+ " день");}
        else if (DeliveryDistance > 20 && DeliveryDistance<= 40 )
        {System.out.println("Доставка будет составлять" + (DeliveryDay + 1)+ " день");}
        else if (DeliveryDistance > 40 && DeliveryDistance<= 60 )
        {System.out.println("Доставка будет составлять" + (DeliveryDay + 2)+ " дня");}
        else if (DeliveryDistance > 60 && DeliveryDistance<= 100 )
        {System.out.println("Доставка будет составлять" + (DeliveryDay + 3)+ " дня");}
        else
        {System.out.println("Доставка не осуществляется");}

        {System.out.println("Задача 5");}

        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            System.out.println("Зимний");
            break;
            case 2:
            System.out.println("Зимний");
            break;
            case 3:
            System.out.println("Весенний");
            break;
            case 4:
            System.out.println("Весенний");
            break;
            case 5:
            System.out.println("Весенний");
            break;
            case 6:
            System.out.println("Летний");
            break;
            case 7:
                System.out.println("Летний");
              break;
            case 8:
                System.out.println("Летний");
                break;
            case 9:
                System.out.println("Осенний");
                break;
            case 10:
                System.out.println("Осенний");
                break;
            case 11:
                System.out.println("Осенний");
                break;
            case 12:
                System.out.println("Зимний");
                break;
            case 13:
            default:
        }



}
}