package com.testvetic;

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import com.bumptech.glide.Glide

class AnnotatorAdapter(var context: Context, private val mList: Array<ItemsViewModel>) : androidx.recyclerview.widget.RecyclerView.Adapter<AnnotatorAdapter.ViewHolder>() {



    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.activity_row, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        // sets the image to the imageview from our itemHolder class
        //holder.imageView.setImageResource(ItemsViewModel.image)

        Glide.with(context).load(mList[position].image_url).into(holder.imageview);



        // sets the text to the textview from our itemHolder class
        holder.name.text = ""+mList[position].name
        holder.name_info.text = ""+mList[position].sku_name
        holder.size.text = "Size : "+mList[position].size
        holder.sold_by.text = "Sold By "+mList[position].sold_by
        holder.qty.text = "QTY : "+mList[position].qty
        holder.price.text = "Rs : "+mList[position].price+"---Rs 10 OFF"

//
//        holder.imageview?.setOnClickListener(View.OnClickListener {
//
//            val intent = Intent(context, AgentAnnotatorInfoActivity::class.java)
//            intent.putExtra("id",""+ItemsViewModel._id)
//            context.startActivity(intent)
//        })

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(ItemView) {
        val imageview: ImageView = itemView.findViewById(R.id.image)
        val name: TextView = itemView.findViewById(R.id.name)
        val name_info: TextView = itemView.findViewById(R.id.name_info)
        val sold_by: TextView = itemView.findViewById(R.id.sold_by)
        val size: TextView = itemView.findViewById(R.id.size)
        val qty: TextView = itemView.findViewById(R.id.qty)
        val price: TextView = itemView.findViewById(R.id.price)



    }
}
