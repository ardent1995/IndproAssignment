package se.indpro.indproassignment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import se.indpro.indproassignment.R

class ImageListAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val VIEW_TYPE_ITEM1 = 0
    private val VIEW_TYPE_ITEM2 = 1
    private val VIEW_TYPE_ITEM3 = 2
    private val VIEW_TYPE_ITEM4 = 3

    override fun getItemViewType(position: Int): Int {
        if (position%4 == 0){
            return VIEW_TYPE_ITEM1
        }else if(position%4 == 1){
            return VIEW_TYPE_ITEM2
        }else if(position%4 == 2){
            return VIEW_TYPE_ITEM3
        }else{
            return VIEW_TYPE_ITEM4
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if(viewType == VIEW_TYPE_ITEM1){
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_1,parent,false)
            return ViewHoldaerItem1(view)
        }else if(viewType == VIEW_TYPE_ITEM2){
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_2,parent,false)
            return ViewHoldaerItem2(view)
        }else if(viewType == VIEW_TYPE_ITEM3){
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_3,parent,false)
            return ViewHoldaerItem3(view)
        }else{
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_4,parent,false)
            return ViewHoldaerItem4(view)
        }
    }

    override fun getItemCount(): Int {

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    inner class ViewHoldaerItem1(val itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    inner class ViewHoldaerItem2(val itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    inner class ViewHoldaerItem3(val itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    inner class ViewHoldaerItem4(val itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}