package es.iessaladillo.pedrojoya.tasks_app.data

import android.annotation.SuppressLint
import es.iessaladillo.pedrojoya.tasks_app.data.entity.Category
import es.iessaladillo.pedrojoya.tasks_app.data.entity.Task
import java.text.SimpleDateFormat
import java.util.*

object Database : DataSource {

    @SuppressLint("ConstantLocale")
    private val simpleDateFormat: SimpleDateFormat =
        SimpleDateFormat("dd/MM/yyyy, HH:mm:ss", Locale.US)

    // Se usa para dar un id único a cada tarea.
    private var idSequence: Long = 0

    override fun queryAllTasks(): List<Task> {
        TODO("Not yet implemented")
    }

    override fun queryCompletedTasks(): List<Task> {
        TODO("Not yet implemented")
    }

    override fun queryPendingTasks(): List<Task> {
        TODO("Not yet implemented")
    }

    override fun addTask(concept: String, category: Category) {
        TODO("Not yet implemented")
    }

    override fun insertTask(task: Task) {
        TODO("Not yet implemented")
    }

    override fun deleteTask(taskId: Long) {
        TODO("Not yet implemented")
    }

    override fun deleteTasks(taskIdList: List<Long>) {
        TODO("Not yet implemented")
    }

    override fun markTaskAsCompleted(taskId: Long) {
        TODO("Not yet implemented")
    }

    override fun markTasksAsCompleted(taskIdList: List<Long>) {
        TODO("Not yet implemented")
    }

    override fun markTaskAsPending(taskId: Long) {
        TODO("Not yet implemented")
    }

    override fun markTasksAsPending(taskIdList: List<Long>) {
        TODO("Not yet implemented")
    }

}
