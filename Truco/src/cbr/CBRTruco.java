/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbr;

import jcolibri.cbrcore.CBRQuery;
import representation.CaseDescription;

/**
 *
 * @author Felipe
 */
public class CBRTruco {
    
    
    public static CBRQuery pedirEnvido(){
        CBRQuery query = new CBRQuery();
        CaseDescription caseEnvido = new CaseDescription();
        caseEnvido.setRodada(3);
        query.setDescription(caseEnvido);
        
        return query;
    }
}
