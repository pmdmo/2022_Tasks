package es.iessaladillo.pedrojoya.tasks_app.ui.addTask

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import es.iessaladillo.pedrojoya.tasks_app.R
import es.iessaladillo.pedrojoya.tasks_app.utils.addMenuProvider

private const val STATE_CATEGORY: String = "STATE_CATEGORY"

class AddTaskActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // TODO...
        setupMenu()
    }

    private fun setupMenu() {
        addMenuProvider(R.menu.add_task_activity) { menuItem ->
            when (menuItem.itemId) {
                R.id.mnuSave -> {
                    // TODO...
                    true
                }
                else -> false
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    // TODO...

}