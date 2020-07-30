package day23_Arrays;

public class Shopping {
    public static void main(String[] args) {
        String[] soppingList = new String[7];
        soppingList[0] = "Toilet paper";
        soppingList[1] = "Hand sanitazer";
        soppingList[4] = "Eggs";
        soppingList[6] = "Corona";
        soppingList[2] = "Bread";
        soppingList[3] = "Milk";
        soppingList[5] = "Water";
        for (int i = 0; i <= soppingList.length-1; i++){
            System.out.println(soppingList[i]);
        }
    }
}
