package kr.aifor.lyr.knu_finalproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(val layout: View) : RecyclerView.ViewHolder(layout) {
    val Menu_name: TextView = layout.findViewById(R.id.rec_menu_name)
    val Menu_IMG: ImageView = layout.findViewById(R.id.rec_menu_img)
    val Menu_price:TextView = layout.findViewById(R.id.rec_menu_price)
}
class MenuAdapter(var list: ArrayList<Menu>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder{
        var view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_menu, parent, false)

        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val Menu = list[position]
        val MenuViewHolder = holder as MyViewHolder

        MenuViewHolder.Menu_name.text = Menu.name
        MenuViewHolder.Menu_price.text = Menu.price
    }

    override fun getItemCount(): Int {
        return list.size
    }
}