package Dvd_Pack;

/**
 *
 * @author STEPHEN HOEY
 */
public class DvdStore {

    Dvd[] Movies;
    int count = 0;

    public DvdStore() {
        Movies = new Dvd[6];
    }

    public void add(Dvd s) {
        if (count < Movies.length) {
            Movies[count] = s;
            count++;
        } else {
            Dvd[] arr2 = new Dvd[Movies.length + 10];
            for (int i = 0; i < count; i++) {
                arr2[i] = Movies[i];
            }
            arr2[count] = s;
            count++;
            Movies = arr2;
        }
    }

    public void printAll() {
        for (int i = 0; i < Movies.length; i++) {
            if (Movies[i] != null) {
                System.out.println(Movies[i].toString1());
            }
        }
    }

    public void printRatingGood() {
        System.out.println("Movie's Which are GOOD Rating > 3:");
        System.out.println("");
        for (int i = 0; i < Movies.length; i++) {
            if (Movies[i].getRating() >= 3) {        
                System.out.println(Movies[i].toString());
            }
        }
    }
    
    public void printRatingBad() {
        System.out.println("Movie's Which are BAD Rating < 3:");
        System.out.println("");
        for (int i = 0; i < Movies.length; i++) {
            if (Movies[i].getRating() < 3) {        
                System.out.println(Movies[i].toString());
            }
        }
    }

    public void partition() {
        int i = 0;
        int j = Movies.length - 1;
        int pivot = 3;
        while (i <= j) {
            while (i < Movies.length && Movies[i].getRating() < pivot) {
                i++;
            }
            while (j >= 0 && Movies[j].getRating() > pivot) {
                j--;
            }
            if (i <= j) {
                Dvd tmp = Movies[i];
                Movies[i] = Movies[j];
                Movies[j] = tmp;
                i++;
                j--;
            }
        }
    }

    public static void main(String[] args) {

        DvdStore DvdS = new DvdStore();

        Dvd D1 = new Dvd(5, "Batman", "Dvd", 4);
        Dvd D2 = new Dvd(3, "Hunt", "Blu-Ray", 1);
        Dvd D3 = new Dvd(1, "Crow", "Dvd", 3);
        Dvd D4 = new Dvd(2, "Killer", "Dvd", 2);
        Dvd D5 = new Dvd(4, "Blood", "Blu-Ray", 5);
        Dvd D6 = new Dvd(6, "Rain", "Dvd", 4);

        DvdS.add(D1);
        DvdS.add(D2);
        DvdS.add(D3);
        DvdS.add(D4);
        DvdS.add(D5);
        DvdS.add(D6);

        System.out.println("Array Partitioned by Rating:");
        DvdS.partition();
        DvdS.printAll();
        System.out.println("");
        
        DvdS.printRatingGood();
        DvdS.printRatingBad();
    }
}
