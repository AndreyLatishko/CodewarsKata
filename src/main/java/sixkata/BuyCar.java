package sixkata;

public class BuyCar {
    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingPerMonth, double percentLossByMonth) {
        if(startPriceOld >= startPriceNew) return  new int[]{0, startPriceOld - startPriceNew};

        double lossByMonth = percentLossByMonth;
        int countMonths = 0;
        double currentDelta = startPriceOld - startPriceNew;
        double savingsLeft;

        do {
            countMonths++;

            if (countMonths % 2 == 0) {
                lossByMonth += 0.5;
            }

            currentDelta *= (1 - lossByMonth /   100);
            savingsLeft = countMonths * savingPerMonth + currentDelta;

            System.out.println(String.format("End month: %d: percentLoss %.2f available %.3f",
                    countMonths, lossByMonth, savingsLeft));
        } while (savingsLeft < 0);

        return new int[]{countMonths, (int) Math.round(savingsLeft)};
    }

}
