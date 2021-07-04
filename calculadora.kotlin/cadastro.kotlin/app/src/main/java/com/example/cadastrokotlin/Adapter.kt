package com.example.cadastrokotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//Classe necessária para implementação do RecyclerView, o qual é responsável por "empilhar" os registros de anúncios em caixas próprias na página inicial (correspondente ao "activity_main" e "MainActivity"):
class CadastrosAdapter(val context: Context, var dataSet : MutableList<String>) : RecyclerView.Adapter<CadastrosAdapter.ContatosViewHolder>() {

    class ContatosViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var texto = view.findViewById<TextView>(R.id.itemNome)
        var excluir = view.findViewById<ImageButton>(R.id.btnExcluir)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContatosViewHolder {
        val instanciaView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cadastro, parent, false)
        return ContatosViewHolder(instanciaView)
    }

    override fun onBindViewHolder(holder: ContatosViewHolder, position: Int) {
        holder.texto.text = dataSet[position]
        holder.excluir.setOnClickListener {
            frase.removeAt(position)
            dataSet = frase
            notifyDataSetChanged()
        }
    }

    override fun getItemCount(): Int = dataSet.size

    fun atualizarLista(listaFiltrada: MutableList<String>){
        dataSet = listaFiltrada
        notifyDataSetChanged()
    }

}