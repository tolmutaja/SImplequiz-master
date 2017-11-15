package com.example.opilane.simplequiz;


public class Questions {
    public String MyQuestions[] = {
        "Kas inimene näeb nähtamatut nõela",
        "Mitu sõrme on iminesel",
        "Plaju on 9+9-9*9/9?",
        "Mis asi on h2o?",
        "Mitu küsimust mul vastatud on",
        "Kummale poole puhub elektrirongi suits, kui tuul on põhjast",
        "Palju küsimusi pidi selles ülessades olema?",
        "Palju on 2+2",
        "Mis värvi on hall hobune",
        "Palju tunni lõuni aega on?"

    };

    public String MyChoices [] [] ={
            {"Jah","Ei","Ei tea","Võibolla"},
            {"3","7","10","11"},
            {"17","1","81","9"},
            {"vesinik","osoon","vesi","õhk"},
            {"4","5","2","7"},
            {"Läände","Elektrirongid ei lase sutisu välja","Põhja","Lõunasse"},
            {"15","0","2","10"},
            {"2","0","8","4"},
            {"pruun","roheline","hall","sinine"},
            {"Tund ei saagi läbi","Varsti on läbi","Liiga palju aega","10min"}

    };

    public String MyCorrectAnswers [] = {
            "Ei","10","9","vesi","4","Elektrirongid ei lase sutisu välja","10","4","hall","Tund ei saagi läbi"
    };

    public int getLength() {return MyQuestions.length;}

    public String getQuestions(int a) {
        String question = MyQuestions[a];
        return question;
    }

    public String getChoice(int index, int num){
        String choice0=MyChoices[index][num -1];
        return choice0;
    }

    public String getCorrectAnswer (int a){
        String answer = MyCorrectAnswers[a];
        return answer;
    }


}
