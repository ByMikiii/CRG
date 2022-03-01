package com.company;

public class Ohrada {

    private Zviera ubytovaneZviera;

    public Zviera getUbytovaneZviera() {
        return ubytovaneZviera;
    }

    public void ubytujZviera(Zviera ubytovaneZviera){
        this.ubytovaneZviera = ubytovaneZviera;
    }

    public void odubytujZviera(Zviera ubytovaneZviera){
        this.ubytovaneZviera = null;
    }

    public void vypisInformaciiOOhradke(){
        if(this.ubytovaneZviera == null){
            System.out.println("V ohradke nieje ziadne zviera");
            return;
        }
        System.out.println("V ohradke je zviera s menom : " + this.ubytovaneZviera.getMeno());
        System.out.println("V ohradke je zviera s druhom : " + this.ubytovaneZviera.getDruh());
        System.out.println("V ohradke je zviera s hladom : " + this.ubytovaneZviera.getHlad());



    }
}
