package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

import java.util.HashMap;
import java.util.Map;

public class CheckoutSolution {
    public Integer checkout(String skus) {

        if (skus == null) return -1;
        if (skus.equals("")) return 0;


        final String[] skuCodes = skus.split("");
        final Map<String, Integer> skuMap = new HashMap<String, Integer>();
        for (String key : skuCodes) {
            if (skuMap.containsKey(key)) {
                skuMap.put(key, skuMap.get(key) + 1);
            }
            else {
                skuMap.put(key, 1);
            }
        }

        System.out.println(skuMap);

        int totalValue = 0;

        for (Map.Entry<String,Integer> entry : skuMap.entrySet())  {

            if (totalValue == -1) break;

            switch (entry.getKey()) {
                case "D":
                    totalValue+=entry.getValue() * 15;
                    break;
                case "C":
                    totalValue+=entry.getValue() * 20;
                    break;
                case "B":
                    totalValue+=(int) Math.floor( entry.getValue() / 2 * 45 + entry.getValue() % 2 * 30);
                    break;
                case "A":
                    totalValue+=(int) Math.floor( entry.getValue() / 3 * 130 + entry.getValue() % 3 * 50);
                    break;

                default:
                    totalValue = -1;
                    break;
            }
            System.out.println("entry.getKey() : " + entry.getKey() + " --> totalValue: " + totalValue);
        }


        return totalValue;
    }
}
