import java.util.ArrayList;

/**
 * Stores and maintains the list of tasks.
 */
public class TaskList {

    private ArrayList<Task> tasks;
    private int size;

    public TaskList() {
        tasks = new ArrayList<Task>();
        size = 0;
    }

    /**
     * Formats the current tasks into a String to be saved into a txt file.
     * @return A String of all the current tasks
     */
    public String tasksToString() {
        String output = "";
        for (int i = 0; i < size; i++) {
            Task t = tasks.get(i);
            output += t.writeToFile() + "\n";
        }
        return output;
    }

    public void addTask(Task t) {
        tasks.add(t);
        size++;
    }

    public void remTask(int index) {
        assert index > 0 : "Invalid index is used.";
        tasks.remove(index);
        size--;
    }

    public void markDone(int index) {
        tasks.get(index).markDone();
    }

    public Task getTask(int index) {
        return tasks.get(index);
    }

    public ArrayList<Task> getTaskList() {
        return tasks;
    }

    public int getSize() {
        return size;
    }
}
