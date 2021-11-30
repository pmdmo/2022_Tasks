package es.iessaladillo.pedrojoya.tasks_app.ui.tasks

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import es.iessaladillo.pedrojoya.tasks_app.R
import es.iessaladillo.pedrojoya.tasks_app.utils.addMenuProvider

class TasksActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // TODO
        setupMenu()
    }

    private fun setupMenu() {
        addMenuProvider(R.menu.tasks_activity) { menuItem ->
            when (menuItem.itemId) {
                R.id.mnuFilter -> {
                    // TODO...
                    true
                }
                R.id.mnuAdd -> {
                    // TODO...
                    true
                }
                R.id.mnuDelete -> {
                    // TODO...
                    true
                }
                R.id.mnuComplete -> {
                    // TODO...
                    true
                }
                R.id.mnuPending -> {
                    // TODO...
                    true
                }
                else -> false
            }
        }
    }

    // TODO...

}

