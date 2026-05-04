public class Main
{
    public static void main(String[] args) {
        User user = new User();
        user.setName("Maks");
        user.setId(1L);
        System.out.println("Id: " + user.getId() + " name: "+ user.getName());
    }
}
