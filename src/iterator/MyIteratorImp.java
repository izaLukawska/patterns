package iterator;
import java.util.List;

public class MyIteratorImp implements MyIterator{

    private List<User> users;

    private int currentIndex = 0;
    @Override
    public boolean hasNext() {
        return currentIndex < users.size();
    }

    @Override
    public User next() {
        return users.get(currentIndex++);
    }
}
