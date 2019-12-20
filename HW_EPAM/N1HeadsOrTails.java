//1) Необходимо написать программу «Heads or Tails?» («Орёл или решка?»),
//        которая бы «подбрасывала» условно монету, к примеру,
//        1000 раз и сообщала, сколько раз выпал орёл, а сколько – решка.


import java.util.Random;

public class N1HeadsOrTails {
    public static void main(String[] args) {
        Random random = new Random();
        int heads = 0;
        int tails = 0;
        for (int i = 0; i <1000 ; i++) {
            if (random.nextInt(2)==0) heads++;
            else tails++;
            }
        System.out.println("heads= "+ heads +"; tails= " + tails);
        }
    }
