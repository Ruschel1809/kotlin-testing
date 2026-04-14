class TaskManager {
    private val tasks = mutableListOf<Task>()
    fun addTask(task: Task): Boolean {
        if (tasks.any { it.id == task.id }) {
            return false
        }
        tasks.add(task)
        return true
    }
    fun removeTask(taskId: String): Boolean {
        return tasks.removeIf { it.id == taskId }
    }
    fun updateTask(updatedTask: Task): Boolean {
        val taskIndex = tasks.indexOfFirst { it.id == updatedTask.id }
        if (taskIndex != -1) {
            tasks[taskIndex] = updatedTask
            return true
        }
        return false
    }
}