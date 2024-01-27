package lv.semyonmoroshek.intexsystask.ui.products

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import lv.semyonmoroshek.intexsystask.R

class ProductsAdapter(
    val openProduct: (categoryUrl: String?) -> Unit,
) : RecyclerView.Adapter<ProductsAdapter.MyViewHolder>() {

    var dataList = emptyList<ProductElementUI>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.product_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = dataList.getOrNull(position) ?: return
        holder.txtItemTitle.text = item.fullName
        holder.txtPrice.text = item.price.toString()

        Glide.with(holder.itemView.context)
            .load(item.primaryImage)
            .transition(DrawableTransitionOptions.withCrossFade())
            .into(holder.img)

        holder.itemView.setOnClickListener {
            openProduct(item.url)
        }
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    fun setData(memberList: List<ProductElementUI>) {
        val memberDiffUtil = ProductsDiffUtil(dataList, memberList)
        val memberDiffResult = DiffUtil.calculateDiff(memberDiffUtil)

        this.dataList = memberList

        memberDiffResult.dispatchUpdatesTo(this)
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtItemTitle: TextView = itemView.findViewById(R.id.txtItemTitle)
        val txtPrice: TextView = itemView.findViewById(R.id.txtPrice)
        val img: ImageView = itemView.findViewById(R.id.img)
    }
}


