class Praktikum {
    public static void main(String[] args) {

        double moneyBeforeSalary = 15000.0; // Количество денег до зарплаты

        if (moneyBeforeSalary < 3000) {
            System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
        } else if (moneyBeforeSalary < 10000) {
            System.out.println("Окей, пора в Макдак!");
        } else if (moneyBeforeSalary < 30000) {
            System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место.");
        } else {
            System.out.println("Класс! Заказывайте крабов!");
        }
    }
}
