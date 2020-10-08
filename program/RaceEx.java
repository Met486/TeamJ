import java.io.*;

class RaceEx {
    public static void main(String[] args) throws IOException {
        int course;
        Car car = new Car();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long start_time = System.currentTimeMillis();
        while (car.getmileage() <= 19) {
            course = (int) Math.floor(Math.random() * 100) % 2;
            if (car.getfuel() <= 2) {
                course = 2;
            }
            switch (course) {
                case 1:
                    System.out.println("進路：前\n");
                    break;
                case 0:
                    System.out.println("進路：旋回\n");
                    break;
                default:
                    System.out.println("給油してください\n");
                    break;
            }

            while (true) {

                int f = 1;
                System.out.println("入力:");
                String input = br.readLine();
                switch (input) {
                    case "w":
                        System.out.println("前");
                        if (course == 1) {
                            car.goForward();
                            f = 0;
                        }
                        break;
                    case "a":
                    case "d":
                        System.out.println("旋回");
                        if (course == 0) {
                            car.turn();
                            f = 0;
                        }
                        break;
                    case "f":
                        System.out.println("給油");
                        if (course == 2) {
                            car.refuel();
                            f = 0;
                        }
                        break;
                    default:
                        break;
                }
                if (f == 0) {
                    break;
                }
            }
        }
        long time = System.currentTimeMillis() - start_time;
        System.out.println(time + "ms");
    }

}
