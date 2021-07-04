package com.example.cadastrokotlin

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*

var frase = mutableListOf<String>()

@Parcelize
open class Cadastro () : Parcelable {

    //Função que adiciona os novos cadastros à lista que será aplicada no RecyclerView:
    open fun adicionarLista(X: String): MutableList<String> {
        var exibir = mutableListOf<String>()
        frase.add(X)
        Collections.sort(frase)
        for(y in frase) {
            exibir.add(y + "\n" + "\n")
        }
        return exibir
    }

    //Função que realiza a pesquisa de cadastros:
    open fun consultarLista(N: String) : MutableList<String> {
        var exibir = mutableListOf<String>()
        Collections.sort(frase)
        for (y in frase) {
            val nome =
                y.split(" ")
            for (i in nome.indices) {
                if (nome.get(i) == N) {
                    exibir.add(y + "\n" + "\n")
                }
            }
        }
        return exibir
    }

    //Função que exibe toda a lista de cadastros:
    open fun exibirLista() : MutableList<String> {
        var exibir = mutableListOf<String>()
        Collections.sort(frase)
        for(y in frase) {
            exibir.add(y + "\n")
        }
        return exibir
    }

}