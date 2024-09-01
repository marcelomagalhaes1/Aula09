import java.util.Random;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Random random = new Random();

        int[] numbers = new int[20];
        for (int i = 0; i < 20; i++) {
            numbers[i] = random.nextInt(101); // Números aleatórios de 0 a 100
            bst.insert(numbers[i]);
        }

        System.out.println("Árvore após inserção:");
        System.out.print("Pré-ordem: ");
        bst.printPreOrder();

        System.out.print("In-ordem: ");
        bst.printInOrder();

        System.out.print("Pós-ordem: ");
        bst.printPostOrder();

        System.out.print("Nível: ");
        bst.printLevelOrder();

        for (int i = 0; i < 5; i++) {
            int indexToRemove = random.nextInt(numbers.length);
            int valueToRemove = numbers[indexToRemove];
            bst.delete(valueToRemove);
            System.out.println("Removido: " + valueToRemove);
        }

        System.out.println("Árvore após remoção:");
        System.out.print("Pré-ordem: ");
        bst.printPreOrder();

        System.out.print("In-ordem: ");
        bst.printInOrder();

        System.out.print("Pós-ordem: ");
        bst.printPostOrder();

        System.out.print("Nível: ");
        bst.printLevelOrder();
    }
}
