package com.example.testfragment.data.dao

import android.content.Context
import com.example.testfragment.R
import com.example.testfragment.model.Console
import com.example.testfragment.model.Game
import java.security.AccessControlContext

class GameDataSource {

    //tudo oq esta dentro do companion object é statico não precia instanciar = posso chamar sem precisar instanciar
    companion object {
        fun getGames(context: Context) : ArrayList<Game> {
            var games = ArrayList<Game>()

            games.add(Game(
                1,
                "Fortinite",
                context.getDrawable(R.drawable.fortinite)!!,
                "Bomberman é muito bomm",
                2.5f,
                listOf(
                    Console(1, "Switch", "Sony", "1983-07-30"),
                    Console(2, "SNes", "Nintendo", "1995-05-15"),
                    Console(3, "Playstation 4", "Konami", "1983-07-30"),
                    Console(4, "Xbox One", "Microsoft", "1983-07-30"))))

            games.add(Game(
                2,
                "Mortal Kombat",
                context.getDrawable(R.drawable.mortal_kombat)!!,
                "Mortal Kombat é uma série de jogos criados pelo estúdio de Chicago da Midway Games. Em 2011, depois da falência da Midway, a produção de Mortal Kombat foi adquirida pela Warner Bros, tornando-se em seguida na Netherealm. A Warner detém atualmente os direitos da série.",
                4.5f,
                listOf(
                        Console(1, "Playstation 4", "Sony", "1996-12-01"),
                        Console(2, "SNes", "Nintendo", "1995-05-15")
                )))

            games.add(Game(
                3,
                "Bombermen",
                context.getDrawable(R.drawable.bomberman)!!,
                "Bomberman é muito bomm",
                3.5f,
                listOf(
                    Console(1, "Switch", "Sony", "1983-07-30"),
                    Console(2, "SNes", "Nintendo", "1995-05-15"))))

            games.add(Game(
                4,
                "Bomba Patch",
                context.getDrawable(R.drawable.bombapatch)!!,
                "Super Jogo De Futebol",
                1.0f,
                listOf(
                    Console(1, "Playstation 2", "Sony", "1996-12-01"),
                    Console(2, "SNes", "Nintendo", "1995-05-15")
                )))

            games.add(Game(
                5,
                "Bomba Patch",
                context.getDrawable(R.drawable.god_of_war_ragnarok)!!,
                "Super Jogo De Futebol",
                1.0f,
                listOf(
                    Console(1, "Playstation 2", "Sony", "1996-12-01"),
                    Console(2, "SNes", "Nintendo", "1995-05-15")
                )))


            return games
        }
    }

}