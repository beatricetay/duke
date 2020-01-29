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

    /**
     * Prints the tasks that contains the String sequence.
     * @param sequence String that the tasks will be searched for.
     */
    public void printTasksContaining(String sequence) {
        for (int i = 1; i <= size; i++) {
            Task task = tasks.get(i - 1);
            if (task.getDetails().contains(sequence)) {
                System.out.println("     " + i + "." + task);
            }
        }
    }

    public void addTask(Task t) {
        tasks.add(t);
        size++;
    }

    public void remTask(int index) {
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

    /**
     * Prints the tasks in the task list.
     */
    public void printTaskList() {
        for (int i = 1; i <= size; i++) {
            String item = "     " + i + "." + tasks.get(i - 1);
            System.out.println(item);
        }
    }

    public int getSize() {
        return size;
    }
}
