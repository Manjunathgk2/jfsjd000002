public class nested {
    public static void main(String[] args) {
        char c='Z';
        switch(c)
        {
            case 'R':
                System.out.println("Stop");
                break;
            case 'Y':
                System.out.println("Be Ready");
                break;
            case 'G':
                System.out.println("Go");
                break;
            default:
                System.out.println("Enter valid color");
                break;
        }
    }
}
