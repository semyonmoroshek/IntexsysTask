package lv.semyonmoroshek.intexsystask.ui.products

import androidx.recyclerview.widget.DiffUtil

class ProductsDiffUtil(
    private val oldList: List<ProductElementUI>,
    private val newList: List<ProductElementUI>
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