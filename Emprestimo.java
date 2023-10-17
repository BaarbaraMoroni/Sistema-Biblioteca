package bilbioteca;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Emprestimo {

  Date dataEmprestimo = new Date();

  public Date getDataEmprestimo() {
    return dataEmprestimo;
  }

  public void setDataEmprestimo(Date dataEmprestimo) {
    this.dataEmprestimo = dataEmprestimo;
  }

        Date dataPrevista = new Date();
  Date data_aux = new Date();
  String nome;

  List<Item> i = new ArrayList<Item>();

       
  public Date CalculaDataDevolucao()
  {   
    Date date = new Date();
   
                Calendar calendar = Calendar.getInstance();

                for(int j=0; j<i.size();j++){

                    if(j==0){
                        dataPrevista = i.get(j).calculaDataDevolucao(date);
                    }
                    else{
                        data_aux = i.get(j).calculaDataDevolucao(date);
                    }

                    if(data_aux.after(dataPrevista)){
                        dataPrevista=data_aux;
                        calendar.setTime(dataPrevista);
                    }
                    else{
                        calendar.setTime(dataPrevista);
                    }
                }
                dataPrevista=calendar.getTime();


    return dataPrevista;
  }

}
