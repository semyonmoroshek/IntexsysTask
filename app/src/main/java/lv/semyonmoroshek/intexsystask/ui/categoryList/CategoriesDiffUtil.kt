package lv.semyonmoroshek.intexsystask.ui.categoryList

import androidx.recyclerview.widget.DiffUtil

class CategoriesDiffUtil(
    private val oldList: List<CategoryItemUI>,
    private val newList: List<CategoryItemUI>
) : DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].categoryId === newList[newItemPosition].categoryId
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].categoryId == newList[newItemPosition].categoryId
    }

}