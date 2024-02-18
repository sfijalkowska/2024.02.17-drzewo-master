package pl.camp.it.tree;

import java.util.Objects;

public class App {
    public static void main(String[] args) {
        Integer[] tree = new Integer[15];
        tree[0] = 1;
        tree[1] = 2;
        tree[2] = 2;
        tree[3] = 3;
        tree[4] = null;
        tree[5] = null;
        tree[6] = 3;
        tree[7] = 4;
        tree[8] = 5;
        tree[9] = null;
        tree[10] = 7;
        tree[11] = 7;
        tree[12] = null;
        tree[13] = 5;
        tree[14] = 4;

        boolean result = arrayChallenge(tree);
        if (result) {
            System.out.println("Drzewo symetryczne !!");
        } else {
            System.out.println("Niesymetryczne !!");
        }
    }

    public static boolean arrayChallenge(Integer[] tab) {
        int layer = 0;
        while(true) {
            int layerStartIndex = calculateStartIndexForLayer(layer);
            if(layerStartIndex == tab.length) {
                break;
            }
            System.out.println("Warstwa: " + layer);
            System.out.println("Elementów w warstwie: " + Math.pow(2, layer));

            for(int i = layerStartIndex, j = layerStartIndex*2; i < j; i++, j--) {
                if(!Objects.equals(tab[i], tab[j])) {
                    return false;
                }
            }
            layer++;
        }

        return true;
    }

    public static int calculateStartIndexForLayer(int layer) {
        if(layer == 0) {
            return 0;
        }
        if(layer == 1) {
            return 1;
        }
        return (calculateStartIndexForLayer(layer - 1) * 2) + 1;
    }
}
