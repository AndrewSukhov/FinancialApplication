class Praktikum {
    public static void main(String[] args) {

        double rubles = 14560.5;
        double rateUSD = 78.5;
        double rateEUR = 85.5;
        double rateJPY = 0.74; // Курс японской иены

        String currency = "DKK";
        System.out.println("Вы конвертируете рубли в " + currency);

        if (currency.equals("USD")) {
            System.out.println("Ваши сбережения в долларах: " + rubles / rateUSD);
        } else if (currency.equals("EUR")) {
            System.out.println("Ваши сбережения в евро: " + rubles / rateEUR);
        } else if (currency.equals("JPY")) {
            System.out.println("Ваши сбережения в иенах: " + rubles / rateJPY);
        } else {
            System.out.println("Валюта не поддерживается.");
        }
    }
}