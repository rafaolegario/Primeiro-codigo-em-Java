import java.util.Scanner;

public class Main {
    public static void cashPayment(int discountPercent, float ItemPrice, String itemName) {
        float pricePer100 = ItemPrice/100;
        float discount = pricePer100 * discountPercent;
        float FinalPrice = ItemPrice - discount;
        System.out.println("Produto: " + itemName);
        System.out.println("O preço a pagar com "+discountPercent+"% de desconto é: R$ "+ FinalPrice);
    }

    private static void installment(int parcels, float itemPrice, String itemName) {
        double parcel = 0;
        if(parcels == 2){
            parcel = itemPrice/parcels;

        } else{
            parcel = itemPrice/parcels;
            double parcelPer100 = parcel/100;
            double juros = parcelPer100 * 10;
            parcel += juros;

        }
        System.out.println("Produto: " + itemName);
        System.out.println("O preço a pagar por cada parcela é de R$ " + parcel);
    }

    public static void menu(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do item : ");
        String ItemName = scanner.nextLine();

        System.out.println("Digite o preço do item em reais: ");
        float ItemPrice = scanner.nextFloat();

        System.out.println("Escolha a forma de pagamento:" +
                "\n 1- À vista em dinheiro ou pix (15% desconto) " +
                "\n 2- À vista no cartão de crédito (10% desconto)" +
                "\n 3- Parcelado no cartão em 2x sem juros" +
                "\n 4- Parcelado no cartão em 3x (10% juros)" +
                "\n Escolha um numero: ");

        int PayMethod = scanner.nextInt();

        switch (PayMethod){
            case 1 :
                cashPayment(15, ItemPrice, ItemName);
                break;
            case 2:
                cashPayment(10, ItemPrice, ItemName);
                break;
            case 3:
                installment(2,ItemPrice, ItemName);
                break;
            case 4:
                installment(3,ItemPrice, ItemName);
                break;
            default:
                System.out.println("Digite uma opção valida");
                break;
        }
    }



    public static void main(String[] args) {
        menu();

    }
}