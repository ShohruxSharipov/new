package uz.itschool.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load

class Adapter(var cards:List<Card>):RecyclerView.Adapter<Adapter.MyHolder>() {

    class MyHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        var name = itemView.findViewById<TextView>(R.id.name)
        var number = itemView.findViewById<TextView>(R.id.number)
        var img = itemView.findViewById<ImageView>(R.id.imageView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        var item = MyHolder(LayoutInflater.from(parent.context).inflate(R.layout.card,parent,false))
        return item
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        var item = cards[position]
        holder.name.text = item.name
        holder.number.text = item.number
        holder.img.setImageResource(item.img)
    }

    override fun getItemCount(): Int {
        return cards.size
    }
}