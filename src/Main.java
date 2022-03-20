public class Main {
    public static void main(String[] args) {
        int studentAge = 15;
        double studentGpa = 3.14;
        char firstName = 'M';
        char lastName= 'K';
        boolean hasPerfectAttendance = true;

        String studentName = "Some Name ";

        char studentFirstNameLetter = studentName.charAt(0);

        char studentLastNameLetter = studentName.charAt(5);
        System.out.println(studentFirstNameLetter);
        System.out.println(studentLastNameLetter);

        System.out.println(studentName + " has a gpa of:" + studentGpa);
    }
}
