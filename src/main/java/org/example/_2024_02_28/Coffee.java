package org.example._2024_02_28;

public enum Coffee {
    Cappuccino (3, "halb Milch"),
LATTE(3, "viel Milch"),
AMERICANO(5, "wenig Milch"),

ESPRESSO (3, "no Milch"),

MACCIATO(4, "mit Choko");


        private final int price;

        private final String message;

    Coffee(int price, String message) {
            this.price = price;
            this.message = message;
        }

        public int getPrice() {
            return price;
        }

        public String getMessage() {
            return message;
        }

    @Override
    public String toString() {
        return "Coffee{" +
                "price=" + price +
                ", message='" + message + '\'' +
                '}';
    }
}
