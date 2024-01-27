package lv.semyonmoroshek.intexsystask.ui.categoryList

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import lv.semyonmoroshek.intexsystask.R
import lv.semyonmoroshek.intexsystask.data.model.CategoryItem

class CategoriesAdapter(
    val openCategory: (categoryUrl: String?) -> Unit,
) : RecyclerView.Adapter<CategoriesAdapter.MyViewHolder>() {

    var dataList = emptyList<CategoryItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.category_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = dataList.getOrNull(position) ?: return
        holder.txtItemTitle.text = item.shortName

        holder.itemView.setOnClickListener {
            openCategory(item.url)
        }
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    fun setData(memberList: List<CategoryItem>) {
        val memberDiffUtil = CategoriesDiffUtil(dataList, memberList)
        val memberDiffResult = DiffUtil.calculateDiff(memberDiffUtil)

        this.dataList = memberList

        memberDiffResult.dispatchUpdatesTo(this)
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtItemTitle: TextView = itemView.findViewById(R.id.txtItemTitle)
    }
}


