package lv.semyonmoroshek.intexsystask.ui.products

import androidx.recyclerview.widget.DiffUtil
import lv.semyonmoroshek.intexsystask.data.model.Element

class ProductsDiffUtil(
    private val oldList: List<Element>,
    private val newList: List<Element>
) : DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].id === newList[newItemPosition].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].id == newList[newItemPosition].id
    }

}