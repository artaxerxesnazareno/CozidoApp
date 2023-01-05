package com.example.cozidoapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        RecyclerView recyclerView = findViewById(R.id.foodItemList);
        List<FoodItem> foodItemList = new ArrayList<>();

    /*    foodItemList.add(new FoodItem(R.drawable.waffle_sem_ovos, "waffle sem ovos", "30 min", "4 porções", "2.5 g", " - 2 xicara Trigo \n - 2 xicara Bebiba de soja \n - 1/4 xicara açucar mascavo \n - 1 colher de sopa de canela \n - 1 pitada de sal \n - 2 colheres de cafe \n - 4 colheres de sopa de oleo \n - 2 maçãs pequenas", "1 Em um bowl misture os ingredientes secos: a farinha, o açúcar, a canela, o fermento e o sal. Adicione a bebida de soja e o óleo e misture muito bem, de preferência com um fouet para não se formarem grumos.\n " +
                "2 Em seguida descasque e rale ou pique finamente as maçãs e incorpore na massa dos waffles. Assim você consegue preparar um waffle simples sem ovo! \n" +
                "3" +
                "Unte a máquina de waffles e coloque porções da massa para cozinhar." ));
        foodItemList.add(new FoodItem(R.drawable.berinjela_grelhada, "berinjela grelhada", "15 min","3 porções","20 g"," - 1 berinjela\n" +
                " - 1 lata de tomate pelado em cubos\n" +
                " - 1 pimentão vermelho\n" +
                " - 1/2 cebola picada\n" +
                " - 1 dente de alho picado\n" +
                " - 1/4 de xícara (chá) de água\n" +
                " - 1/4 de xícara (chá) de uvas-passas brancas\n" +
                " - 2 colheres (sopa) de azeite\n" +
                " - 1/2 colher (chá) de páprica defumada\n" +
                " - 1 folha de louro\n" +
                " - 1 tira de casca de laranja\n" +
                " - 1/4 de xícara (chá) de amendoim torrado, sem casca e sem sal picado\n" +
                " - sal e pimenta-do-reino a gosto", "1 - " +
                "Lave, descarte as pontas e corte a berinjela em 8 rodelas grossas, de cerca de 2 cm. Transfira para uma tigela, junte 1 colher (sopa) de sal e cubra com água. Misture bem e tampe com um prato fundo assim todas as rodelas ficam imersas. Deixe a berinjela de molho enquanto prepara os outros ingredientes a água com sal ajuda a diminuir o amargor do legume.\n" +
                "2 - " +
                "Descasque e pique fino a cebola e o alho. Lave, descarte as sementes e corte o pimentão em cubinhos.\n" +
                "3 - " +
                "Leve ao fogo médio uma frigideira com borda alta. Quando aquecer, regue com 1 colher (sopa) de azeite e junte a cebola e o pimentão picados. Tempere com uma pitada de sal e refogue por cerca de 4 minutos até murchar bem.\n" +
                "4 - " +
                "Adicione o alho, a folha de louro, a páprica defumada e mexa por 1 minuto apenas para perfumar. Junte o tomate pelado (com o líquido), a água, a casca de laranja e as uvas-passas. Tempere com sal e pimenta-do-reino a gosto e misture bem. Diminua o fogo e deixe cozinhar, em fogo baixo, por cerca de 15 minutos até encorpar mexa de vez em quando para não queimar no fundo.\n" +
                "5 - " +
                "Enquanto o molho cozinha, escorra a água das berinjelas. Coloque as rodelas sobre um pano de prato limpo e seque bem.\n" +
                "6 - " +
                "Leve ao fogo médio uma bistequeira (ou frigideira antiaderente). Quando estiver bem quente, regue com ½ colher (sopa) de azeite e adicione as rodelas de berinjela. Deixe por cerca de 5 minutos até ficar bem dourada. Regue as fatias com mais ½ colher (sopa) de azeite e vire com uma pinça para dourar o outro lado por igual.\n" +
                "7 - " +
                "Transfira as berinjelas douradas para uma travessa. Desligue o fogo e transfira o molho para uma tigela.\n" +
                "8 - " +
                "Para montar os pratos coloque algumas colheradas de cuscuz marroquino, disponha duas fatias de berinjela e cubra com o molho. Salpique com amendoim picado e sirva a seguir.\n" +
                "Neste episódio, Rita Lobo aproveita a estrutura do PF clássico para criar um delicioso cardápio sem carne. No lugar do bife, tem berinjela grelhada com um molho com sabores mediterrâneos, que você aprende a fazer com os ingredientes e o passo a passo, abaixo."));
        foodItemList.add(new FoodItem(R.drawable.guacamole_facil, " guacamole superfácil","10 min","5 porções", "17 g"," - 1 abacate brasileiro médio (ou 4 avocados)\n" +
                " - 1 tomate grande sem sementes\n" +
                " - 1 cebola pequena\n" +
                " - 2 dentes de alho bem socados\n" +
                " - 1 maço de coentro\n" +
                " - 1 pimenta malagueta sem sementes\n" +
                " - suco de 1 limão grande\n" +
                " - azeite extra virgem\n" +
                " - sal","1 - Amasse o abacate com um garfo, acrescente o alho socado, o suco de limão, sal e azeite a gosto e misture como um purê.\n" +
                "\n" +
                "2 - Pique a cebola, o tomate e o coentro. Pique bem a pimenta.\n" +
                "\n" +
                "3 - Acrescente os ingredientes picados ao \"purê\" de abacate.\n" +
                "\n" +
                "4 - Sirva com chips, crackers, tacos, no burrito ou mesmo junto com arroz e feijão."));
        foodItemList.add(new FoodItem(R.drawable.biscoitos_de_grao_de_bico, "biscoitos de grão-de-bico","45 min", "6 porções", "30 g", " - 2 xícaras (chá) de farinha de trigo\n" +
                " - 1 xícara (chá) de açúcar mascavo\n" +
                " - 4 colheres (sopa) de mel\n" +
                " - 1 ovo batido\n" +
                " - 100 g de manteiga\n" +
                " - 3 colheres (chá) de gengibre em pó\n" +
                " - 1 colher (chá) de canela em pó\n" +
                " - 1/2 colher (chá) de noz-moscada em pó\n" +
                " - 1/4 colher (chá) de cravo-da-índia em pó\n" +
                " - 1 colher (chá) de bicarbonato de sódio", "1 - Em uma panela em fogo baixo, coloque o açúcar mascavo, o mel e a manteiga e vá mexendo até se transformar em calda e reserve.\n" +
                "\n" +
                "2 - Em outro recipiente, peneire os ingredientes secos: a farinha de trigo, o bicarbonato de sódio, o gengibre, a canela, a noz-moscada e o cravo-da-índia.\n" +
                "\n" +
                "3 - Nesse recipiente com os ingredientes secos, adicione a calda reservada e o ovo batido, e misture tudo muito bem até obter uma massa lisa e homogênea.\n" +
                "\n" +
                "4 - Envolva a massa em plástico-filme e leve à geladeira por, no mínimo, 12 horas.\n" +
                "\n" +
                "5 - Após esse tempo, com o auxílio de um rolo, abra a massa sobre uma superfície enfarinhada e vá cortando os biscoitos no formato que desejar: vale árvores, bonequinhos, corações, estrelas, redondas ou o que a sua criatividade mandar!\n" +
                "\n" +
                "6 - Em uma assadeira untada com manteiga e polvilhada com farinha, disponha os biscoitos, dando uma certa distância uns dos outros.\n" +
                "\n" +
                "7 - Leve para assar em forno preaquecido a 180º C por cerca de 10 minutos ou até ficarem douradinhos.\n" +
                "\n" +
                "8 - Em seguida, retire do forno e deixe esfriar. Para evitar danificá-los, procure retirá-los já bem frios e com o auxílio de uma espátula, ok?\n" +
                "\n" +
                "9 - E, se você quiser deixar seus biscoitos ainda mais coloridos e divertidos, dá uma olha na receita a seguir!"));
*/
        FoodAdapter adapter = new FoodAdapter(this, foodItemList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }


    /*
    public void clickReceita(View view) {
        String str = String.valueOf(R.id.cityName);
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();

    }*/
}
