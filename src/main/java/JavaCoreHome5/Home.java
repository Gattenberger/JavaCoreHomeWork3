package JavaCoreHome5;

import java.util.Arrays;

    public class Home {
        public static void main(String[] args) {

            AppData appData = new AppData();
            appData.readFile("fileHome5.txt");

            System.out.println(Arrays.toString(appData.getHeader()));
            System.out.println(Arrays.deepToString(appData.getData()));

            appData.save("fileHome5Result.txt");
        }
    }

