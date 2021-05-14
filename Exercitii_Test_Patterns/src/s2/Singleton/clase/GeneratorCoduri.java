package s2.Singleton.clase;

import java.util.ArrayList;
import java.util.List;

public class GeneratorCoduri {

    private List<Integer> coduri;

    private static GeneratorCoduri instance=null;

    private GeneratorCoduri(){
        coduri=new ArrayList<>();
    }

    public static synchronized GeneratorCoduri getInstance(){
        if(instance==null){
            instance=new GeneratorCoduri();
        }
        return instance;
    }

    public int genereazaCodUnic(){
        coduri.add(coduri.size()+1);
        return coduri.get(coduri.size()-1);

    }

}
