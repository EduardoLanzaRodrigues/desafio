public class DesadioDoFilipao {
    public static void main(String[] args) {
        String nomeDoHeroi = "Titan";
        float xp = 5000F;
        if (xp < 1000) {
            System.out.println("O Herói " + nomeDoHeroi + " está no nível " + "Ferro ");
        } else if (xp > 1000 && xp <= 2000) {
            System.out.println("O Herói " + nomeDoHeroi + " está no nível " + "Bronze ");
        } else if (xp > 2000 && xp <= 5000) {
            System.out.println("O Herói " + nomeDoHeroi + " está no nível " + "Prata ");
        } else if (xp > 5000 && xp <= 7000) {
            System.out.println("O Herói " + nomeDoHeroi + " está no nível " + "Ouro ");
        } else if (xp > 7000 && xp <= 8000) {
            System.out.println("O Herói " + nomeDoHeroi + " está no nível " + "Platina ");
        } else if (xp > 8000 && xp <= 9000) {
            System.out.println("O Herói " + nomeDoHeroi + " está no nível " + "Ascendente ");
        } else if (xp >= 9000 && xp <= 10000) {
            System.out.println("O Herói " + nomeDoHeroi + " esta no nível " + "Imortal ");
        } else if (xp >= 10001) {
            System.out.println("O Herói " + nomeDoHeroi + " está nível " + "Radiante ");

        }
    }
}


