import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
                Scanner scanner = new Scanner(System.in);
                try {
                    System.out.println("Enter a string to build Huffman Tree:");
                    String input = scanner.nextLine();

                    // Create a HuffmanCoder instance based on the input
                    HuffmanCoder huffmanCoder = new HuffmanCoder(input);

                    while (true) {
                        System.out.println("\nWhat would you like to do?");
                        System.out.println("1. Encode a string");
                        System.out.println("2. Decode a string");
                        System.out.println("3. Exit");
                        System.out.print("Enter your choice (1/2/3): ");

                        int choice = scanner.nextInt();
                        scanner.nextLine();  // consume the newline

                        if (choice == 1) {
                            System.out.print("Enter the string to encode: ");
                            String toEncode = scanner.nextLine();
                            String encoded = huffmanCoder.encode(toEncode);
                            System.out.println("Encoded String: " + encoded);

                        } else if (choice == 2) {
                            System.out.print("Enter the string to decode: ");
                            String toDecode = scanner.nextLine();
                            String decoded = huffmanCoder.decode(toDecode);
                            System.out.println("Decoded String: " + decoded);

                        } else if (choice == 3) {
                            System.out.println("Exiting program.");
                            break;

                        } else {
                            System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                        }
                    }

                } catch (Exception e) {
                    System.out.println("An error occurred: " + e.getMessage());
                } finally {
                    scanner.close();
                }
            }
        }



//            System.out.println("Enter your text to encode :");
//             String input = sc.nextLine();
//          try {
//              HuffmanCoder huffmanCoder = new HuffmanCoder(input);
//
//              String encoded = huffmanCoder.encode(input);
//              System.out.println("Encoded Text : " + encoded);
//
//              String decoded = huffmanCoder.decode(encoded);
//              System.out.println("Decoded text : " + decoded);
//          }catch (Exception e){
//              System.out.println("An error Occured " + e.getMessage());
//          }
//        }
//    }

