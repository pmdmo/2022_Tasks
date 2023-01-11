package es.iessaladillo.pedrojoya.tasks_app.data.entity

data class Task(
    val id: Long,
    val concept: String,
    val createdAt: String,
    var completed: Boolean,
    val completedAt: String,
    val category: Category
)
