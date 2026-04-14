import io.mockk.every
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import io.mockk.mockk

class TaskManagerTest {

    private lateinit var taskManager: TaskManager

    @BeforeEach
    fun setUp() {
        taskManager = TaskManager()
    }

    @Test
    fun addTask_withMockTask_succeeds() {
        val task = mockk<Task>()  //  Mock-Objekt erzeugen
        every { task.id } returns "123"
        every { task.title } returns "Mock Task"
        every { task.description } returns "Mock Description"
        every { task.status } returns "Offen"

        assertTrue(taskManager.addTask(task))
    }

    @Test
    fun addTask_successfullyAddsTask() {
        val task = Task("1", "Test Task", "Description", "Offen")
        assertTrue(taskManager.addTask(task))
    }

    @Test
    fun addTask_failsToAddExistingTask() {
        val task = Task("1", "Test Task", "Description", "Offen")
        taskManager.addTask(task)
        assertFalse(taskManager.addTask(task))
    }

    @Test
    fun removeTask_successfullyRemovesTask() {
        val task = Task("1", "Test Task", "Description", "Offen")
        taskManager.addTask(task)
        assertTrue(taskManager.removeTask("1"))
    }

    @Test
    fun removeTask_failsToRemoveNonexistentTask() {
        assertFalse(taskManager.removeTask("nonexistent"))
    }

    @Test
    fun updateTask_successfullyUpdatesTask() {
        val task = Task("1", "Test Task", "Description", "Offen")
        taskManager.addTask(task)
        val updatedTask = Task("1", "Updated Test Task", "Updated Description", "Erledigt")
        assertTrue(taskManager.updateTask(updatedTask))
    }

    @Test
    fun updateTask_failsToUpdateNonexistentTask() {
        val task = Task("nonexistent", "Test Task", "Description", "Offen")
        assertFalse(taskManager.updateTask(task))
    }
}
