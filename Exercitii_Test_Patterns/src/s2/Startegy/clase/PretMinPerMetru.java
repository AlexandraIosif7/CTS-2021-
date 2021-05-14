package s2.Startegy.clase;

import java.util.List;

public class PretMinPerMetru implements CriteriuDecizie{
    @Override
    public Locuinta alege(List<Locuinta> locuintaList) {
        int min=locuintaList.get(0).getPretMinPerMetru();
        Locuinta alegere=new Locuinta(locuintaList.get(0).getLocatie(),locuintaList.get(0).getPretMinPerMetru(),locuintaList.get(0).getPretMinPerCamere());

        for(Locuinta locuinta:locuintaList){
            if(locuinta.getPretMinPerMetru()<min){
                min=locuinta.getPretMinPerMetru();
                alegere.setLocatie(locuinta.getLocatie());
                alegere.setPretMinPerMetru(locuinta.getPretMinPerMetru());
                alegere.setPretMinPerCamere(locuinta.getPretMinPerCamere());
            }
        }
        return alegere;
    }
}
