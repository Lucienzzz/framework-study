import com.zzq.Book;
import com.zzq.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testadd {
    @Test
    public void go() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.setBauthor("吴承恩");
        book.setBname("西游记");
        System.out.println(book.getBauthor());
        System.out.println(book.getBname());
    }
}
