class Praktikum {
    public static void main(String[] args) {

        double moneyBeforeSalary = 150000.0; // Количество денег до зарплаты
        int daysBeforeSalary = 1;

        if (moneyBeforeSalary < 3000) {
            System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
        } else if (moneyBeforeSalary < 10000) {
            if (daysBeforeSalary < 10) {
                System.out.println("Окей, пора в Макдак!");
            } else {
                System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
            }

        } else if (moneyBeforeSalary < 30000) {
            // Допишите условие
            if (daysBeforeSalary < 10) {
                System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место.");
            } else {
                System.out.println("Окей, пора в Макдак!");
            }

        } else {
            if (daysBeforeSalary < 10) {
                System.out.println("Класс! Заказывайте крабов!");
            } else {
                System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место.");
            }
        }
    }
}