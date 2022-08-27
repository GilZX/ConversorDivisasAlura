/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gilwa
 */
public class Factor {
    
    private String [][] factoresUsd={{"USDEUR","1.00385"},{"USDGBP","0.847175"},{"USDJPY","136.812"}};
    private String [][] factoresEur={{"EURUSD","0.996040"},{"EURGBP","0.843962"},{"EURJPY","136.269"}};
    private String [][] factoresJpy={{"JPYUSD","0.00730976"},{"JPYGBP","0.00619312"},{"JPYEUR","0.00733703"}};
    private String [][] factoresGBP={{"GBPUSD","1.17896"},{"GBPEUR","1.18409"},{"GBPJPY","161.499"}};
    
    
    public Factor(){
        
       
    }
    
    
    public Double retornarFactor(String clave){
        String prefix=clave.substring(0, 3);
        String sufix=clave.substring(3, 6);
        Double factor=0.0;
        System.out.println("Clave Recibida: " + clave);
        switch(prefix){
            case "USD":
                factor=this.getFactor(factoresUsd,sufix);
            break;
            
            case "EUR":
                factor=this.getFactor(factoresEur,sufix);
            break;
            
            case "JPY":
                factor=this.getFactor(factoresJpy,sufix);
            break;
            case "GBP":
                factor=this.getFactor(factoresGBP,sufix);
            break;
        }
        
        System.out.println("Factor Resultante:" + factor);
        return factor;
       // System.out.println(clave);
        //System.out.println(sufix);
      
    }
    
    
    private  Double getFactor(String [][]factores,String sub){
        System.out.println("Sub: "  + sub);
        double factor=0;
       for(int x=0; x<factores.length;x++){
           System.out.println(factores[x][0].substring(3,6)+"="+sub );
           if(factores[x][0].substring(3,6).equals(sub)){
              System.out.println("Factores:" + factores[x][0]);
              factor=Double.parseDouble(factores[x][1]);
           }
         
       }
        
        return factor;
    }
    
    
    
    
    
    
    
}
