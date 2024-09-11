import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<GroupLayout.Group> {
    List<GroupLayout.Group> groups;

    public Stream() {
        this.groups = new ArrayList<>();
    }

    public void addGroup(GroupLayout.Group group) {
        this.groups.add(group);
    }

    @Override
    public Iterator<GroupLayout.Group> iterator() {
        return this.groups.iterator();
    }

}