package lv.semyonmoroshek.intexsystask.ui.products

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import lv.semyonmoroshek.intexsystask.R
import lv.semyonmoroshek.intexsystask.data.model.Element

class ProductsAdapter(
    val openProduct: (categoryUrl: String?) -> Unit,
) : RecyclerView.Adapter<ProductsAdapter.MyViewHolder>() {

    var dataList = emptyList<Element>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.product_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = dataList.getOrNull(position) ?: return
        holder.txtItemTitle.text = item.fullName

        val link = "http://images1.opticsplanet.com/120-90-ffffff/${item.primaryImage}.jpg"
        Log.d("TTTT", "link: $link")

            Picasso.with(holder.itemView.context)
                .load(link)
                .into(holder.img)

//        Glide.with(holder.itemView.context)
//            .load(link)
//            .transition(DrawableTransitionOptions.withCrossFade())
//            .listener(object : RequestListener<Drawable> {
//                override fun onLoadFailed(
//                    e: GlideException?,
//                    model: Any?,
//                    target: Target<Drawable>,
//                    isFirstResource: Boolean
//                ): Boolean {
//
//                    Log.d("TTTT", "onLoadFailed: $e")
//
//                    return false
//                }
//
//                override fun onResourceReady(
//                    resource: Drawable,
//                    model: Any,
//                    target: Target<Drawable>?,
//                    dataSource: DataSource,
//                    isFirstResource: Boolean
//                ): Boolean {
//
//                    return false
//                }
//
//            })
//            .into(holder.img)

        holder.itemView.setOnClickListener {
            openProduct(item.url)
        }

    }


    override fun getItemCount(): Int {
        return dataList.size
    }

    fun setData(memberList: List<Element>) {
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


