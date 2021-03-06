package tsisyk.app.mycv.ui.info

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import tsisyk.app.mycv.repository.MyCvRepository

@Suppress("UNCHECKED_CAST")
class InfoViewModelFactory(private val myCvRepository: MyCvRepository) :
    ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return InfoViewModel(myCvRepository) as T
    }
}