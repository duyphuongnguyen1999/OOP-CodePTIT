/* Input stream
 * B20DCCN001
 * Nguyễn Văn A
 * 2
 * INT1155
 * Tin học cơ sở 2
 * 2
 * INT1332
 * Lập trình hướng đối tượng
 * 3
 * QD123
 * QD123 HP
 * 550000
*/
import view.InvoiceView;
import vn.edu.ptit.*;
import java.util.Scanner;
import java.util.ArrayList;

public class PaymentController {
    public PaymentController() {}
    
    public Invoice getInvoice() {
        Scanner in = new Scanner(System.in);
        String studentCode = in.nextLine().trim();
        String studentName = in.nextLine().trim();
        Student student = new Student(studentCode, studentName);
        
        int numSubjects = in.nextInt();
        in.nextLine();
        
        ArrayList<Subject> alSubject = new ArrayList<> ();
        int temp = numSubjects;
        int totalCredit = 0;
        while (temp-- > 0) {
            String subjectCode = in.nextLine().trim();
            String subjectName = in.nextLine().trim();
            int subjectCredit = in.nextInt();
            totalCredit += subjectCredit;
            in.nextLine();
            Subject subject = new Subject(subjectName, subjectCode, subjectCredit);
            alSubject.add(subject);
        }
        
        String ruleCode = in.nextLine().trim();
        String ruleName = in.nextLine().trim();
        int creditPrice = in.nextInt();
        
        Rule rule = new Rule(ruleCode, ruleName, creditPrice);
        
        Invoice invoice = new Invoice(rule);
        invoice.setSt(student);
        invoice.setAlSubject(alSubject);    
        invoice.setAmount(totalCredit * creditPrice);
        
        return invoice;
    }
    
    
}
