public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, Мир!");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        System.out.println("Общий вес бойцов: " + (boxer1Weight + boxer2Weight));
        System.out.println("Разница весов двух бойцов:" + (boxer2Weight - boxer1Weight));
        System.out.println("Разница весов двух бойцов (1 способ):" + (boxer2Weight - boxer1Weight));
        System.out.println("Разница весов двух бойцов (2 способ):" + (boxer2Weight % boxer1Weight));
        var totalWorkingHours = 640;
        var hoursPerDay = 8;
        var totalEmployees = totalWorkingHours / hoursPerDay;
        System.out.println("Всего работников в компании - " + totalEmployees+" человек");
        totalEmployees = totalEmployees + 94;
        totalWorkingHours = totalEmployees * hoursPerDay;
        System.out.println("Если в компании работает " + totalEmployees + " человека, то всего " + totalWorkingHours + " часа работы может быть поделено между сотрудниками");

    }
}