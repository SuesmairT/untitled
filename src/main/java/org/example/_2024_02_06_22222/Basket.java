package main.java.org.example._2024_02_06_22222;

public class Basket {
    private Item[] selectedItems;

    public Basket(Item[] selectedItems) {
        this.selectedItems = selectedItems;
    }

    public Item[] getSelectedItems() {
        return selectedItems;
    }

    public void setSelectedItems(Item[] selectedItems) {
        this.selectedItems = selectedItems;
    }
}
